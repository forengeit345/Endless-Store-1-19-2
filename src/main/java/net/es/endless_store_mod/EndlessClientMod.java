package net.es.endless_store_mod;

import net.es.endless_store_mod.entity.EndlessStoreEntities;
import net.es.endless_store_mod.entity.client.EmployeeRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class EndlessClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EndlessStoreEntities.EMPLOYEE, EmployeeRender::new);
    }
}
