package net.dragoons.dokimod.datagen;

import net.dragoons.dokimod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ITEM_DRAGOON_FEATHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ITEM_DRAGOON_HORN, Models.GENERATED);
        // Spawn Eggs
        // Dragoons
        itemModelGenerator.register(ModItems.ITEM_DRAGOON_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.ITEM_CHONKY_GOON_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.ITEM_LONG_GOON_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        // Feral Dragoons
        itemModelGenerator.register(ModItems.ITEM_FERAL_DRAGOON_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.ITEM_FERAL_CHONKY_GOON_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.ITEM_FERAL_LONG_GOON_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
    }
}
