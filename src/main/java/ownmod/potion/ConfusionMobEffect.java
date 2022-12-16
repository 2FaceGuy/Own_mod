
package ownmod.potion;

import ownmod.procedures.ConfusionDoProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ConfusionMobEffect extends MobEffect {
	public ConfusionMobEffect() {
		super(MobEffectCategory.HARMFUL, -26215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.own_mod.confusion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ConfusionDoProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, amplifier);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
