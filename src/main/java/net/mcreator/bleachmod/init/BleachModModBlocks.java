
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bleachmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bleachmod.block.HollowoodBlock;
import net.mcreator.bleachmod.block.HollowPillarBlock;
import net.mcreator.bleachmod.block.DecayingSandBlock;
import net.mcreator.bleachmod.block.DangaifloorBlock;
import net.mcreator.bleachmod.block.DangaiHallwayBlock;
import net.mcreator.bleachmod.BleachModMod;

public class BleachModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BleachModMod.MODID);
	public static final RegistryObject<Block> DECAYING_SAND = REGISTRY.register("decaying_sand", () -> new DecayingSandBlock());
	public static final RegistryObject<Block> HOLLOWOOD = REGISTRY.register("hollowood", () -> new HollowoodBlock());
	public static final RegistryObject<Block> HOLLOW_PILLAR = REGISTRY.register("hollow_pillar", () -> new HollowPillarBlock());
	public static final RegistryObject<Block> DANGAI_HALLWAY = REGISTRY.register("dangai_hallway", () -> new DangaiHallwayBlock());
	public static final RegistryObject<Block> DANGAIFLOOR = REGISTRY.register("dangaifloor", () -> new DangaifloorBlock());
}
