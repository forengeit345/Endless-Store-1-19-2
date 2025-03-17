package net.es.endless_store_mod.datagen;

import net.es.endless_store_mod.block.EndlessStoreBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class EndlessStoreModelProvider extends FabricModelProvider {
    public EndlessStoreModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LAMINATE_FLOORING_LIGHT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LAMINATE_FLOORING_LIGHT_VERTICAL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LAMINATE_FLOORING_DARK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LAMINATE_FLOORING_MANGROVE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LAMINATE_FLOORING_WHITE);
        blockStateModelGenerator.registerRotatable(EndlessStoreBlocks.FLOOR_TILES_MULTI_COLORED);
        blockStateModelGenerator.registerRotatable(EndlessStoreBlocks.PLITKA_WATER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_CRACKED_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.MOSSY_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.OVERGROWN_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_MOSSY_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_OVERGROWN_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.YELLOW_CONCRETE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.ORANGE_GRANIT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WHITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WHITE_BRICK_ALTERNATIVE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LINOLEUM_LIGHT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LINOLEUM_BROWN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALLPAPER_YELLOW);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALLPAPER_WHITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALLPAPER_BLUE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.METAL_GARAGE_DOOR);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LITERALLY_NOTHING);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.CEILING_TILES_WHITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.CEILING_TILES_WHITE_ANOTHER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALL_BLUE_TILES);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.TILES_WITH_BLACK_INCLUSIONS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.PLASTIC_GARBAGE_COLORED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.PLASTIC_GARBAGE_GREY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.PLASTIC_GARBAGE_BLUE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
