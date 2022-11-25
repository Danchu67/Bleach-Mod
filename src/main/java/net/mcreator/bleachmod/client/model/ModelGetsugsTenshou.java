package net.mcreator.bleachmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGetsugsTenshou<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bleach_mod", "model_getsugs_tenshou"),
			"main");
	public final ModelPart bb_main;

	public ModelGetsugsTenshou(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -29.0F, 0.0F, 20.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 3)
						.addBox(4.0F, -27.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(10.0F, -25.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-16.0F, -27.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-20.0F, -25.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-25.0F, -23.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(15.0F, -23.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-30.0F, -21.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(20.0F, -21.0F, 0.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 9)
						.addBox(29.0F, -19.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 6)
						.addBox(-33.0F, -19.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
