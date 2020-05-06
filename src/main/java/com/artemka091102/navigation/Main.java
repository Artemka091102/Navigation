package com.artemka091102.navigation;

import com.artemka091102.navigation.lists.BlockList;
import com.artemka091102.navigation.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "navigation";

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class Registry{

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                BlockList.magnesite_ore = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(new ResourceLocation(MODID, "magnesite_ore"))
            );
        }

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                ItemList.magnesite = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(new ResourceLocation(MODID, "magnesite")),
                ItemList.magnesite_ore = new BlockItem(BlockList.magnesite_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(new ResourceLocation(MODID, "magnesite_ore"))
            );
        }
    }
}

//assets/minecraft/textures/map/map_icons.png