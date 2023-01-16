//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.marlowcrystal.marlowcrystal;

import java.util.HashMap;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;

@Environment(EnvType.CLIENT)
public class MarlowCrystal implements ClientModInitializer {
	public static final int delay = 0;
	public static final HashMap<Entity, Integer> toKill = new HashMap<>();

	public MarlowCrystal() {
	}

	public void onInitializeClient() {
		toKill.clear();
	}
}
