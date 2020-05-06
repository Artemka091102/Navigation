package com.artemka091102.navigation;

import com.artemka091102.navigation.lists.BlockList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class YourBiomeFeatures {
    public static void addOres(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.magnetite_ore.getDefaultState(), 7), Placement.COUNT_RANGE, new CountRangeConfig(100, 0, 0, 64)));
    }
}