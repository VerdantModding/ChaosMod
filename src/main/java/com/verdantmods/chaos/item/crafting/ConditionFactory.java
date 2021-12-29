package com.verdantmods.chaos.item.crafting;

import com.google.gson.JsonObject;
import com.verdantmods.chaos.Chaos;
import com.verdantmods.chaos.misc.ChaosConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Chaos.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConditionFactory {
//    @SubscribeEvent
//    public static void registerConditions(RegistryEvent.Register<RecipeSerializer<?>> event) {
//        CraftingHelper.register(ChaosItems.Serializer.INSTANCE);
//    }
//
//    public static class ChaosItems implements ICondition {
//        private static final ChaosItems INSTANCE = new ChaosItems();
//        private static final ResourceLocation NAME = new ResourceLocation(Chaos.MOD_ID, "neptunium_items_enabled");
//
//        @Override
//        public ResourceLocation getID() {
//            return NAME;
//        }
//
//        @Override
//        public boolean test() {
//            return ChaosConfig.CHAOS_OPTIONS.enableChaosItems.get();
//        }
//
//        public static class Serializer implements IConditionSerializer<ChaosItems> {
//            private static final Serializer INSTANCE = new Serializer();
//
//            @Override
//            public void write(JsonObject json, ChaosItems value) {
//                json.addProperty("value", value.test());
//            }
//
//            @Override
//            public ChaosItems read(JsonObject jssson) {
//                return ChaosItems.INSTANCE;
//            }
//
//            @Override
//            public ResourceLocation getID() {
//                return ChaosItems.NAME;
//            }
//        }
//    }
}
