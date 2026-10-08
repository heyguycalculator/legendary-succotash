package net.mcreator.legendarysuccotash.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 5.1.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class deep_spiderAnimation {
	public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(16.0F).looping()
			.addAnimation("body",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(12.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(16.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(5.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(6.125F, KeyframeAnimations.degreeVec(0.0F, 15.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(11.0417F, KeyframeAnimations.degreeVec(0.0F, 15.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(11.875F, KeyframeAnimations.degreeVec(12.5F, -30.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(15.2917F, KeyframeAnimations.degreeVec(12.5F, -30.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(15.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(5.3333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(6.125F, KeyframeAnimations.posVec(-2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(11.0417F, KeyframeAnimations.posVec(-2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(11.875F, KeyframeAnimations.posVec(2.0F, -2.0F, 3.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(15.2917F, KeyframeAnimations.posVec(2.0F, -2.0F, 3.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(15.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("head2", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.build();
	public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(0.25F).looping()
			.addAnimation("leg",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 1.0F, -1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg2",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 1.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg3",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 1.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg4",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, -1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg5",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg6",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg7",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg8",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, -0.2F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}