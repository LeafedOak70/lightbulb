package com.leaf;

import com.leaf.block.ModBlocks;
import com.leaf.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightBulb implements ModInitializer {

    public static final String MOD_ID = "lightbulb";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        LOGGER.info("Hello Fabric world!");
    }
}