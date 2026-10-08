/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarysuccotash.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.legendarysuccotash.client.model.Modeldeep_spider;

@EventBusSubscriber(Dist.CLIENT)
public class LegendarySuccotashModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldeep_spider.LAYER_LOCATION, Modeldeep_spider::createBodyLayer);
	}
}