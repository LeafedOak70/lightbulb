package com.leaf.block;

import com.leaf.LightBulb;
import com.leaf.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);
    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);
    public static final Block FRAMED_GLASS = registerBlock("framed_glass",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f)), ModItemGroup.TANZANITE);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(LightBulb.MOD_ID, name),block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(LightBulb.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }




    public static void registerModBlocks(){
        LightBulb.LOGGER.debug("Registering mod blocks for " + LightBulb.MOD_ID);
    }
}
