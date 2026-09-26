package net.krontixz.infectcraft.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.krontixz.infectcraft.procedures.InfectionHandlerProcedure;
import net.krontixz.infectcraft.InfectcraftMod;

public class Covid19MobEffect extends MobEffect {
	public Covid19MobEffect() {
		super(MobEffectCategory.HARMFUL, -9861576);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.splash_potion.break")));
		this.addAttributeModifier(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, "effect.covid_19_0"), -6, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		InfectionHandlerProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}