// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldeep_spider<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "deep_spider"), "main");
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart head2;
	private final ModelPart head;
	private final ModelPart Fangs;
	private final ModelPart fang1;
	private final ModelPart fang2;
	private final ModelPart rightlegs;
	private final ModelPart leg;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leftlegs;
	private final ModelPart leg5;
	private final ModelPart leg6;
	private final ModelPart leg7;
	private final ModelPart leg8;

	public Modeldeep_spider(ModelPart root) {
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.head2 = root.getChild("head2");
		this.head = this.head2.getChild("head");
		this.Fangs = this.head.getChild("Fangs");
		this.fang1 = this.Fangs.getChild("fang1");
		this.fang2 = this.Fangs.getChild("fang2");
		this.rightlegs = root.getChild("rightlegs");
		this.leg = this.rightlegs.getChild("leg");
		this.leg2 = this.rightlegs.getChild("leg2");
		this.leg3 = this.rightlegs.getChild("leg3");
		this.leg4 = this.rightlegs.getChild("leg4");
		this.leftlegs = root.getChild("leftlegs");
		this.leg5 = this.leftlegs.getChild("leg5");
		this.leg6 = this.leftlegs.getChild("leg6");
		this.leg7 = this.leftlegs.getChild("leg7");
		this.leg8 = this.leftlegs.getChild("leg8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 14.0F, -15.0F));

		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F,
				-10.0F, 3.0F, 13.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 3.0F, 11.0F));

		PartDefinition cube_r1 = body
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -7.0F, -3.0F, 11.0F, 7.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition head2 = partdefinition.addOrReplaceChild("head2", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 14.0F, -15.0F));

		PartDefinition head = head2.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(36, 26).addBox(-3.0F, -6.0F, -7.0F, 8.0F, 6.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 8.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Fangs = head.addOrReplaceChild("Fangs", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 0.0F, 0.0F));

		PartDefinition fang1 = Fangs.addOrReplaceChild("fang1", CubeListBuilder.create(),
				PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = fang1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(68, 24).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1129F, 0.1334F, 0.4288F));

		PartDefinition fang2 = Fangs.addOrReplaceChild("fang2", CubeListBuilder.create(),
				PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = fang2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(64, 64).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.1745F, 0.0F, -0.4363F));

		PartDefinition rightlegs = partdefinition.addOrReplaceChild("rightlegs", CubeListBuilder.create(),
				PartPose.offset(-16.0F, 9.0F, -4.0F));

		PartDefinition leg = rightlegs.addOrReplaceChild("leg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r5 = leg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 56).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r6 = leg
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(0, 40).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leg2 = rightlegs.addOrReplaceChild("leg2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r7 = leg2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(32, 56).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r8 = leg2
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(42, 40).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leg3 = rightlegs.addOrReplaceChild("leg3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r9 = leg3.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(58, 0).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r10 = leg3
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 44).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leg4 = rightlegs.addOrReplaceChild("leg4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 20.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r11 = leg4.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(58, 8).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r12 = leg4
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(42, 44).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leftlegs = partdefinition.addOrReplaceChild("leftlegs", CubeListBuilder.create(),
				PartPose.offsetAndRotation(17.0F, 9.0F, 18.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition leg5 = leftlegs.addOrReplaceChild("leg5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r13 = leg5.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(58, 16).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r14 = leg5
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(0, 48).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leg6 = leftlegs.addOrReplaceChild("leg6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r15 = leg6.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 64).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r16 = leg6
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(42, 48).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leg7 = leftlegs.addOrReplaceChild("leg7", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r17 = leg7.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(32, 64).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r18 = leg7
				.addOrReplaceChild("cube_r18",
						CubeListBuilder.create().texOffs(0, 52).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition leg8 = leftlegs.addOrReplaceChild("leg8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 20.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r19 = leg8.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(64, 56).addBox(-11.0F, -4.0F, -2.0F, 12.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 3.0F, 1.0F, 0.0F, -0.1309F, 0.3054F));

		PartDefinition cube_r20 = leg8
				.addOrReplaceChild("cube_r20",
						CubeListBuilder.create().texOffs(42, 52).addBox(-16.0F, -2.0F, -1.0F, 19.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2654F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightlegs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftlegs.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}