package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.entities.custom.DragoonEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class DragoonModel<T extends DragoonEntity> extends SinglePartEntityModel<T> {

	private final ModelPart dragoonModel;
	public DragoonModel(ModelPart root) {
		this.dragoonModel = root.getChild("DragoonModel");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData DragoonModel = modelPartData.addChild("DragoonModel", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 7.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, 0.0F));

		ModelPartData combSmall_r1 = DragoonModel.addChild("combSmall_r1", ModelPartBuilder.create().uv(0, 22).cuboid(-2.0F, -12.0F, -4.0F, 4.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 15).cuboid(-3.0F, -12.0F, -7.0F, 6.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, -2.0F, -0.6109F, 0.0F, 0.0F));

		ModelPartData tail_r1 = DragoonModel.addChild("tail_r1", ModelPartBuilder.create().uv(14, 18).cuboid(1.0F, -7.0F, 1.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, -2.0F, -0.3038F, -0.762F, 0.2132F));

		ModelPartData lWing_r1 = DragoonModel.addChild("lWing_r1", ModelPartBuilder.create().uv(8, 23).cuboid(4.0F, -8.0F, -1.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
				.uv(18, 23).cuboid(-5.0F, -8.0F, -1.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, -2.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData beak_r1 = DragoonModel.addChild("beak_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -5.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, -10.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData leg1 = DragoonModel.addChild("leg1", ModelPartBuilder.create().uv(4, 4).cuboid(-2.0F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(4, 0).cuboid(-2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 7.0F, -2.0F));

		ModelPartData leg2 = DragoonModel.addChild("leg2", ModelPartBuilder.create().uv(0, 4).cuboid(1.0F, -4.0F, 2.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 4).cuboid(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 7.0F, -2.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		dragoonModel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return dragoonModel;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}