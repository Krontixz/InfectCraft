/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.krontixz.infectcraft.InfectcraftMod;

public class InfectcraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, InfectcraftMod.MODID);
	public static final DeferredHolder<Potion, Potion> VACCINE_EFFECT = REGISTRY.register("vaccine_effect",
			() -> new Potion("vaccine_effect", new MobEffectInstance(MobEffects.STRENGTH, 3600, 2, false, true), new MobEffectInstance(MobEffects.SPEED, 3600, 1, false, true)));
}