package net.dragoons.dokimod;

import net.dragoons.dokimod.datagen.loottable.ModLootTableProvider;
import net.dragoons.dokimod.datagen.ModModelProvider;
import net.dragoons.dokimod.datagen.lang.ModEnUsLangProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DokibirdMinecraftModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);

		// Languages
		pack.addProvider(ModEnUsLangProvider::new);
	}
}
