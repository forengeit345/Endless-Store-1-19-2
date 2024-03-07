package net.es.endless_store_mod.block;

import net.es.endless_store_mod.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block LAMINATE_FLOORING_LIGHT_BLOCK = registerBlock("laminate_flooring_light_block",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_LIGHT_BLOCK_VERTICAL = registerBlock("laminate_flooring_light_block_vertical",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_DARK_BLOCK = registerBlock("laminate_flooring_dark_block",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_MANGROVE_BLOCK = registerBlock("laminate_flooring_mangrove_block",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_PINK_BLOCK = registerBlock("laminate_flooring_pink_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block FLOOR_TILES_MULTI_COLORED_BLOCK = registerBlock("floor_tiles_multi_colored_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PLITKA_WATER_BLOCK = registerBlock("plitka_water_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CONCREATE = registerBlock("concreate_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block DARK_CONCREATE = registerBlock("dark_concreate_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CONCREATE_SLAB = registerBlock("concreate_slab",
            new SlabBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CONCREATE_STAIRS = registerBlock("concreate_stairs",
            new ModStairsBlock(ModBlocks.CONCREATE.getDefaultState(), Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block DARK_CONCREATE_SLAB = registerBlock("dark_concreate_slab",
            new SlabBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block DARK_CONCREATE_STAIRS = registerBlock("dark_concreate_stairs",
            new ModStairsBlock(ModBlocks.DARK_CONCREATE.getDefaultState(), Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block YELLOW_CONCREATE = registerBlock("yellow_concreate_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block ORANGE_GRANIT_BLOCK = registerBlock("orange_granit_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WHITE_BRICK_BLOCK = registerBlock("white_brick_block",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WHITE_BRICK_BLOCK_ALTERNATIVE = registerBlock("white_brick_block_alternative",
            new RotateBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            new SlabBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WHITE_BRICK_STAIRS_ES = registerBlock("white_brick_stairs_es",
            new ModStairsBlock(ModBlocks.WHITE_BRICK_BLOCK.getDefaultState(), Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WHITE_BRICK_SLAB_ALTERNATIVE = registerBlock("white_brick_slab_alternative",
            new SlabBlock(Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WHITE_BRICK_STAIRS_ALTERNATIVE = registerBlock("white_brick_stairs_alternative",
            new ModStairsBlock(ModBlocks.WHITE_BRICK_BLOCK_ALTERNATIVE.getDefaultState(), Block.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_LIGHT = registerBlock("laminate_light",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_BROWN = registerBlock("laminate_brown",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALLPAPER_YELLOW = registerBlock("wallpaper_yellow",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALLPAPER_WHITE = registerBlock("wallpaper_white",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALLPAPER_BLUE = registerBlock("wallpaper_blue",
            new RotateBlock(Block.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PATTERNED_CARPET= registerBlock("patterned_carpet",
            new CarpetCustom(Block.Settings.of(Material.WOOL).strength(6f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block METAL_PIPE = registerBlock("metal_pipe",
            new MetalPipe(Block.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block METAL_CORNER_PIPE = registerBlock("metal_corner_pipe",
            new MetalCornerPipe(Block.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block SHELVES = registerBlock("shelves_block",
            new ShelvesProp(Block.Settings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block BASEBOARD = registerBlock("baseboard",
            new Baseboard(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block BASEBOARD_CORNER = registerBlock("baseboard_corner",
            new BaseboardCorner(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block GRID_VERTICAL = registerBlock("grid_vertical",
            new GridPropVertical(Block.Settings.of(Material.METAL).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block PLUSH_MOUSE_GRAF = registerBlock("plush_mouse_graf",
            new PlushMouseGraf(Block.Settings.of(Material.WOOL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block OUTDOOR_SIGN = registerBlock("outdoor_sign",
            new OutdoorSign(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block FIRE_CRANE = registerBlock("fire_crane",
            new FireCrane(Block.Settings.of(Material.METAL).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block KETTLE = registerBlock("kettle",
            new Kettle(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALL_CLOCK = registerBlock("wall_clock",
            new WallClock(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PALLET = registerBlock("pallet",
            new Pallet(Block.Settings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP = registerBlock("lamp",
            new LampProp(Block.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
                    .luminance(state -> state.get(LampProp.LIT) ? 10 : 0)), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP_HIGH = registerBlock("lamp_high",
            new LampHighProp(Block.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
                    .luminance(state -> state.get(LampProp.LIT) ? 14 : 0)), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP_LED = registerBlock("lamp_led",
            new LampLED(Block.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
                    .luminance(state -> state.get(LampProp.LIT) ? 14 : 0)), ModItemGroup.ENDLESS_MOD);
    

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(EndlessStoreMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(EndlessStoreMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        EndlessStoreMod.LOGGER.debug("Регистрация ModBlocks для" + EndlessStoreMod.MOD_ID);
    }
}
