package net.es.endless_store_mod.world.dimension;

import net.es.endless_store_mod.EndlessStoreMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;


public class EndlessStoreDimension {
    public static final RegistryKey<World> ESDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(EndlessStoreMod.MOD_ID, "esdim"));
    public static final RegistryKey<DimensionType> ESDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, ESDIM_DIMENSION_KEY.getValue());



    public static void register(){
        EndlessStoreMod.LOGGER.debug("Registering EndlessStoreDimension for" + EndlessStoreMod.MOD_ID);
    }
}
