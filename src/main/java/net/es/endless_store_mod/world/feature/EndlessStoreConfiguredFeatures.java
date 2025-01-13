package net.es.endless_store_mod.world.feature;

import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.block.EndlessStoreBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;


public class EndlessStoreConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> TEST_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, EndlessStoreBlocks.DARK_CRACKED_CONCREATE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, EndlessStoreBlocks.DARK_CRACKED_CONCREATE.getDefaultState()));
    
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TEST_ORE =
            ConfiguredFeatures.register("test_ore", Feature.ORE, new OreFeatureConfig(TEST_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<GeodeFeatureConfig, ?>> DARK_CONCREATE_GEODE =
            ConfiguredFeatures.register("dark_concreate_geode", Feature.GEODE,
                    new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                            BlockStateProvider.of(Blocks.DEEPSLATE),
                            BlockStateProvider.of(EndlessStoreBlocks.DARK_CONCREATE),
                            BlockStateProvider.of(EndlessStoreBlocks.DARK_CONCREATE),
                            BlockStateProvider.of(Blocks.EMERALD_BLOCK),
                            List.of(EndlessStoreBlocks.CONCREATE.getDefaultState()),
                            BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                            new GeodeLayerThicknessConfig(1.7D, 1.2D, 2.5D, 3.5D),
                            new GeodeCrackConfig(0.25D, 1.5D, 1),
                            0.5D, 0.1D,
                            true, UniformIntProvider.create(3, 8),
                            UniformIntProvider.create(2, 6), UniformIntProvider.create(1, 2),
                            -18, 18, 0.075D, 1));

    public static void registerConfiguredFeatures() {
        EndlessStoreMod.LOGGER.debug("Registering the EndlessStoreConfiguredFeatures for" + EndlessStoreMod.MOD_ID);
    }
}
