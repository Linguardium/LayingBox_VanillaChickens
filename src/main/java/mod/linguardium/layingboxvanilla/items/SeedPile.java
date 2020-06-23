package mod.linguardium.layingboxvanilla.items;

import net.minecraft.block.CropBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;
import java.util.stream.Collectors;

public class SeedPile extends Item {
    public SeedPile(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        List<Item> seedList = Registry.ITEM.stream().filter(item ->
            item instanceof AliasedBlockItem && (((AliasedBlockItem) item).getBlock() instanceof CropBlock || ((AliasedBlockItem) item).getBlock() instanceof StemBlock)
        ).collect(Collectors.toList());
        if (seedList.size()>0) {
            ItemScatterer.spawn(world, user.getX(), user.getY(), user.getZ(), new ItemStack(seedList.get(world.random.nextInt(seedList.size()))));
        }else{
            user.sendMessage(new TranslatableText("message.layingboxvanilla.seedpile.noseeds"),false);
        }
        return TypedActionResult.success(stack);
    }
}
