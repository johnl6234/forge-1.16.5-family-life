package com.deadwormy.familyLife.client;

import com.deadwormy.familyLife.ModFamilyLife;
import com.deadwormy.familyLife.client.render.entity.humanoid.HumanoidRender;
import com.deadwormy.familyLife.init.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = ModFamilyLife.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.HUMANOID.get(), HumanoidRender::new);

        LOGGER.debug("Registered Entity Renderers");
    }
}
