package com.deadwormy.familyLife.client.render.entity.humanoid;

import com.deadwormy.familyLife.ModFamilyLife;
import com.deadwormy.familyLife.entities.humanoid.HumanoidEntity;
import com.deadwormy.familyLife.entities.humanoid.HumanoidModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HumanoidRender extends MobRenderer<HumanoidEntity, HumanoidModel<HumanoidEntity>> {
    private static final ResourceLocation HUMANOID_TEXTURE = new ResourceLocation(ModFamilyLife.MODID, "textures/entities/humanoid.png");

    public HumanoidRender(final EntityRendererManager manager) {
        super(manager, new HumanoidModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(HumanoidEntity p_110775_1_) {
        return HUMANOID_TEXTURE;
    }
}
