package net.myself.zerotoautomation.recipe;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.myself.zerotoautomation.ZeroToAutomation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ZeroToAutomation.MOD_ID);

    public static final RegistryObject<RecipeSerializer<DryerRecipe>> DRYER_SERIALIZER =
            SERIALIZERS.register("drying", () -> DryerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
