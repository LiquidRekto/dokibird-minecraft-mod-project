package net.dragoons.dokimod.item;

import net.dragoons.dokimod.DokibirdMinecraftMod;
import net.dragoons.dokimod.constants.ItemIds;
import net.dragoons.dokimod.constants.Mod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ITEM_DRAGOON_FEATHER = registerItem(ItemIds.ITEM_DRAGOON_FEATHER, new Item(new FabricItemSettings()));

    // Dragoon eggs
    public static final Item ITEM_DRAGOON_SPAWN_EGG = registerItem(ItemIds.ITEM_DRAGOON_SPAWN_EGG, new Item(new FabricItemSettings()));
    public static final Item ITEM_CHONKY_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_CHONKY_GOON_SPAWN_EGG, new Item(new FabricItemSettings()));
    public static final Item ITEM_LONG_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_LONG_GOON_SPAWN_EGG, new Item(new FabricItemSettings()));
    public static final Item ITEM_FERAL_DRAGOON_SPAWN_EGG = registerItem(ItemIds.ITEM_FERAL_DRAGOON_SPAWN_EGG, new Item(new FabricItemSettings()));
    public static final Item ITEM_FERAL_CHONKY_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_FERAL_CHONKY_GOON_SPAWN_EGG, new Item(new FabricItemSettings()));
    public static final Item ITEM_FERAL_LONG_GOON_SPAWN_EGG = registerItem(ItemIds.ITEM_FERAL_LONG_GOON_SPAWN_EGG, new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Mod.MOD_ID, name), item);
    }

    // For registering the items for the INGREDIENT item group
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ITEM_DRAGOON_FEATHER);
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
