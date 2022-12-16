package ownmod.procedures;

import ownmod.OwnModMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FallDoProcedure {
	public static void execute(LevelAccessor world, Entity entity, double amplifier) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, ((amplifier + 1) * 5), 0));
		OwnModMod.queueServerWork(10, () -> {
			entity.setDeltaMovement(new Vec3(0, (amplifier * 5), 0));
		});
	}
}
