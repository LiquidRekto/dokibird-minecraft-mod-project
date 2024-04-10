package net.dragoons.dokimod;

import net.dragoons.dokimod.entities.ModEntities;
import net.dragoons.dokimod.entities.client.DragoonModel;
import net.dragoons.dokimod.entities.client.DragoonRenderer;
import net.dragoons.dokimod.entities.client.ModModelLayers;
import net.dragoons.dokimod.util.ChatLogger;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class DokibirdMinecraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.ENTITY_DRAGOON, DragoonRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ENTITY_DRAGOON, DragoonModel::getTexturedModelData);
    }
}
