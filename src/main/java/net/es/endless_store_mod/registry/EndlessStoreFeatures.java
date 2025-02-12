package net.es.endless_store_mod.registry;

import net.es.endless_store_mod.world.features.PillarFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;


public class EndlessStoreFeatures {
    public static final PillarFeature PILLAR_FEATURE = new PillarFeature();
    public static final Identifier PILLAR_ID = new Identifier("endless_store_mod", "pillar");
    public static final RegistryKey<PlacedFeature> PILLAR_PLACED_KEY = RegistryKey.of(Registry.PLACED_FEATURE_KEY, PILLAR_ID);

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, PILLAR_ID, PILLAR_FEATURE);
    }
//    TODO: код работает, но не в нужном измерении, надо фиксануть, думается мне дело в WORLD_SURFACE_WG
}