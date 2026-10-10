/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarysuccotash.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.legendarysuccotash.block.DepthslatediamondoreBlock;
import net.mcreator.legendarysuccotash.block.DepthslateBlock;
import net.mcreator.legendarysuccotash.block.DepthportalblockBlock;
import net.mcreator.legendarysuccotash.block.CompressedDetriusBlock;
import net.mcreator.legendarysuccotash.LegendarySuccotashMod;

import java.util.function.Function;

public class LegendarySuccotashModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LegendarySuccotashMod.MODID);
	public static final DeferredBlock<Block> DEPTHPORTALBLOCK;
	public static final DeferredBlock<Block> DEPTHSLATE;
	public static final DeferredBlock<Block> DEPTHSLATEDIAMONDORE;
	public static final DeferredBlock<Block> COMPRESSED_DETRIUS;
	static {
		DEPTHPORTALBLOCK = register("depthportalblock", DepthportalblockBlock::new);
		DEPTHSLATE = register("depthslate", DepthslateBlock::new);
		DEPTHSLATEDIAMONDORE = register("depthslatediamondore", DepthslatediamondoreBlock::new);
		COMPRESSED_DETRIUS = register("compressed_detrius", CompressedDetriusBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}