package net.dragoons.dokimod.entities.client;

import net.dragoons.dokimod.entities.custom.ChonkyGoonEntity;
import net.dragoons.dokimod.entities.custom.DragoonEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class ChonkyGoonModel<T extends ChonkyGoonEntity> extends SinglePartEntityModel<T> {
	private final ModelPart chonkyGoonModel;
	public ChonkyGoonModel(ModelPart root) {
		this.chonkyGoonModel = root.getChild("ChonkyGoonModel");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData ChonkyGoonModel = modelPartData.addChild("ChonkyGoonModel", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -25.0F, -6.0F, 22.0F, 21.0F, 22.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData lHorn_r1 = ChonkyGoonModel.addChild("lHorn_r1", ModelPartBuilder.create().uv(0, 43).cuboid(4.0F, -31.0F, 5.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.3491F));

		ModelPartData rHorn_r1 = ChonkyGoonModel.addChild("rHorn_r1", ModelPartBuilder.create().uv(0, 50).cuboid(8.0F, -26.0F, 3.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, -0.3491F));

		ModelPartData combSmall_r1 = ChonkyGoonModel.addChild("combSmall_r1", ModelPartBuilder.create().uv(28, 76).cuboid(2.0F, -30.0F, -7.0F, 12.0F, 7.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 53).cuboid(0.0F, -30.0F, -15.0F, 16.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		ModelPartData tail_r1 = ChonkyGoonModel.addChild("tail_r1", ModelPartBuilder.create().uv(0, 43).cuboid(7.0F, -14.0F, -4.0F, 14.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3038F, -0.7854F, 0.2132F));

		ModelPartData lWing_r1 = ChonkyGoonModel.addChild("lWing_r1", ModelPartBuilder.create().uv(0, 61).cuboid(19.0F, -12.0F, 2.0F, 4.0F, 7.0F, 12.0F, new Dilation(0.0F))
				.uv(66, 0).cuboid(-7.0F, -12.0F, 2.0F, 4.0F, 7.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		ModelPartData beak_r1 = ChonkyGoonModel.addChild("beak_r1", ModelPartBuilder.create().uv(0, 0).cuboid(6.0F, -9.0F, -4.0F, 4.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, -8.0F, -0.7854F, 0.0F, 0.0F));

		ModelPartData rLeg = ChonkyGoonModel.addChild("rLeg", ModelPartBuilder.create().uv(42, 43).cuboid(1.0F, -4.0F, 4.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, -1.0F));

		ModelPartData lLeg = ChonkyGoonModel.addChild("lLeg", ModelPartBuilder.create().uv(0, 10).cuboid(1.0F, -4.0F, 4.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, 0.0F, -1.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		chonkyGoonModel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return chonkyGoonModel;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}