
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ownmod.init;

import ownmod.world.inventory.BrewerMenu;

import ownmod.OwnModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class OwnModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OwnModMod.MODID);
	public static final RegistryObject<MenuType<BrewerMenu>> BREWER = REGISTRY.register("brewer", () -> IForgeMenuType.create(BrewerMenu::new));
}
