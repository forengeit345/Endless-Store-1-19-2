package net.es.endless_store_mod.registry;

import net.es.endless_store_mod.world.biome.EndlessStoreBiomeKeys;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;


public class EndlessStoreBiomeModificationse {
    public static void register() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(EndlessStoreBiomeKeys.ES_TEST, EndlessStoreBiomeKeys.ES_TEST_BOX, EndlessStoreBiomeKeys.ES_TEST_SPACE),
                GenerationStep.Feature.VEGETAL_DECORATION, EndlessStoreFeatures.PILLAR_PLACED_KEY
        );
    }
}