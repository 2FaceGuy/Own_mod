package ownmod.procedures;

import ownmod.network.OwnModModVariables;

import net.minecraft.world.entity.Entity;

public class OldCoordsProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = x;
			entity.getCapability(OwnModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.old_X = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = y;
			entity.getCapability(OwnModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.old_Y = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = z;
			entity.getCapability(OwnModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.old_Z = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
