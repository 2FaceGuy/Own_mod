
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ownmod.init;

import ownmod.block.DarkiteOreBlock;
import ownmod.block.BlockDarkiteBlock;
import ownmod.block.AncientBrewerBlock;

import ownmod.OwnModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class OwnModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OwnModMod.MODID);
	public static final RegistryObject<Block> DARKITE_ORE = REGISTRY.register("darkite_ore", () -> new DarkiteOreBlock());
	public static final RegistryObject<Block> BLOCK_DARKITE = REGISTRY.register("block_darkite", () -> new BlockDarkiteBlock());
	public static final RegistryObject<Block> ANCIENT_BREWER = REGISTRY.register("ancient_brewer", () -> new AncientBrewerBlock());
}
