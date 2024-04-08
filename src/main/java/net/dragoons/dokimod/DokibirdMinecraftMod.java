package net.dragoons.dokimod;

import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.item.ModItems;
import net.dragoons.dokimod.util.ChatLogger;
import net.fabricmc.api.ModInitializer;

import net.minecraft.network.message.SentMessage;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DokibirdMinecraftMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod.MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Initializing Dokibird Minecraft Mod...");
		
		ModItems.registerModItems();

	}
}