package net.myself.zerotoautomation.item;

import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.myself.zerotoautomation.ZeroToAutomation;
import net.myself.zerotoautomation.item.custom.CraftRemainderItem;
import net.myself.zerotoautomation.item.custom.ModFoods;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZeroToAutomation.MOD_ID);

    public static final RegistryObject<Item> FILTER = ITEMS.register("filter",
            () -> new CraftRemainderItem(new Item.Properties().defaultDurability(64)));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new CraftRemainderItem(new Item.Properties().defaultDurability(32)));
    public static final RegistryObject<Item> ANDESITE_FLINT = ITEMS.register("andesite_flint",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIRTY_SLIME_BALL = ITEMS.register("dirty_slime_ball",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_POTATO = ITEMS.register("dried_potato",
            () -> new Item(new Item.Properties().food(ModFoods.DRYED_POTATO)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
