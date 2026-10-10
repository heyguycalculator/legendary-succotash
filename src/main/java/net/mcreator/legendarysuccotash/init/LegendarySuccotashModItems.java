/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarysuccotash.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.legendarysuccotash.item.SpiderbannerpatternItem;
import net.mcreator.legendarysuccotash.LegendarySuccotashMod;

import java.util.function.Function;

public class LegendarySuccotashModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LegendarySuccotashMod.MODID);
	public static final DeferredItem<Item> DEEP_SPIDER_SPAWN_EGG;
	public static final DeferredItem<Item> SPIDERBANNERPATTERN;
	public static final DeferredItem<Item> DEPTHSLATE;
	public static final DeferredItem<Item> DEPTHSLATEDIAMONDORE;
	public static final DeferredItem<Item> COMPRESSED_DETRIUS;
	public static final DeferredItem<Item> DARKLING_SPAWN_EGG;
	static {
		DEEP_SPIDER_SPAWN_EGG = register("deep_spider_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LegendarySuccotashModEntities.DEEP_SPIDER.get())));
		SPIDERBANNERPATTERN = register("spiderbannerpattern", SpiderbannerpatternItem::new);
		DEPTHSLATE = block(LegendarySuccotashModBlocks.DEPTHSLATE);
		DEPTHSLATEDIAMONDORE = block(LegendarySuccotashModBlocks.DEPTHSLATEDIAMONDORE);
		COMPRESSED_DETRIUS = block(LegendarySuccotashModBlocks.COMPRESSED_DETRIUS);
		DARKLING_SPAWN_EGG = register("darkling_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(LegendarySuccotashModEntities.DARKLING.get())));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}