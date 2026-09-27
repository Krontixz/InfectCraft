/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.krontixz.infectcraft.InfectcraftMod;

public class InfectcraftModPotions {
	public static Holder<Potion> VACCINE_EFFECT;

	public static void load() {
		VACCINE_EFFECT = register("vaccine_effect", new Potion("vaccine_effect", new MobEffectInstance(MobEffects.STRENGTH, 3600, 2, false, true), new MobEffectInstance(MobEffects.SPEED, 3600, 1, false, true)));
	}

	private static Holder<Potion> register(String registryname, Potion element) {
		return Holder.direct(Registry.register(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, registryname), element));
	}
}