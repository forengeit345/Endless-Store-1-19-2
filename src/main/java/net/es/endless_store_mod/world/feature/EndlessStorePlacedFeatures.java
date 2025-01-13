package net.es.endless_store_mod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class EndlessStorePlacedFeatures {
    public static final RegistryEntry<PlacedFeature> TEST_ORE_PLACED = PlacedFeatures.register("test_ore_placed",
            EndlessStoreConfiguredFeatures.TEST_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> DARK_CONCREATE_GEODE_PLACED = PlacedFeatures.register("dark_concreate_geode_placed",
            EndlessStoreConfiguredFeatures.DARK_CONCREATE_GEODE, RarityFilterPlacementModifier.of(24),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(30)),
            BiomePlacementModifier.of());

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
