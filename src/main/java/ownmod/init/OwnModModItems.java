
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ownmod.init;

import ownmod.item.HardPowderItem;
import ownmod.item.DarkiteItem;
import ownmod.item.DarkRodItem;
import ownmod.item.DarkPowderItem;
import ownmod.item.DarkChargeItem;

import ownmod.OwnModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class OwnModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OwnModMod.MODID);
	public static final RegistryObject<Item> DARKITE_ORE = block(OwnModModBlocks.DARKITE_ORE, CreativeModeTab.TAB_MATERIALS);
	public static final RegistryObject<Item> DARKITE = REGISTRY.register("darkite", () -> new DarkiteItem());
	public static final RegistryObject<Item> BLOCK_DARKITE = block(OwnModModBlocks.BLOCK_DARKITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DARK_POWDER = REGISTRY.register("dark_powder", () -> new DarkPowderItem());
	public static final RegistryObject<Item> DARK_ROD = REGISTRY.register("dark_rod", () -> new DarkRodItem());
	public static final RegistryObject<Item> HARD_POWDER = REGISTRY.register("hard_powder", () -> new HardPowderItem());
	public static final RegistryObject<Item> DARK_CHARGE = REGISTRY.register("dark_charge", () -> new DarkChargeItem());
	public static final RegistryObject<Item> ANCIENT_BREWER = block(OwnModModBlocks.ANCIENT_BREWER, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
