package ownmod.procedures;

import ownmod.OwnModMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class ConfusionDoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amplifier) {
		if (entity == null)
			return;
		OwnModMod.queueServerWork((int) Mth.nextDouble(RandomSource.create(), 24, 56), () -> {
			entity.setDeltaMovement(new Vec3((x + Mth.nextDouble(RandomSource.create(), (-1) * (amplifier + 1), amplifier + 1)), y,
					(z + Mth.nextDouble(RandomSource.create(), (-1) * (amplifier + 1), amplifier + 1))));
		});
	}
}
