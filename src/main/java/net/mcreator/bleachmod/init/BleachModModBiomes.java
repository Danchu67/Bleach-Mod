
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bleachmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.bleachmod.world.biome.HollowPlainsBiome;
import net.mcreator.bleachmod.BleachModMod;

public class BleachModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BleachModMod.MODID);
	public static final RegistryObject<Biome> HOLLOW_PLAINS = REGISTRY.register("hollow_plains", () -> HollowPlainsBiome.createBiome());
}
