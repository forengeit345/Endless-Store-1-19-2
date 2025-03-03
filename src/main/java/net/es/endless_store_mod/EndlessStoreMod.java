package net.es.endless_store_mod;

import net.es.endless_store_mod.registry.EndlessStoreFeatures;
import net.es.endless_store_mod.world.dimension.EndlessStoreDimension;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.es.endless_store_mod.block.EndlessStoreBlocks;
import net.es.endless_store_mod.entity.EndlessStoreEntities;
import net.es.endless_store_mod.entity.custom.EmployeeEntity;
import net.es.endless_store_mod.item.EndlessStoreItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class EndlessStoreMod implements ModInitializer {
	public static final String MOD_ID = "endless_store_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		EndlessStoreItems.registerModItems();
		EndlessStoreBlocks.registerModBlocks();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(EndlessStoreEntities.EMPLOYEE, EmployeeEntity.setAttributes());

		EndlessStoreFeatures.registerFeatures();

		EndlessStoreDimension.register();
	}
}
