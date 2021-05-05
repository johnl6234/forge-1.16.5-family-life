package com.deadwormy.familyLife.init;

import com.deadwormy.familyLife.ModFamilyLife;
import com.deadwormy.familyLife.items.ModdedSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModFamilyLife.MODID);

    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", () -> new Item(new Item.Properties().tab(ModItemGroups.MOD_ITEM_GROUP)));
    public static final RegistryObject<ModdedSpawnEggItem> HUMANOID_SPAWN_EGG = ITEMS.register("humanoid_spawn_egg", () -> new ModdedSpawnEggItem(ModEntityTypes.HUMANOID, 0xF0A5A2, 0xA9672B, new Item.Properties().tab(ModItemGroups.MOD_ITEM_GROUP)));


}
