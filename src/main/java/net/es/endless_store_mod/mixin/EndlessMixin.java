package net.es.endless_store_mod.mixin;

import net.es.endless_store_mod.EndlessStoreMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class EndlessMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		EndlessStoreMod.LOGGER.info("Эта херовина была напечатана при помози Mixin!");
	}
}
