package com.canismajor88.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
