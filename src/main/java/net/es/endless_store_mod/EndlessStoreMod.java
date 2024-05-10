package net.es.endless_store_mod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.es.endless_store_mod.block.ModBlocks;
import net.es.endless_store_mod.entity.ModEntities;
import net.es.endless_store_mod.entity.custom.EmployeeEntity;
import net.es.endless_store_mod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class EndlessStoreMod implements ModInitializer {
	public static final String MOD_ID = "endless_store_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.EMPLOYEE, EmployeeEntity.setAttributes());
	}
}
