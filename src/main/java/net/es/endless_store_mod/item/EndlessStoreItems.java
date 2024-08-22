package net.es.endless_store_mod.item;

import net.es.endless_store_mod.EndlessStoreMod;
import net.es.endless_store_mod.entity.EndlessStoreEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class EndlessStoreItems {
    public static final Item WOODEN_BOARD = registerItem("wooden_board",
        new Item(new FabricItemSettings().group(EndlessStoreItemGroup.ENDLESS_MOD)));
    public static final Item CONCREATE_CRUMBS = registerItem("concreate_crumbs",
        new Item(new FabricItemSettings().group(EndlessStoreItemGroup.ENDLESS_MOD)));
    public static final Item EMPLOYEE_SPAWN_EGG = registerItem("employee_spawn_egg",
            new SpawnEggItem(EndlessStoreEntities.EMPLOYEE,0x23b341, 0x12732e,
                    new FabricItemSettings().group(EndlessStoreItemGroup.ENDLESS_MOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EndlessStoreMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EndlessStoreMod.LOGGER.debug("Регистрация ModItems для" + EndlessStoreMod.MOD_ID);
    }
}
