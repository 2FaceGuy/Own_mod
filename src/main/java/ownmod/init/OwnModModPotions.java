
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ownmod.init;

import ownmod.OwnModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class OwnModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, OwnModMod.MODID);
	public static final RegistryObject<Potion> POTION_CONFUSION = REGISTRY.register("potion_confusion",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.CONFUSION.get(), 4, 0, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 4, 1, false, false), new MobEffectInstance(MobEffects.CONFUSION, 5, 2, false, false)));
	public static final RegistryObject<Potion> POTION_FLYING = REGISTRY.register("potion_flying",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FLYING.get(), 4, 0, false, false)));
	public static final RegistryObject<Potion> POTION_SUCTION = REGISTRY.register("potion_suction",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.SUCTION.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> EXPLOSION_DO = REGISTRY.register("explosion_do",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.EXPLOSION.get(), 1, 0, false, false)));
	public static final RegistryObject<Potion> FALL_POTION = REGISTRY.register("fall_potion",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FALL.get(), 1, 0, false, true)));
	public static final RegistryObject<Potion> POTION_FREEZE = REGISTRY.register("potion_freeze",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FREEZE.get(), 3, 0, false, true)));
	public static final RegistryObject<Potion> SUCTION_2 = REGISTRY.register("suction_2",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.SUCTION.get(), 1, 2, false, true)));
	public static final RegistryObject<Potion> SUCTION_3 = REGISTRY.register("suction_3",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.SUCTION.get(), 1, 4, false, true)));
	public static final RegistryObject<Potion> EXPLOSION_2 = REGISTRY.register("explosion_2",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.EXPLOSION.get(), 1, 1, false, false)));
	public static final RegistryObject<Potion> FLYING_2 = REGISTRY.register("flying_2",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FLYING.get(), 7, 0, false, false)));
	public static final RegistryObject<Potion> FLYING_3 = REGISTRY.register("flying_3",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FLYING.get(), 15, 0, false, false)));
	public static final RegistryObject<Potion> FREEZE_2 = REGISTRY.register("freeze_2",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FREEZE.get(), 5, 1, false, true)));
	public static final RegistryObject<Potion> FREEZE_3 = REGISTRY.register("freeze_3",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FREEZE.get(), 8, 1, false, true)));
	public static final RegistryObject<Potion> FREEZE_4 = REGISTRY.register("freeze_4",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FREEZE.get(), 15, 2, false, true)));
	public static final RegistryObject<Potion> CONFUSION_2 = REGISTRY.register("confusion_2",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.CONFUSION.get(), 8, 0, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 8, 1, false, false), new MobEffectInstance(MobEffects.CONFUSION, 10, 2, false, false)));
	public static final RegistryObject<Potion> CONFUSION_3 = REGISTRY.register("confusion_3",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.CONFUSION.get(), 6, 1, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 6, 1, false, false), new MobEffectInstance(MobEffects.CONFUSION, 8, 2, false, false)));
	public static final RegistryObject<Potion> CONFUSION_4 = REGISTRY.register("confusion_4",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.CONFUSION.get(), 15, 2, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 15, 1, false, false),
					new MobEffectInstance(MobEffects.CONFUSION, 20, 5, false, false)));
	public static final RegistryObject<Potion> FALL_2 = REGISTRY.register("fall_2",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FALL.get(), 1, 1, false, true)));
	public static final RegistryObject<Potion> FALL_3 = REGISTRY.register("fall_3",
			() -> new Potion(new MobEffectInstance(OwnModModMobEffects.FALL.get(), 1, 3, false, true)));
}
