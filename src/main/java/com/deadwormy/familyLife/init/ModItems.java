package com.deadwormy.familyLife.init;

import com.deadwormy.familyLife.ModFamilyLife;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModFamilyLife.MODID);

    public static final RegistryObject<Item> GROUP_ICON = ITEMS.register("group_icon", () -> new Item(new Item.Properties().tab(ModItemGroups.MOD_ITEM_GROUP)));

}
