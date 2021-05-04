package com.deadwormy.familyLife.init;

import com.deadwormy.familyLife.ModFamilyLife;
import com.deadwormy.voidmod.VoidMod;
import com.deadwormy.voidmod.armour.ArmourItem;
import com.deadwormy.voidmod.items.*;
import com.deadwormy.voidmod.materials.ArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModFamilyLife.MODID);

    public static final RegistryObject<Item> EXAMPLE_CRYSTAL = ITEMS.register("example_crystal", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

}
