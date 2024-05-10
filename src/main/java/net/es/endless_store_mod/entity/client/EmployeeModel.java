package net.es.endless_store_mod.entity.client;

import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.entity.custom.EmployeeEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EmployeeModel extends AnimatedGeoModel<EmployeeEntity> {
    @Override
    public Identifier getModelResource(EmployeeEntity object) {
        return new Identifier(EndlessStoreMod.MOD_ID, "geo/employee.geo.json");
    }

    @Override
    public Identifier getTextureResource(EmployeeEntity object) {
        return new Identifier(EndlessStoreMod.MOD_ID, "textures/entity/employee_texture.png");
    }

    @Override
    public Identifier getAnimationResource(EmployeeEntity animatable) {
        return new Identifier(EndlessStoreMod.MOD_ID, "animations/employee.animation.json");
    }
}
