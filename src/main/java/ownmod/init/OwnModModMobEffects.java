
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ownmod.init;

import ownmod.potion.SuctionMobEffect;
import ownmod.potion.FreezeMobEffect;
import ownmod.potion.FlyingMobEffect;
import ownmod.potion.FallMobEffect;
import ownmod.potion.ExplosionMobEffect;
import ownmod.potion.ConfusionMobEffect;

import ownmod.OwnModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class OwnModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OwnModMod.MODID);
	public static final RegistryObject<MobEffect> CONFUSION = REGISTRY.register("confusion", () -> new ConfusionMobEffect());
	public static final RegistryObject<MobEffect> FLYING = REGISTRY.register("flying", () -> new FlyingMobEffect());
	public static final RegistryObject<MobEffect> SUCTION = REGISTRY.register("suction", () -> new SuctionMobEffect());
	public static final RegistryObject<MobEffect> EXPLOSION = REGISTRY.register("explosion", () -> new ExplosionMobEffect());
	public static final RegistryObject<MobEffect> FREEZE = REGISTRY.register("freeze", () -> new FreezeMobEffect());
	public static final RegistryObject<MobEffect> FALL = REGISTRY.register("fall", () -> new FallMobEffect());
}
