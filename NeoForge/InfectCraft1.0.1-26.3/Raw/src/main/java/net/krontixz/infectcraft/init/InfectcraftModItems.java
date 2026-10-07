/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.krontixz.infectcraft.item.ZombieScannerItem;
import net.krontixz.infectcraft.item.VaccineShotItem;
import net.krontixz.infectcraft.InfectcraftMod;

import java.util.function.Function;

public class InfectcraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(InfectcraftMod.MODID);
	public static final DeferredItem<Item> VACCINE_SHOT;
	public static final DeferredItem<Item> ZOMBIE_SCANNER;
	static {
		VACCINE_SHOT = register("vaccine_shot", VaccineShotItem::new);
		ZOMBIE_SCANNER = register("zombie_scanner", ZombieScannerItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}