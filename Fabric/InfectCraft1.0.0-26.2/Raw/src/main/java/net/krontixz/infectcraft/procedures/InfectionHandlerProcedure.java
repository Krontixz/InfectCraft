package net.krontixz.infectcraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.zombie.ZombifiedPiglin;
import net.minecraft.world.entity.monster.zombie.ZombieVillager;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.entity.monster.zombie.Husk;
import net.minecraft.world.entity.monster.zombie.Drowned;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.entity.monster.spider.CaveSpider;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.animal.nautilus.ZombieNautilus;
import net.minecraft.world.entity.animal.equine.ZombieHorse;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.krontixz.infectcraft.init.InfectcraftModMobEffects;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;

public class InfectionHandlerProcedure {
	public static boolean eventResult = true;

	public InfectionHandlerProcedure() {
		ServerLivingEntityEvents.ALLOW_DEATH.register((entity, damageSource, amount) -> {
			if (entity != null) {
				execute(entity.level(), entity);
			}
			boolean result = eventResult;
			eventResult = true;
			return result;
		});
	}

	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.2) {
			if (entity instanceof CaveSpider) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.COVID_19, 1200, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has been infected with Covid19")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof ZombieVillager) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof ZombieHorse) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 1200, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof Zombie) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof ZombifiedPiglin) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof Spider) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.COVID_19, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has been infected with Covid19!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof ZombieNautilus) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof Zoglin) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof Husk) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else if (entity instanceof Drowned) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList()
							.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + " You cant escape the virus!")).withColor(0xd20909).withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.ITALIC), false);
				}
			}
		}
	}
}