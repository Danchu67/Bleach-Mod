package net.mcreator.bleachmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

public class TestWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity((true));
		class TestWhileProjectileFlyingTickWait2 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(TestWhileProjectileFlyingTickWait2.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					TestWhileProjectileFlyingTickWait2.this.ticks += 1;
					if (TestWhileProjectileFlyingTickWait2.this.ticks >= TestWhileProjectileFlyingTickWait2.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(TestWhileProjectileFlyingTickWait2.this);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
			}
		}
		new TestWhileProjectileFlyingTickWait2().start(world, 100);
	}
}
