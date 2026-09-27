package net.krontixz.infectcraft.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

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

import net.krontixz.infectcraft.init.InfectcraftModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class InfectionHandlerProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.2) {
			if (entity instanceof CaveSpider) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.COVID_19, 1200, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has been infected with Covid19")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof ZombieVillager) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof ZombieHorse) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 1200, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof Zombie) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof ZombifiedPiglin) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has been infected with ZombieVirus!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof Spider) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.COVID_19, 600, 1, false, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has been infected with Covid19!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof ZombieNautilus) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof Zoglin) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof Husk) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else if (entity instanceof Drowned) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(InfectcraftModMobEffects.ZOMBIE_VIRUS_2, 1200, 1, true, true));
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " Has Been Infected With ZombieVirus2!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(
							Component.literal((entity.getDisplayName().getString() + " You cant escape the virus!")).withColor(0xd20909).withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
				}
			}
		}
	}
}