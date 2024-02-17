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
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_LIGHT_BLOCK_VERTICAL = registerBlock("laminate_flooring_light_block_vertical",
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_DARK_BLOCK = registerBlock("laminate_flooring_dark_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_MANGROVE_BLOCK = registerBlock("laminate_flooring_mangrove_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMINATE_FLOORING_PINK_BLOCK = registerBlock("laminate_flooring_pink_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block FLOOR_TILES_MULTI_COLORED_BLOCK = registerBlock("floor_tiles_multi_colored_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PLITKA_WATER_BLOCK = registerBlock("plitka_water_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CONCREATE = registerBlock("concreate_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CONCREATE_SLAB = registerBlock("concreate_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block YELLOW_CONCREATE = registerBlock("yellow_concreate_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALLPAPER_YELLOW = registerBlock("wallpaper_yellow",
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALLPAPER_WHITE = registerBlock("wallpaper_white",
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block WALLPAPER_BLUE = registerBlock("wallpaper_blue",
            new RotateBlock(AbstractBlock.Settings.of(Material.WOOD).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PATTERNED_CARPET= registerBlock("patterned_carpet",
            new CarpetCustom(AbstractBlock.Settings.of(Material.WOOL).strength(6f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block METAL_PIPE = registerBlock("metal_pipe",
            new MetalPipe(AbstractBlock.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block METAL_CORNER_PIPE = registerBlock("metal_corner_pipe",
            new MetalCornerPipe(AbstractBlock.Settings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block SHELVES = registerBlock("shelves_block",
            new ShelvesProp(AbstractBlock.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block BASEBOARD = registerBlock("baseboard",
            new Baseboard(AbstractBlock.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block BASEBOARD_CORNER = registerBlock("baseboard_corner",
            new BaseboardCorner(AbstractBlock.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block GRID_VERTICAL = registerBlock("grid_vertical",
            new GridPropVertical(AbstractBlock.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block PLUSH_MOUSE_GRAF = registerBlock("plush_mouse_graf",
            new PlushMouseGraf(AbstractBlock.Settings.of(Material.WOOL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block OUTDOOR_SIGN = registerBlock("outdoor_sign",
            new OutdoorSign(AbstractBlock.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block FIRE_CRANE = registerBlock("fire_crane",
            new FireCrane(AbstractBlock.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block KETTLE = registerBlock("kettle",
            new Kettle(AbstractBlock.Settings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP = registerBlock("lamp",
            new LampProp(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
                    .luminance(state -> state.get(LampProp.LIT) ? 10 : 0)), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP_HIGH = registerBlock("lamp_high",
            new LampHighProp(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
                    .luminance(state -> state.get(LampProp.LIT) ? 14 : 0)), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP_LED = registerBlock("lamp_led",
            new LampLED(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
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
