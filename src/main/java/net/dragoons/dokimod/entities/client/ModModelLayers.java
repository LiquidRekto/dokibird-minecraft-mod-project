package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.constants.Mod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer ENTITY_DRAGOON =
            new EntityModelLayer(new Identifier(Mod.MOD_ID, "dragoon"), "main");
}
