// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShihakusho<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shihakusho"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelShihakusho(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(32, 32)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-4.0F, 2.0F, -3.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(0.0F, 0.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.26F, 0.0F, -2.5F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.26F, 0.0F, -2.5F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(30, 60)
						.addBox(-3.0F, -2.0F, -3.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 46)
						.addBox(-4.0F, -2.26F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 45)
						.addBox(-4.0F, -2.0F, -3.0F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 60)
						.addBox(-3.0F, -2.0F, 2.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(44, 39)
						.addBox(-1.0F, -2.26F, -3.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 59)
						.addBox(-1.0F, -2.0F, -3.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-1.0F, -2.0F, 2.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(3.0F, -2.0F, -3.0F, 1.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(58, 0)
						.addBox(-2.0F, 0.0F, 2.0F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 27)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-2.3F, 0.0F, -3.0F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(54, 15)
						.addBox(-2.0F, 0.0F, -3.0F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 53)
						.addBox(-2.0F, 0.0F, 2.0F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(2.36F, 0.0F, -3.0F, 0.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}