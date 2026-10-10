package net.mcreator.legendarysuccotash.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.*;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.legendarysuccotash.procedures.BreakLightEmmitingBlocksProcedure;
import net.mcreator.legendarysuccotash.init.LegendarySuccotashModEntities;

public class DarklingEntity extends Monster {
	public DarklingEntity(EntityType<DarklingEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_PICKAXE));
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RemoveBlockGoal(Blocks.TORCH, this, 1, (int) 7));
		this.goalSelector.addGoal(2, new RemoveBlockGoal(Blocks.WALL_TORCH, this, 1, (int) 7));
		this.goalSelector.addGoal(3, new RemoveBlockGoal(Blocks.SOUL_TORCH, this, 1, (int) 7));
		this.goalSelector.addGoal(4, new RemoveBlockGoal(Blocks.SOUL_WALL_TORCH, this, 1, (int) 7));
		this.goalSelector.addGoal(5, new RemoveBlockGoal(Blocks.LANTERN, this, 1, (int) 7));
		this.goalSelector.addGoal(6, new RemoveBlockGoal(Blocks.COPPER_LANTERN.unaffected(), this, 1, (int) 7));
		this.goalSelector.addGoal(7, new RemoveBlockGoal(Blocks.COPPER_LANTERN.exposed(), this, 1, (int) 7));
		this.goalSelector.addGoal(8, new RemoveBlockGoal(Blocks.COPPER_LANTERN.weathered(), this, 1, (int) 7));
		this.goalSelector.addGoal(9, new RemoveBlockGoal(Blocks.COPPER_LANTERN.waxed(), this, 1, (int) 7));
		this.goalSelector.addGoal(10, new RemoveBlockGoal(Blocks.COPPER_LANTERN.waxedExposed(), this, 1, (int) 7));
		this.goalSelector.addGoal(11, new RemoveBlockGoal(Blocks.COPPER_LANTERN.waxedWeathered(), this, 1, (int) 7));
		this.goalSelector.addGoal(12, new RemoveBlockGoal(Blocks.COPPER_LANTERN.waxedOxidized(), this, 1, (int) 7));
		this.goalSelector.addGoal(13, new RemoveBlockGoal(Blocks.SOUL_LANTERN, this, 1, (int) 7));
		this.goalSelector.addGoal(14, new PanicGoal(this, 2));
		this.goalSelector.addGoal(15, new RestrictSunGoal(this));
		this.goalSelector.addGoal(16, new RandomStrollGoal(this, 0.6));
		this.goalSelector.addGoal(17, new LookAtPlayerGoal(this, Avatar.class, (float) 6));
		this.goalSelector.addGoal(18, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(19, new FloatGoal(this));
	}

	@Override
	public Vec3 getPassengerRidingPosition(Entity entity) {
		return super.getPassengerRidingPosition(entity).add(0, -0.35F, 0);
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.parrot.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.generic.death"));
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource damagesource, float amount) {
		if (damagesource.is(DamageTypes.FALL))
			return false;
		return super.hurtServer(level, damagesource, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BreakLightEmmitingBlocksProcedure.execute(this.level(), this);
	}

	@Override
	public boolean checkSpawnRules(LevelAccessor level, EntitySpawnReason reason) {
		return this.level().dimension() == Level.OVERWORLD ? super.checkSpawnRules(level, reason) : true;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(LegendarySuccotashModEntities.DARKLING.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> world.getDifficulty() != Difficulty.PEACEFUL
				&& (EntitySpawnReason.ignoresLightRequirements(reason) || Monster.isDarkEnoughToSpawn(world, pos, random)) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 5);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		return builder;
	}
}