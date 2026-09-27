package net.krontixz.infectcraft.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;

import net.krontixz.infectcraft.procedures.InfectionHandlerProcedure;
import net.krontixz.infectcraft.InfectcraftMod;

public class ZombieVirusMobEffect extends MobEffect {
	public ZombieVirusMobEffect() {
		super(MobEffectCategory.HARMFUL, -16693739);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, "effect.zombie_virus_0"), -0.5, AttributeModifier.Operation.ADD_VALUE);
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