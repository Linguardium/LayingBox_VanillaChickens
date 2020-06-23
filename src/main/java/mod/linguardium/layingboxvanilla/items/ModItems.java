package mod.linguardium.layingboxvanilla.items;

import net.fabricmc.fabric.impl.content.registry.FuelRegistryImpl;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static mod.linguardium.layingboxvanilla.VanillaMain.MOD_ID;

public class ModItems {
    public static final Item LAVA_NUGGET = Registry.register(Registry.ITEM,new Identifier(MOD_ID,"lava_nugget"),new Item(new Item.Settings().maxCount(8).group(ItemGroup.MISC)));
    public static final Item DIAMOND_SHARD = Registry.register(Registry.ITEM,new Identifier(MOD_ID,"diamond_shard"),new Item(new Item.Settings().maxCount(8).group(ItemGroup.MISC)));
    public static final Item EMERALD_SHARD = Registry.register(Registry.ITEM,new Identifier(MOD_ID,"emerald_shard"),new Item(new Item.Settings().maxCount(8).group(ItemGroup.MISC)));
    public static final SeedPile SEED_COLLECTION = Registry.register(Registry.ITEM,new Identifier(MOD_ID,"seed_collection"),new SeedPile(new Item.Settings().maxCount(64).group(ItemGroup.MISC)));
    public static void init() {
        FuelRegistryImpl.INSTANCE.add(LAVA_NUGGET,2500);
    }

}
