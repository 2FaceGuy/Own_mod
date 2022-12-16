package ownmod.procedures;

import ownmod.init.OwnModModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class FreezedDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(OwnModModMobEffects.FREEZE.get()) : false;
	}
}
