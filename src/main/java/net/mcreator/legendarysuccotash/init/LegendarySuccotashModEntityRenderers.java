/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarysuccotash.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.legendarysuccotash.client.renderer.DeepSpiderRenderer;
import net.mcreator.legendarysuccotash.client.renderer.DarklingRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class LegendarySuccotashModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LegendarySuccotashModEntities.DEEP_SPIDER.get(), DeepSpiderRenderer::new);
		event.registerEntityRenderer(LegendarySuccotashModEntities.DARKLING.get(), DarklingRenderer::new);
	}
}