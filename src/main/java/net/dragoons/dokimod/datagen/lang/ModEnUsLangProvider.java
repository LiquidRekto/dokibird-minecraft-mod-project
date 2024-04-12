package net.dragoons.dokimod.datagen.lang;

import net.dragoons.dokimod.entities.ModEntities;
import net.dragoons.dokimod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {

    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ITEM_DRAGOON_FEATHER, "Dragoon Feather");
        translationBuilder.add(ModItems.ITEM_DRAGOON_HORN, "Dragoon Horn");

        translationBuilder.add(ModItems.ITEM_DRAGOON_SPAWN_EGG, "Dragoon Spawn Egg");
        translationBuilder.add(ModItems.ITEM_CHONKY_GOON_SPAWN_EGG, "Chonky-goon Spawn Egg");
        translationBuilder.add(ModItems.ITEM_LONG_GOON_SPAWN_EGG, "Long-goon Spawn Egg");

        translationBuilder.add(ModItems.ITEM_FERAL_DRAGOON_SPAWN_EGG, "Feral Dragoon Spawn Egg");
        translationBuilder.add(ModItems.ITEM_FERAL_CHONKY_GOON_SPAWN_EGG, "Feral Chonky-goon Spawn Egg");
        translationBuilder.add(ModItems.ITEM_FERAL_LONG_GOON_SPAWN_EGG, "Feral Long-goon Spawn Egg");

        // Entities
        translationBuilder.add(ModEntities.ENTITY_DRAGOON, "Dragoon");
        translationBuilder.add(ModEntities.ENTITY_CHONKY_GOON, "Chonky-goon");
        translationBuilder.add(ModEntities.ENTITY_LONG_GOON, "Long-goon");
    }
}
