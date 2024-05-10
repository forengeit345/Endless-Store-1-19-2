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
    // Просто блоки
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
    public static final Block METAL_GARAGE_DOOR = registerBlock("metal_garage_door",
            new RotateBlock(Block.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PATTERNED_CARPET= registerBlock("patterned_carpet",
            new CarpetCustom(Block.Settings.of(Material.WOOL).strength(6f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block METAL_PIPE = registerBlock("metal_pipe",
            new MetalPipe(Block.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block METAL_CORNER_PIPE = registerBlock("metal_corner_pipe",
            new MetalCornerPipe(Block.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block SHELVES = registerBlock("shelves_block",
            new ShelvesProp(Block.Settings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    // Блоки с кастомным шейпом
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
    public static final Block FIRE_DETECTER = registerBlock("fire_detecter",
            new FireDetecter(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALL_MAP = registerBlock("wall_map",
            new WallMap(Block.Settings.of(Material.DECORATION).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARGO_TROLLEY = registerBlock("cargo_trolley",
            new CargoTrolley(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARGO_TROLLEY_LONG_TWO_HANDLES = registerBlock("cargo_trolley_long_two_handles",
            new CargoTrolleyLongTwoHandles(Block.Settings.of(Material.METAL).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block BOOK_VARIANT_ONE = registerBlock("book_variant_one",
            new BookVariantOne(Block.Settings.of(Material.DECORATION).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block BOOK_VARIANT_TWO = registerBlock("book_variant_two",
            new BookVariantTwo(Block.Settings.of(Material.DECORATION).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block BOOK_VARIANT_THREE = registerBlock("book_variant_three",
            new BookVariantThree(Block.Settings.of(Material.DECORATION).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block ARMCHAIR = registerBlock("armchair",
            new Armchair(Block.Settings.of(Material.WOOL).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block WARDROBE = registerBlock("wardrobe",
            new Wardrobe(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX = registerBlock("cardboard_box",
            new CardboardBox(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_OPEN = registerBlock("cardboard_box_open",
            new CardboardBox(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_MIDDLE = registerBlock("cardboard_box_middle",
            new CardboardBoxMiddle(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_MIDDLE_OPEN = registerBlock("cardboard_box_middle_open",
            new CardboardBoxMiddle(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_LARGE = registerBlock("cardboard_box_large",
            new CardboardBoxLarge(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_LARGE_OPEN = registerBlock("cardboard_box_large_open",
            new CardboardBoxLarge(Block.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_HUGE = registerBlock("cardboard_box_huge",
            new CardboardBoxHuge(Block.Settings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block CARDBOARD_BOX_HUGE_OPEN = registerBlock("cardboard_box_huge_open",
            new CardboardBoxHuge(Block.Settings.of(Material.WOOD).strength(2f).requiresTool().nonOpaque()), ModItemGroup.ENDLESS_MOD);
    public static final Block TRASH_CAN = registerBlock("trash_can",
            new TrashCan(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PLATE = registerBlock("plate",
            new Plate(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block FUSE_BOX = registerBlock("fuse_box",
            new FuseBox(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block FUSE_BOX_LARGE = registerBlock("fuse_box_large",
            new FuseBoxLarge(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block SAFE = registerBlock("safe",
            new Safe(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block TOOLBOX = registerBlock("toolbox",
            new Toolbox(Block.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);

    // Светяшки и всё что даёт хоть какой-то свет
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
