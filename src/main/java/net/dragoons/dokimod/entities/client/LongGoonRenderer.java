package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.constants.Mod;
import net.dragoons.dokimod.entities.custom.ChonkyGoonEntity;
import net.dragoons.dokimod.entities.custom.LongGoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class LongGoonRenderer extends MobEntityRenderer<LongGoonEntity, LongGoonModel<LongGoonEntity>> {

    private static final Identifier TEXTURE = new Identifier(Mod.MOD_ID, "textures/entity/long-goon.png");
    public LongGoonRenderer(EntityRendererFactory.Context context) {
        super(context, new LongGoonModel<>(context.getPart(ModModelLayers.ENTITY_LONG_GOON)), 0.6f);
    }

    @Override
    public Identifier getTexture(LongGoonEntity entity) {
        return TEXTURE;
    }
}
