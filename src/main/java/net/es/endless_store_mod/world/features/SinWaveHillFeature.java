package net.es.endless_store_mod.world.features;

import net.es.endless_store_mod.block.EndlessStoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.noise.OctaveSimplexNoiseSampler;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.minecraft.util.math.random.Random;

import java.util.Collections;
import java.util.List;


public class SinWaveHillFeature extends Feature<DefaultFeatureConfig> {
    private final OctaveSimplexNoiseSampler noiseSampler;

    private static final List<Block> BASE_BLOCKS = List.of(
            EndlessStoreBlocks.CARDBOARD_BOX_HUGE,
            EndlessStoreBlocks.CONCRETE
    );

    private static final float SECONDARY_BLOCK_CHANCE = 0.2F; // 20% шанс добавления
    private static final List<Block> SURFACE_BLOCKS = List.of(
            EndlessStoreBlocks.CARDBOARD_BOX,
            EndlessStoreBlocks.CARDBOARD_BOX_OPEN,
            EndlessStoreBlocks.CARDBOARD_BOX_MIDDLE,
            EndlessStoreBlocks.CARDBOARD_BOX_MIDDLE_OPEN,
            EndlessStoreBlocks.CARDBOARD_BOX_LARGE,
            EndlessStoreBlocks.CARDBOARD_BOX_LARGE_OPEN,
            EndlessStoreBlocks.CARDBOARD_BOX_HUGE_OPEN
    );

    private static final int CHECK_DEPTH = 5;

    public SinWaveHillFeature() {
        super(DefaultFeatureConfig.CODEC);
        this.noiseSampler = new OctaveSimplexNoiseSampler(
                Random.create(), Collections.singletonList(2)
        );
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess world = context.getWorld();
        BlockPos origin = context.getOrigin();
        Random random = context.getRandom();

        int radius = 13;
        double maxHeight = 12.0;
        double baseWidth = 0.055;

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                double distance = Math.sqrt(x*x + z*z) / radius;
                if (distance > 1.0) continue;

                BlockPos pos = origin.add(x, 0, z);
                int surfaceY = world.getTopY(Heightmap.Type.WORLD_SURFACE, pos.getX(), pos.getZ());
                double noise = noiseSampler.sample(
                        pos.getX() * baseWidth,
                        pos.getZ() * baseWidth,
                        true
                ) * (1.0 - distance * distance);

                int height = (int)(noise * maxHeight);
                int lastY = -1;

                for (int y = 0; y < height; y++) {
                    BlockPos blockPos = pos.withY(surfaceY + y);

                    if(y == 0 && !hasValidBase(world, blockPos)) {
                        break;
                    }

                    if (world.isAir(blockPos)) {
                        world.setBlockState(blockPos, EndlessStoreBlocks.CARDBOARD_BOX_HUGE.getDefaultState(), 3);
                        lastY = surfaceY + y;
                    }
                }

                if (lastY != -1 && random.nextFloat() < SECONDARY_BLOCK_CHANCE) {
                    BlockPos topPos = pos.withY(lastY + 1);
                    if (world.isAir(topPos)) {
                        Block surfaceBlock = getRandomSurfaceBlock(random);
                        world.setBlockState(topPos, surfaceBlock.getDefaultState(), 3);
                    }
                }
            }
        }
        return true;
    }

    private boolean hasValidBase(StructureWorldAccess world, BlockPos pos) {
        for(int dy = 0; dy < CHECK_DEPTH; dy++) {
            BlockPos checkPos = pos.down(dy + 1);
            Block block = world.getBlockState(checkPos).getBlock();

            if(BASE_BLOCKS.contains(block)) {return true;}
            if(!world.isAir(checkPos)) {return false;}
        }
        return false;
    }

    private Block getRandomSurfaceBlock(Random random) {
        return SURFACE_BLOCKS.get(random.nextInt(SURFACE_BLOCKS.size()));
    }
}

// TODO: Что-то сделать с этим кодом т.к. генерируемые структуры очень интересные

//    private static final double SCALE = 0.007;
//    private static final int OCTAVES = 4;
//    private static final double HEIGHT_MULTIPLIER = 14.0;
//
//    private final PerlinNoiseSampler noise;
//
//    public SinWaveHillFeature() {
//        super(DefaultFeatureConfig.CODEC);
//        this.noise = new PerlinNoiseSampler(new CheckedRandom(0L));
//    }
//
//    @Override
//    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
//        StructureWorldAccess world = context.getWorld();
//        BlockPos origin = context.getOrigin();
//        Random random = context.getRandom();
//
//        long seed = (long)(origin.getX() * SCALE * 1000) ^ (long)(origin.getZ() * SCALE * 1000);
//        CheckedRandom hillRandom = new CheckedRandom(seed);
//
//        for (int x = 0; x < 16; x++) {
//            for (int z = 0; z < 16; z++) {
//                BlockPos pos = origin.add(x, 0, z);
//                int surfaceY = world.getTopY(Heightmap.Type.WORLD_SURFACE, pos.getX(), pos.getZ());
//
//                double noiseValue = 0.0;
//                double amplitude = 1.0;
//                double frequency = SCALE;
//
//                for (int i = 0; i < OCTAVES; i++) {
//                    noiseValue += noise.sample(
//                            pos.getX() * frequency,
//                            pos.getZ() * frequency,
//                            hillRandom.nextDouble() * 100
//                    ) * amplitude;
//
//                    amplitude *= 0.5;
//                    frequency *= 2.0;
//                }
//
//                double height = MathHelper.clamp(
//                        noiseValue * HEIGHT_MULTIPLIER,
//                        2.0,
//                        HEIGHT_MULTIPLIER
//                );
//
//                for (int y = 0; y < height; y++) {
//                    double gradient = 1.0 - (double)y / height;
//                    if (random.nextDouble() < gradient * 0.85) {
//                        BlockPos blockPos = pos.withY(surfaceY + y);
//                        if (world.isAir(blockPos)) {
//                            world.setBlockState(blockPos, Blocks.STONE_BRICKS.getDefaultState(), 3);
//                        }
//                    }
//                }
//            }
//        }
//        return true;
//    }
//}