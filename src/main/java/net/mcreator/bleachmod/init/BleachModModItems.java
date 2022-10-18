
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
import net.mcreator.bleachmod.item.ZangetsuBankaiItem;
import net.mcreator.bleachmod.item.ZabimaruShikaiItem;
import net.mcreator.bleachmod.item.ZabimaruItem;
import net.mcreator.bleachmod.item.TestItem;
import net.mcreator.bleachmod.item.SenbonzakuraShikaiItem;
import net.mcreator.bleachmod.item.SenbonzakuraItem;
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
	public static final RegistryObject<Item> ZANGETSU_BANKAI = REGISTRY.register("zangetsu_bankai", () -> new ZangetsuBankaiItem());
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
	public static final RegistryObject<Item> SENBONZAKURA = REGISTRY.register("senbonzakura", () -> new SenbonzakuraItem());
	public static final RegistryObject<Item> SENBONZAKURA_SHIKAI = REGISTRY.register("senbonzakura_shikai", () -> new SenbonzakuraShikaiItem());
	public static final RegistryObject<Item> ZABIMARU = REGISTRY.register("zabimaru", () -> new ZabimaruItem());
	public static final RegistryObject<Item> ZABIMARU_SHIKAI = REGISTRY.register("zabimaru_shikai", () -> new ZabimaruShikaiItem());
	public static final RegistryObject<Item> DANGAI_HALLWAY = block(BleachModModBlocks.DANGAI_HALLWAY, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DANGAIFLOOR = block(BleachModModBlocks.DANGAIFLOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OVERWORLDPORTAL = block(BleachModModBlocks.OVERWORLDPORTAL, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
