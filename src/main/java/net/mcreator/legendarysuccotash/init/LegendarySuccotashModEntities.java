/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarysuccotash.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.legendarysuccotash.entity.DeepSpiderEntity;
import net.mcreator.legendarysuccotash.entity.DarklingEntity;
import net.mcreator.legendarysuccotash.LegendarySuccotashMod;

@EventBusSubscriber
public class LegendarySuccotashModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, LegendarySuccotashMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DeepSpiderEntity>> DEEP_SPIDER = register("deep_spider",
			EntityType.Builder.<DeepSpiderEntity>of(DeepSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.notInPeaceful().sized(1.8f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarklingEntity>> DARKLING = register("darkling",
			EntityType.Builder.<DarklingEntity>of(DarklingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).notInPeaceful().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(LegendarySuccotashMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DeepSpiderEntity.init(event);
		DarklingEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DEEP_SPIDER.get(), DeepSpiderEntity.createAttributes().build());
		event.put(DARKLING.get(), DarklingEntity.createAttributes().build());
	}
}