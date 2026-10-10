package net.mcreator.legendarysuccotash.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class DepthslateBlock extends Block {
	public DepthslateBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.IRON).strength(4f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}