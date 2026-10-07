/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarysuccotash.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.legendarysuccotash.LegendarySuccotashMod;

public class LegendarySuccotashModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, LegendarySuccotashMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CAVEPORTALAMBIANCE = REGISTRY.register("caveportalambiance", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("legendary_succotash", "caveportalambiance")));
}