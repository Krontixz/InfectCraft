/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.krontixz.infectcraft.item.ZombieScannerItem;
import net.krontixz.infectcraft.item.VaccineShotItem;
import net.krontixz.infectcraft.InfectcraftMod;

import java.util.function.Function;

public class InfectcraftModItems {
	public static Item VACCINE_SHOT;
	public static Item ZOMBIE_SCANNER;

	public static void load() {
		VACCINE_SHOT = register("vaccine_shot", VaccineShotItem::new);
		ZOMBIE_SCANNER = register("zombie_scanner", ZombieScannerItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(InfectcraftMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}