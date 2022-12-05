
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bleachmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.bleachmod.BleachModMod;

public class BleachModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BleachModMod.MODID);
	public static final RegistryObject<ParticleType<?>> CHERRYBLOSSOM = REGISTRY.register("cherryblossom", () -> new SimpleParticleType(false));
}
