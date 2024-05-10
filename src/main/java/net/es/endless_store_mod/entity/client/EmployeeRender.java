package net.es.endless_store_mod.entity.client;

import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.entity.custom.EmployeeEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EmployeeRender extends GeoEntityRenderer<EmployeeEntity> {
    public EmployeeRender(EntityRendererFactory.Context renderManager) {
        super(renderManager, new EmployeeModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(EmployeeEntity istance) {
        return new Identifier(EndlessStoreMod.MOD_ID, "textures/entity/employee_texture.png");
    }

    @Override
    public RenderLayer getRenderType(EmployeeEntity animatable, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, VertexConsumer buffer, int packedLight, Identifier texture) {
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
