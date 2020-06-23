package mod.linguardium.layingboxvanilla;

import mod.linguardium.layingboxvanilla.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VanillaMain implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "layingboxvanilla";
    public static final String MOD_NAME = "LayingBox Vanilla Expansion";

    @Override
    public void onInitialize() {
        ModItems.init();
        //TODO: Initializer
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}