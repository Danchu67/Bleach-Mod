
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bleachmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.bleachmod.network.GetsugaCommandMessage;
import net.mcreator.bleachmod.BleachModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BleachModModKeyMappings {
	public static final KeyMapping GETSUGA_COMMAND = new KeyMapping("key.bleach_mod.getsuga_command", GLFW.GLFW_KEY_Z, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(GETSUGA_COMMAND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == GETSUGA_COMMAND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						BleachModMod.PACKET_HANDLER.sendToServer(new GetsugaCommandMessage(0, 0));
						GetsugaCommandMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
