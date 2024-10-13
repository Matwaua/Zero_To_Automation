package net.myself.zerotoautomation;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.myself.zerotoautomation.block.ModBlocks;
import net.myself.zerotoautomation.block.entity.ModBlockEntities;
import net.myself.zerotoautomation.item.ModCreativeModeTabs;
import net.myself.zerotoautomation.item.ModItems;
import net.myself.zerotoautomation.recipe.ModRecipes;
import net.myself.zerotoautomation.screen.DryerScreen;
import net.myself.zerotoautomation.screen.ModMenuTypes;
import org.slf4j.Logger;


@Mod(ZeroToAutomation.MOD_ID)
public class ZeroToAutomation {
    public static final String MOD_ID = "zerotoautomation";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ZeroToAutomation() {
        LOGGER.info("THIS SHOULD NOT BE HERE");
    }

    public ZeroToAutomation(FMLJavaModLoadingContext context) {
        LOGGER.info("THIS SHOULD-----BE HERE");
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    public static void init (FMLClientSetupEvent event) {
        ClientModEvents.onClientSetup(event);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("AND-----BE HERE");
                MenuScreens.register(ModMenuTypes.DRYER_MENU.get(), DryerScreen::new);
        }
    }
}
