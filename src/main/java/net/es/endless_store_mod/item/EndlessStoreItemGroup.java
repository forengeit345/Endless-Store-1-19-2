package net.es.endless_store_mod.item;

import net.es.endless_store_mod.EndlessStoreMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class EndlessStoreItemGroup {
    public static final ItemGroup ENDLESS_MOD = FabricItemGroupBuilder.build(
            new Identifier(EndlessStoreMod.MOD_ID, "concrete_crumbs"), () -> new ItemStack(EndlessStoreItems.CONCRETE_CRUMBS));
}
