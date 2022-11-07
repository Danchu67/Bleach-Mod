package net.mcreator.bleachmod.procedures;

import net.minecraft.world.entity.Entity;

public class TestWhileProjectileFlyingTickProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity((true));
	}
}
