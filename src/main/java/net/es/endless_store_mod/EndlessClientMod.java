package net.es.endless_store_mod;

import net.es.endless_store_mod.block.ModBlocks;
import net.es.endless_store_mod.entity.ModEntities;
import net.es.endless_store_mod.entity.client.EmployeeRender;
import net.es.endless_store_mod.entity.custom.EmployeeEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class EndlessClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.EMPLOYEE, EmployeeRender::new);
    }
}
