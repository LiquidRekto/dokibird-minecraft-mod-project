package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.entities.custom.ChonkyGoonEntity;
import net.dragoons.dokimod.entities.custom.DragoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ChonkyGoonRenderer extends MobEntityRenderer<ChonkyGoonEntity, ChonkyGoonModel<ChonkyGoonEntity>> {

    private static final Identifier TEXTURE = new Identifier(Mod.MOD_ID, "textures/entity/chonky-goon.png");
    public ChonkyGoonRenderer(EntityRendererFactory.Context context) {
        super(context, new ChonkyGoonModel<>(context.getPart(ModModelLayers.ENTITY_CHONKY_GOON)), 0.6f);
    }

    @Override
    public Identifier getTexture(ChonkyGoonEntity entity) {
        return TEXTURE;
    }
}
