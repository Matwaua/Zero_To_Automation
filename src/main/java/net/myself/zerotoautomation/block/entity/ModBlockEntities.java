package net.myself.zerotoautomation.block.entity;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.myself.zerotoautomation.ZeroToAutomation;
import net.myself.zerotoautomation.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ZeroToAutomation.MOD_ID);

    public static final RegistryObject<BlockEntityType<DryerBlockEntity>> DRYER_ENTITY =
            BLOCK_ENTITIES.register("dryer_entity",
                    () -> BlockEntityType.Builder.of(DryerBlockEntity::new,
                            ModBlocks.WOODEN_DRYER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
