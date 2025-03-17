package net.es.endless_store_mod.world.features;

import net.es.endless_store_mod.block.EndlessStoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import java.util.List;


public class TrashLandfill extends Feature<DefaultFeatureConfig> {
    private static final List<Block> SURFACE_BLOCKS = List.of(
            EndlessStoreBlocks.PLASTIC_GARBAGE_BLUE,
            EndlessStoreBlocks.PLASTIC_GARBAGE_COLORED
    );

    public TrashLandfill() {
        super(DefaultFeatureConfig.CODEC);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        if (context.getWorld().isClient()) return false;

        StructureWorldAccess world = context.getWorld();
        BlockPos origin = context.getOrigin();
        Random random = context.getRandom();

        int radius = 9 + random.nextInt(6);
        int maxHeight = 4 + random.nextInt(4);

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                BlockPos pos = origin.add(x, 0, z);
                double distance = Math.sqrt(x * x + z * z) / radius;

                if (distance > 1.0) continue;

                double heightFactor = 1 - distance * distance;
                int height = (int) (heightFactor * maxHeight);

                height += random.nextInt(2) * 2 - 1;

                for (int y = 0; y < height; y++) {
                    BlockPos terrainPos = pos.up(y);
                    if (world.getBlockState(terrainPos.down()).isOpaque()) {
                        world.setBlockState(terrainPos, EndlessStoreBlocks.PLASTIC_GARBAGE_GREY.getDefaultState(), 3);
                    }
                }

                if (random.nextInt(10) >= 2) {
                    BlockPos surfacePos = pos.up(height);
                    BlockState currentState = world.getBlockState(surfacePos);

                    if (currentState.isOf(EndlessStoreBlocks.PLASTIC_GARBAGE_GREY)) {
                        Block selectedBlock = SURFACE_BLOCKS.get(random.nextInt(SURFACE_BLOCKS.size()));
                        world.setBlockState(surfacePos, selectedBlock.getDefaultState(), 3);
                    }
                }
            }
        }

        return true;
    }
}