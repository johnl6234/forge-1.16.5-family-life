package com.deadwormy.familyLife.init;

import com.deadwormy.familyLife.ModFamilyLife;
import com.deadwormy.voidmod.VoidMod;
import com.deadwormy.voidmod.entity.animalcarry.CarryEntity;
import com.deadwormy.voidmod.entity.cerberus.CerberusEntity;
import com.deadwormy.voidmod.entity.creeperPig.CreeperPigEntity;
import com.deadwormy.voidmod.entity.giraffe.GiraffeEntity;
import com.deadwormy.voidmod.entity.hornedPig.HornedPigEntity;
import com.deadwormy.voidmod.entity.humanoid.HumanoidEntity;
import com.deadwormy.voidmod.entity.lion.LionEntity;
import com.deadwormy.voidmod.entity.unicorn.UnicornEntity;
import com.deadwormy.voidmod.entity.warthog.WarthogEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEntityTypes {

        public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, ModFamilyLife.MODID);
        // Entity names

        public static final String HUMANOID_NAME = "humanoid";

        // Create entity types
        /**public static final EntityType HUMANOID_ENTITY = EntityType.Builder.create(HumanoidEntity::new, EntityClassification.CREATURE)
                .size(2f, 3f)
                .build(new ResourceLocation(VoidMod.MOD_ID, HUMANOID_NAME).toString());**/

        //Register entity types
        //public static final RegistryObject<EntityType<HumanoidEntity>> HUMANOID = ENTITY_TYPES.register(HUMANOID_NAME,()-> HUMANOID_ENTITY);
}