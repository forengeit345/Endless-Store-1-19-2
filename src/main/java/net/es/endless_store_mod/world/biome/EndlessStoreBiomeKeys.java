package net.es.endless_store_mod.world.biome;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public abstract class EndlessStoreBiomeKeys {
    public static final RegistryKey<Biome> TEST = register("plains");
    public static final RegistryKey<Biome> ES_TEST = register("es_test");
    public static final RegistryKey<Biome> ES_TEST_BOX = register("es_test_box");
    public static final RegistryKey<Biome> ES_TEST_SPACE = register("es_test_space");

    public EndlessStoreBiomeKeys() {
    }

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
}