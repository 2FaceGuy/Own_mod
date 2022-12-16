
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ownmod.init;

import ownmod.world.features.ores.DarkiteOreFeature;

import ownmod.OwnModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class OwnModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OwnModMod.MODID);
	public static final RegistryObject<Feature<?>> DARKITE_ORE = REGISTRY.register("darkite_ore", DarkiteOreFeature::feature);
}
