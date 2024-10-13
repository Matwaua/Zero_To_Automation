package net.myself.zerotoautomation.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.myself.zerotoautomation.ZeroToAutomation;
import net.myself.zerotoautomation.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZeroToAutomation.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZERO_TO_AUTOMATION_TAB =
            CREATIVE_MODE_TABS.register("zero_to_automation_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANDESITE_FLINT.get()))
                            .title(Component.translatable("creativetab.zero_to_automation_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.FILTER.get());
                                pOutput.accept(ModItems.DIRTY_SLIME_BALL.get());
                                pOutput.accept(ModItems.ANDESITE_FLINT.get());

                                pOutput.accept(ModItems.CHISEL.get());

                                pOutput.accept(ModItems.DRIED_POTATO.get());

                                pOutput.accept(ModBlocks.FERTILIZED_DIRT.get());
                                pOutput.accept(ModBlocks.ANDESITE_GRAVEL.get());
                                pOutput.accept(ModBlocks.DRIED_LOG.get());

                                pOutput.accept(ModBlocks.WOODEN_DRYER.get());
                            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
