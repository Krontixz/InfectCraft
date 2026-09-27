/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.krontixz.infectcraft.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class InfectcraftModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(tabData -> {
			tabData.accept(InfectcraftModItems.VACCINE_SHOT);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(tabData -> {
			tabData.accept(InfectcraftModItems.ZOMBIE_SCANNER);
		});
	}
}