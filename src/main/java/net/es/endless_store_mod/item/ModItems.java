package net.es.endless_store_mod.item;

import net.es.endless_store_mod.EndlessStoreMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item RAW_TANZITE = registerItem("raw_tanzanite",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item TANZITE = registerItem("tanzanite",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EndlessStoreMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EndlessStoreMod.LOGGER.debug("Регистрация модовых предметов для" + EndlessStoreMod.MOD_ID);
    }
}
