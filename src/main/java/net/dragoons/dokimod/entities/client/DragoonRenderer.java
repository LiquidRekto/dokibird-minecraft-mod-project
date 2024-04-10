package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.entities.custom.DragoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DragoonRenderer extends MobEntityRenderer<DragoonEntity, DragoonModel<DragoonEntity>> {

    private static final Identifier TEXTURE = new Identifier(Mod.MOD_ID, "textures/entity/dragoon.png");
    public DragoonRenderer(EntityRendererFactory.Context context) {
        super(context, new DragoonModel<>(context.getPart(ModModelLayers.ENTITY_DRAGOON)), 0.6f);
    }

    @Override
    public Identifier getTexture(DragoonEntity entity) {
        return TEXTURE;
    }
}
