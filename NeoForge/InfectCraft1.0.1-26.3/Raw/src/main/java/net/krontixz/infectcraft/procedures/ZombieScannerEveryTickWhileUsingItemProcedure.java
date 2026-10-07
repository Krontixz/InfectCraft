package net.krontixz.infectcraft.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import java.util.Comparator;

public class ZombieScannerEveryTickWhileUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof Zombie) {
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("Zombie Was Found At:" + " " + entityiterator.getX() + " " + entityiterator.getY() + " " + entityiterator.getZ() + "!")).withColor(0xff1983)
								.withStyle(style -> style.withBold(true)).withStyle(style -> style.withItalic(true)), false);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("No Zombie Was Found").withColor(0xff2e63).withStyle(style -> style.withBold(true)), false);
					}
				}
			}
		}
	}
}