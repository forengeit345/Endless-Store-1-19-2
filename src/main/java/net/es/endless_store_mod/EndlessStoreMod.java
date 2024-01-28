package net.es.endless_store_mod;

import net.es.endless_store_mod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndlessStoreMod implements ModInitializer {
	public static final String MOD_ID = "endless_store_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
