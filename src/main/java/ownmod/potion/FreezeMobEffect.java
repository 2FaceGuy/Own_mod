
package ownmod.potion;

import ownmod.procedures.FreezeDoProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FreezeMobEffect extends MobEffect {
	public FreezeMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.own_mod.freeze";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FreezeDoProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
