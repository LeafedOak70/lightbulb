package com.leaf.item;

import com.leaf.LightBulb;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(LightBulb.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));

}
