package com.deadwormy.familyLife.entities.humanoid;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class HumanoidEntity extends AgeableEntity {

    public HumanoidEntity(EntityType<? extends AgeableEntity> type, World worldIn) {
        super(type, worldIn);
        this.setCanPickUpLoot(true);
    }

    @Override
    protected void registerGoals(){
        this.goalSelector.addGoal(1, new WaterAvoidingRandomWalkingGoal(this, 0.23D));
    }

    @Nullable
    @Override
    public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
        return null;
    }

}
