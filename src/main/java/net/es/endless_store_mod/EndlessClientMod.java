package net.es.endless_store_mod;

import net.es.endless_store_mod.block.EndlessStoreBlocks;
import net.es.endless_store_mod.entity.EndlessStoreEntities;
import net.es.endless_store_mod.entity.client.EmployeeRender;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class EndlessClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EndlessStoreEntities.EMPLOYEE, EmployeeRender::new);

        BlockRenderLayerMap.INSTANCE.putBlock(EndlessStoreBlocks.GRID_VERTICAL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EndlessStoreBlocks.FIRE_CRANE, RenderLayer.getCutout());
    }
}
