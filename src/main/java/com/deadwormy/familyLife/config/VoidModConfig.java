package com.deadwormy.familyLife.config;

import net.minecraft.item.DyeColor;

import java.util.List;

public class VoidModConfig {

    // Client
    public static boolean clientBoolean;
    public static List<String> clientStringList;
    public static DyeColor clientDyeColorEnum;

    public static boolean modelTranslucency;
    public static float modelScale;

    // Server
    public static boolean serverBoolean;
    public static List<String> serverStringList;
    public static DyeColor serverEnumDyeColor;

    public static int electricFurnaceEnergySmeltCostPerTick = 100;
    public static int heatCollectorTransferAmountPerTick = 100;

}
