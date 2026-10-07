package net.mcreator.legendarysuccotash.world.dimension;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.legendarysuccotash.procedures.DepthsdimensionPlayerEntersDimensionProcedure;

@EventBusSubscriber
public class DepthsdimensionDimension {
	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getEntity();
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getTo() == ResourceKey.create(Registries.DIMENSION, Identifier.parse("legendary_succotash:depthsdimension"))) {
			DepthsdimensionPlayerEntersDimensionProcedure.execute(world, x, y, z);
		}
	}
}