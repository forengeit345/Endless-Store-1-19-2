package net.es.endless_store_mod.entity;

import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.entity.custom.EmployeeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<EmployeeEntity> EMPLOYEE = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(EndlessStoreMod.MOD_ID, "employee"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EmployeeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.6f)).build());


}
