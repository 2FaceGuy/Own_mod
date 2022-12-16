package ownmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

public class ExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double amplifier) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) ((amplifier + 1) * 2), Explosion.BlockInteraction.DESTROY);
	}
}
