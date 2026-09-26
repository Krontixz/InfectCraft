/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.krontixz.infectcraft.potion.ZombieVirusMobEffect;
import net.krontixz.infectcraft.potion.ZombieVirus2MobEffect;
import net.krontixz.infectcraft.potion.VaccineMobEffect;
import net.krontixz.infectcraft.potion.Covid19MobEffect;
import net.krontixz.infectcraft.InfectcraftMod;

import java.util.function.Supplier;

public class InfectcraftModMobEffects {
	public static Holder<MobEffect> COVID_19;
	public static Holder<MobEffect> ZOMBIE_VIRUS;
	public static Holder<MobEffect> ZOMBIE_VIRUS_2;
	public static Holder<MobEffect> VACCINE;

	public static void load() {
		COVID_19 = register("covid_19", Covid19MobEffect::new);
		ZOMBIE_VIRUS = register("zombie_virus", ZombieVirusMobEffect::new);
		ZOMBIE_VIRUS_2 = register("zombie_virus_2", ZombieVirus2MobEffect::new);
		VACCINE = register("vaccine", VaccineMobEffect::new);
	}

	private static Holder<MobEffect> register(String registryname, Supplier<MobEffect> element) {
		return Holder.direct(Registry.register(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, registryname), element.get()));
	}
}