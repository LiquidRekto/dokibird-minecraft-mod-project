package net.dragoons.dokimod.item;

import net.dragoons.dokimod.DokibirdMinecraftMod;
import net.dragoons.dokimod.constants.ItemIds;
import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.entities.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ITEM_DRAGOON_FEATHER = registerItem(ItemIds.ITEM_DRAGOON_FEATHER, new Item(new FabricItemSettings()));
    public static final Item ITEM_DRAGOON_HORN = registerItem(ItemIds.ITEM_DRAGOON_HORN, new Item(new FabricItemSettings()));
    // Dragoon eggs
    public static final Item ITEM_DRAGOON_SPAWN_EGG = registerItem(ItemIds.ITEM_DRAGOON_SPAWN_EGG, new SpawnEggItem(
            ModEntities.ENTITY_DRAGOON, 0xC9B655, 0xBD8911, new FabricItemSettings()
    ));
    public static final Item ITEM_CHONKY_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_CHONKY_GOON_SPAWN_EGG, new SpawnEggItem(
            ModEntities.ENTITY_CHONKY_GOON, 0xC9B655, 0xBD8911, new FabricItemSettings()
    ));
    public static final Item ITEM_LONG_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_LONG_GOON_SPAWN_EGG, new SpawnEggItem(
            ModEntities.ENTITY_LONG_GOON, 0xC9B655, 0xBD8911, new FabricItemSettings()
    ));
    public static final Item ITEM_FERAL_DRAGOON_SPAWN_EGG = registerItem(ItemIds.ITEM_FERAL_DRAGOON_SPAWN_EGG, new SpawnEggItem(
            EntityType.AXOLOTL, 0X5C28B5, 0xF5D536, new FabricItemSettings()
    ));
    public static final Item ITEM_FERAL_CHONKY_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_FERAL_CHONKY_GOON_SPAWN_EGG, new SpawnEggItem(
            EntityType.BAT, 0X5C28B5, 0xF5D536, new FabricItemSettings()
    ));
    public static final Item ITEM_FERAL_LONG_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_FERAL_LONG_GOON_SPAWN_EGG, new SpawnEggItem(
            EntityType.COW, 0X5C28B5, 0xF5D536, new FabricItemSettings()
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mod.MOD_ID, name), item);
    }

    // For registering the items for the INGREDIENT item group
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ITEM_DRAGOON_FEATHER);
        entries.add(ITEM_DRAGOON_HORN);
    }

    // For registering the items for the SPAWN EGG item group
    private static void addItemsToSpawnEggItemGroup(FabricItemGroupEntries entries) {
        entries.add(ITEM_DRAGOON_SPAWN_EGG);
        entries.add(ITEM_CHONKY_GOON_SPAWN_EGG);
        entries.add(ITEM_LONG_GOON_SPAWN_EGG);
        entries.add(ITEM_FERAL_DRAGOON_SPAWN_EGG);
        entries.add(ITEM_FERAL_CHONKY_GOON_SPAWN_EGG);
        entries.add(ITEM_FERAL_LONG_GOON_SPAWN_EGG);
    }


    public static void registerModItems() {
        DokibirdMinecraftMod.LOGGER.info("Registering Mod Items for " + Mod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggItemGroup);
    }
}
