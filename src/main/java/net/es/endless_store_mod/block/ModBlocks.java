package net.es.endless_store_mod.block;

import net.es.endless_store_mod.block.custom.LampProp;
import net.es.endless_store_mod.block.custom.RotateBlock;
import net.es.endless_store_mod.block.custom.ShelvesProp;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.item.ModItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
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
    public static final Block CONCREATE = registerBlock("concreate_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block CONCREATE_SLAB = registerBlock("concreate_slab",
            new SlabBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block YELLOW_CONCREATE = registerBlock("yellow_concreate_block",
            new RotateBlock(AbstractBlock.Settings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block SHELVES = registerBlock("shelves_block",
            new ShelvesProp(AbstractBlock.Settings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.ENDLESS_MOD);
    public static final Block LAMP = registerBlock("lamp",
            new LampProp(AbstractBlock.Settings.of(Material.WOOD).strength(5f).requiresTool().nonOpaque()
                    .luminance(state -> state.get(LampProp.LIT) ? 10 : 0)), ModItemGroup.ENDLESS_MOD);
    

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
