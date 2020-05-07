package com.artemka091102.navigation;

import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

public class EventsHandler {
    @SubscribeEvent
    public static void onCommonSetup(FMLLoadCompleteEvent event) {
        Registry.BIOME.forEach(e -> YourBiomeFeatures.addOres(e));
    }
}