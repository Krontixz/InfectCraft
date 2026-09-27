/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.krontixz.infectcraft.potion.ZombieVirusMobEffect;
import net.krontixz.infectcraft.potion.ZombieVirus2MobEffect;
import net.krontixz.infectcraft.potion.VaccineMobEffect;
import net.krontixz.infectcraft.potion.Covid19MobEffect;
import net.krontixz.infectcraft.InfectcraftMod;

public class InfectcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, InfectcraftMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> COVID_19 = REGISTRY.register("covid_19", Covid19MobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> ZOMBIE_VIRUS = REGISTRY.register("zombie_virus", ZombieVirusMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> ZOMBIE_VIRUS_2 = REGISTRY.register("zombie_virus_2", ZombieVirus2MobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> VACCINE = REGISTRY.register("vaccine", VaccineMobEffect::new);
}