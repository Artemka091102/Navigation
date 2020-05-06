package com.artemka091102.navigation;

import com.artemka091102.navigation.lists.ItemList;
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
                ItemList.magnesite = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(location("magnesite"))
            );
        }
        private static ResourceLocation location(String name){
            return new ResourceLocation(MODID, name);
        }
    }
}