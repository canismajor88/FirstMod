package com.canismajor88.tutorial.util;

import com.canismajor88.tutorial.TutorialMod;
import com.canismajor88.tutorial.blocks.BlockItemBase;
import com.canismajor88.tutorial.blocks.RubyBlock;
import com.canismajor88.tutorial.blocks.RubyOre;
import com.canismajor88.tutorial.items.ItemBase;
import com.canismajor88.tutorial.tools.sword.RubySword;
import com.canismajor88.tutorial.tools.sword.SwordBase;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TieredItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", RubySword::new);
    //blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<OreBlock> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    //blockItem
    public static final RegistryObject<Item> RUBY_Block_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_Ore_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
}
