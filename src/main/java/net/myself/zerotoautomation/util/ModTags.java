package net.myself.zerotoautomation.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.myself.zerotoautomation.ZeroToAutomation;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ZeroToAutomation.MOD_ID, name));
        }
    }

    public static class Items {
    public static final TagKey<Item> DRYER_INPUTS = tag("dryer_inputs");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ZeroToAutomation.MOD_ID, name));
        }
    }
}
