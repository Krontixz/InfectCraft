package net.krontixz.infectcraft.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.krontixz.infectcraft.InfectcraftMod;

public class VaccineMobEffect extends MobEffect {
	public VaccineMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13230593);
		this.withSoundOnAdded(BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("block.composter.fill_success")));
		this.addAttributeModifier(Attributes.MAX_HEALTH, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, "effect.vaccine_0"), 6, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, "effect.vaccine_1"), 0.75, AttributeModifier.Operation.ADD_VALUE);
	}
}