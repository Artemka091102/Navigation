package com.artemka091102.navigation;

import net.minecraft.item.Item;
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

        }
    }
}