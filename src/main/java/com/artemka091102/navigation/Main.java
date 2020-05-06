package com.artemka091102.navigation;

import com.artemka091102.navigation.lists.BlockList;
import com.artemka091102.navigation.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
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
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                ItemList.magnesite = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(location("magnesite")),
                ItemList.magnesite_ore = new BlockItem(BlockList.magnesite_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.magnesite_ore.getRegistryName())
            );
        }

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                BlockList.magnesite_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).lightValue(0).sound(SoundType.STONE)).setRegistryName(location("magnesite_ore"))
            );
        }

        private static ResourceLocation location(String name){
            return new ResourceLocation(MODID, name);
        }
    }
}