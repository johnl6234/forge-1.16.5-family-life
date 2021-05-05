package com.deadwormy.familyLife.init;

import com.deadwormy.familyLife.ModFamilyLife;
import com.deadwormy.familyLife.entities.humanoid.HumanoidEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntityTypes {

        public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ModFamilyLife.MODID);
        // Entity names

        public static final String HUMANOID_NAME = "humanoid";

        // Create entity types
        public static final EntityType HUMANOID_ENTITY = EntityType.Builder.of(HumanoidEntity::new, EntityClassification.CREATURE)
                .sized(2f, 3f)
                .build(new ResourceLocation(ModFamilyLife.MODID, HUMANOID_NAME).toString());
        //Register entity types
        public static final RegistryObject<EntityType<HumanoidEntity>> HUMANOID = ENTITY_TYPES.register(HUMANOID_NAME,()-> HUMANOID_ENTITY);
}