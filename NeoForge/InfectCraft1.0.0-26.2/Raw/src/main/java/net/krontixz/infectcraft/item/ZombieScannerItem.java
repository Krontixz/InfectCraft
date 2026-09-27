package net.krontixz.infectcraft.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionHand;

import net.krontixz.infectcraft.procedures.ZombieScannerEveryTickWhileUsingItemProcedure;

public class ZombieScannerItem extends Item {
	public ZombieScannerItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity, InteractionHand hand) {
		boolean retval = super.onEntitySwing(itemstack, entity, hand);
		ZombieScannerEveryTickWhileUsingItemProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}