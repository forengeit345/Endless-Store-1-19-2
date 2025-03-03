package net.es.endless_store_mod.registry;

import net.es.endless_store_mod.world.features.PillarFeature;
import net.es.endless_store_mod.world.features.SinWaveHillFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class EndlessStoreFeatures {
    public static final PillarFeature PILLAR_FEATURE = new PillarFeature();
    public static final Identifier PILLAR_ID = new Identifier("endless_store_mod", "pillar");

    public static final SinWaveHillFeature SIN_WAVE_HILL_FEATURE = new SinWaveHillFeature();
    public static final Identifier SIN_WAVE_HILL_ID = new Identifier("endless_store_mod", "sin_wave_hill");

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, PILLAR_ID, PILLAR_FEATURE);
        Registry.register(Registry.FEATURE, SIN_WAVE_HILL_ID, SIN_WAVE_HILL_FEATURE);
    }
}