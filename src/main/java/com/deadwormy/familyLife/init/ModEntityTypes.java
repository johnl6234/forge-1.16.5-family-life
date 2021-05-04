package com.deadwormy.familyLife.init;

import com.deadwormy.familyLife.ModFamilyLife;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntityTypes {

        public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ModFamilyLife.MODID);
        // Entity names

        public static final String HUMANOID_NAME = "humanoid";

        // Create entity types
        /**public static final EntityType HUMANOID_ENTITY = EntityType.Builder.create(HumanoidEntity::new, EntityClassification.CREATURE)
                .size(2f, 3f)
                .build(new ResourceLocation(VoidMod.MOD_ID, HUMANOID_NAME).toString());**/

        //Register entity types
        //public static final RegistryObject<EntityType<HumanoidEntity>> HUMANOID = ENTITY_TYPES.register(HUMANOID_NAME,()-> HUMANOID_ENTITY);
}