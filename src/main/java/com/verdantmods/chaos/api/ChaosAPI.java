package com.verdantmods.chaos.api;

import com.verdantmods.chaos.Chaos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import javax.annotation.Nonnull;

public class ChaosAPI {
    /**
     * Reference to Aquaculture's materials
     **/
    public static ChaosMats MATS = new ChaosMats();

    /**
     * Reference to setting weight for fish
     **/
//    public static FishData FISH_DATA = new FishData();
//
//    public static BaitItem createBait(int durability, int lureSpeedModifier, CreativeModeTab group) {
//        return new BaitItem(durability, lureSpeedModifier, group);
//    }
//
//    public static Item registerFishMount(@Nonnull String name) {
//        return FishRegistry.registerFishMount(name);
//    }

    public static class Tags {
//        public static final Tag.Named<Item> FILLET_KNIFE = tag("forge", "fillet_knife");
//        public static final Tag.Named<Item> FISHING_LINE = tag(Chaos.MOD_ID, "fishing_line");
//        public static final Tag.Named<Item> BOBBER = tag(Chaos.MOD_ID, "bobber");
//        public static final Tag.Named<Item> TACKLE_BOX = tag(Chaos.MOD_ID, "tackle_box");
//        public static final Tag.Named<Item> TURTLE_EDIBLE = tag(Chaos.MOD_ID, "turtle_edible");
//        public static final Tag.Named<Item> TOOLTIP = tag(Chaos.MOD_ID, "tooltip");

        public static Tag.Named<Item> tag(String modID, String name) {
            return ItemTags.bind(new ResourceLocation(modID, name).toString());
        }

        public static void init() {
        }
    }
}
