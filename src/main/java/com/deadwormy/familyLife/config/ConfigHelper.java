package com.deadwormy.familyLife.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {

    public static void bakeClient(final ModConfig config) {
        VoidModConfig.clientBoolean = ConfigHolder.CLIENT.clientBoolean.get();
        VoidModConfig.clientStringList = ConfigHolder.CLIENT.clientStringList.get();

    }

    public static void bakeServer(final ModConfig config) {
        VoidModConfig.serverBoolean = ConfigHolder.SERVER.serverBoolean.get();
        VoidModConfig.serverStringList = ConfigHolder.SERVER.serverStringList.get();

    }

}
