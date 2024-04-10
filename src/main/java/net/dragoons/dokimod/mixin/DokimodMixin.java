package net.dragoons.dokimod.mixin;

import net.dragoons.dokimod.util.ChatLogger;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class DokimodMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadWorld()V
		/*
		ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
			ChatLogger.loadPlayer(MinecraftClient.getInstance().player);
			ChatLogger.log("Welcome to Dokibird mod!");
			ChatLogger.warn("This is for warning message");
			ChatLogger.error("This is for error message");
		});
		*/

	}

}