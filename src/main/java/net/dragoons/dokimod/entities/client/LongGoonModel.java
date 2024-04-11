package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.entities.custom.ChonkyGoonEntity;
import net.dragoons.dokimod.entities.custom.LongGoonEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class LongGoonModel <T extends LongGoonEntity> extends SinglePartEntityModel<T> {
	private final ModelPart longGoonModel;
	public LongGoonModel(ModelPart root) {
		this.longGoonModel = root.getChild("longGoonModel");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData longGoonModel = modelPartData.addChild("longGoonModel", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -4.0F, -4.0F, 10.0F, 8.0F, 12.0F, new Dilation(0.0F))
				.uv(25, 28).cuboid(-3.0F, -12.0F, -3.0F, 6.0F, 8.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 20).cuboid(-4.0F, -18.0F, -4.0F, 8.0F, 6.0F, 7.0F, new Dilation(0.0F))
				.uv(0, 6).cuboid(-4.0F, 4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(2.0F, 4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 16.0F, 0.0F));

		ModelPartData combSmall_r1 = longGoonModel.addChild("combSmall_r1", ModelPartBuilder.create().uv(32, 8).cuboid(-2.0F, -24.0F, -12.0F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(23, 20).cuboid(-3.0F, -24.0F, -15.0F, 6.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, -2.0F, -0.6109F, 0.0F, 0.0F));

		ModelPartData tail_r1 = longGoonModel.addChild("tail_r1", ModelPartBuilder.create().uv(9, 33).cuboid(4.0F, -7.0F, 4.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, -2.0F, -0.3038F, -0.762F, 0.2132F));

		ModelPartData lWing_r1 = longGoonModel.addChild("lWing_r1", ModelPartBuilder.create().uv(32, 0).cuboid(5.0F, -6.0F, 2.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 33).cuboid(-7.0F, -6.0F, 2.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, -2.0F, 0.6109F, 0.0F, 0.0F));

		ModelPartData beak_r1 = longGoonModel.addChild("beak_r1", ModelPartBuilder.create().uv(14, 38).cuboid(-1.0F, -15.0F, -6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, -10.0F, -0.7854F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		longGoonModel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return longGoonModel;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}