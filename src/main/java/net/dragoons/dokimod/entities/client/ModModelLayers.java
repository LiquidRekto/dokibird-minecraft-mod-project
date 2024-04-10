package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.constants.EntityIds;
import net.dragoons.dokimod.constants.Mod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer ENTITY_DRAGOON =
            new EntityModelLayer(new Identifier(Mod.MOD_ID, EntityIds.ENTITY_DRAGOON), "main");

    public static final EntityModelLayer ENTITY_CHONKY_GOON =
            new EntityModelLayer(new Identifier(Mod.MOD_ID, EntityIds.ENTITY_CHONKY_GOON), "main");
}
