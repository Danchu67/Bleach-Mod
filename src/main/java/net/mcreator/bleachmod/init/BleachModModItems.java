
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bleachmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bleachmod.item.ZangetsuShikaiItem;
import net.mcreator.bleachmod.item.ZangetsuItem;
import net.mcreator.bleachmod.item.ChainoffateItem;
import net.mcreator.bleachmod.item.ChainoffateArmorItem;
import net.mcreator.bleachmod.BleachModMod;

public class BleachModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BleachModMod.MODID);
	public static final RegistryObject<Item> DECAYING_SAND = block(BleachModModBlocks.DECAYING_SAND, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HOLLOWOOD = block(BleachModModBlocks.HOLLOWOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HOLLOW_PILLAR = block(BleachModModBlocks.HOLLOW_PILLAR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ZANGETSU = REGISTRY.register("zangetsu", () -> new ZangetsuItem());
	public static final RegistryObject<Item> ZANGETSU_SHIKAI = REGISTRY.register("zangetsu_shikai", () -> new ZangetsuShikaiItem());
	public static final RegistryObject<Item> CHAINOFFATE_ARMOR_HELMET = REGISTRY.register("chainoffate_armor_helmet",
			() -> new ChainoffateArmorItem.Helmet());
	public static final RegistryObject<Item> CHAINOFFATE_ARMOR_CHESTPLATE = REGISTRY.register("chainoffate_armor_chestplate",
			() -> new ChainoffateArmorItem.Chestplate());
	public static final RegistryObject<Item> CHAINOFFATE_ARMOR_LEGGINGS = REGISTRY.register("chainoffate_armor_leggings",
			() -> new ChainoffateArmorItem.Leggings());
	public static final RegistryObject<Item> CHAINOFFATE_ARMOR_BOOTS = REGISTRY.register("chainoffate_armor_boots",
			() -> new ChainoffateArmorItem.Boots());
	public static final RegistryObject<Item> CHAINOFFATE_CHESTPLATE = REGISTRY.register("chainoffate_chestplate",
			() -> new ChainoffateItem.Chestplate());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
