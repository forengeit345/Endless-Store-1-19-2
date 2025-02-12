package net.es.endless_store_mod.world.features;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class PillarFeature extends Feature<DefaultFeatureConfig> {
    public PillarFeature() {
        super(DefaultFeatureConfig.CODEC);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();

        if (!world.isAir(pos) || !world.isAir(pos.up()) || !world.isAir(pos.up(2))) {
            return false;
        }

        world.setBlockState(pos, Blocks.STONE_BRICKS.getDefaultState(), 3);
        world.setBlockState(pos.up(), Blocks.STONE_BRICKS.getDefaultState(), 3);
        world.setBlockState(pos.up(2), Blocks.STONE_BRICKS.getDefaultState(), 3);
        return true;
    }
}