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
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.FLOOR_TILES_MULTI_COLORED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.PLITKA_WATER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_CRACKED_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.MOSSY_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.OVERGROWN_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_MOSSY_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.DARK_OVERGROWN_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.YELLOW_CONCREATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.ORANGE_GRANIT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WHITE_BRICK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WHITE_BRICK_ALTERNATIVE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LINOLEUM_LIGHT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.LINOLEUM_BROWN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALLPAPER_YELLOW);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALLPAPER_WHITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.WALLPAPER_BLUE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(EndlessStoreBlocks.METAL_GARAGE_DOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
