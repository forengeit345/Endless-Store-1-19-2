package net.es.endless_store_mod.registry;

import net.es.endless_store_mod.world.features.HillsOfBoxes;
import net.es.endless_store_mod.world.features.SinWaveHillFeature;
import net.es.endless_store_mod.world.features.TrashLandfill;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class EndlessStoreFeatures {
    public static final SinWaveHillFeature SIN_WAVE_HILL_FEATURE = new SinWaveHillFeature();
    public static final Identifier SIN_WAVE_HILL_ID = new Identifier("endless_store_mod", "sin_wave_hill");

    public static final HillsOfBoxes HILLS_OF_BOXES  = new HillsOfBoxes();
    public static final Identifier HILLS_OF_BOXES_ID = new Identifier("endless_store_mod", "hills_of_boxes");

    public static final TrashLandfill TRASH_LANDFILL  = new TrashLandfill();
    public static final Identifier TRASH_LANDFILL_ID = new Identifier("endless_store_mod", "trash_landfill");

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, SIN_WAVE_HILL_ID, SIN_WAVE_HILL_FEATURE);
        Registry.register(Registry.FEATURE, HILLS_OF_BOXES_ID, HILLS_OF_BOXES);
        Registry.register(Registry.FEATURE, TRASH_LANDFILL_ID, TRASH_LANDFILL);
    }
}