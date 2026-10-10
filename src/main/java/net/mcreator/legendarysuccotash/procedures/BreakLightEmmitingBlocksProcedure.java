package net.mcreator.legendarysuccotash.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class BreakLightEmmitingBlocksProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double light_scan_index = 0;
		boolean foundlight = false;
		if (entity.isAlive()) {
			if (!world.isClientSide()) {
				if (entity != null && world instanceof net.minecraft.server.level.ServerLevel && entity.tickCount % 10 == 0) {
					net.minecraft.server.level.ServerLevel lightHuntLevel = (net.minecraft.server.level.ServerLevel) world;
					lightSearch : for (int lightDx = -3; lightDx <= 3; lightDx++) {
						for (int lightDy = -1; lightDy <= 3; lightDy++) {
							for (int lightDz = -3; lightDz <= 3; lightDz++) {
								net.minecraft.core.BlockPos lightPos = net.minecraft.core.BlockPos.containing(entity.getX() + lightDx, entity.getY() + lightDy, entity.getZ() + lightDz);
								net.minecraft.world.level.block.state.BlockState lightState = lightHuntLevel.getBlockState(lightPos);
								if (!lightState.isAir() && lightState.getLightEmission() > 0) {
									lightHuntLevel.destroyBlock(lightPos, true, entity, 512);
									break lightSearch;
								}
							}
						}
					}
				}
			}
		}
	}
}