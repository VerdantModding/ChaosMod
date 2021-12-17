package com.verdantmods.chaos.misc;

import net.minecraftforge.common.ForgeConfigSpec;

public class ChaosConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final BasicOptions BASIC_OPTIONS = new BasicOptions(BUILDER);

    public static class BasicOptions {
        static final String BASIC_OPTIONS = "basic options";
        public ForgeConfigSpec.BooleanValue randomWeight;
        public ForgeConfigSpec.BooleanValue debugMode;
        public ForgeConfigSpec.BooleanValue showFilletRecipesInJEI;

        BasicOptions(ForgeConfigSpec.Builder builder) {
            builder.push(BASIC_OPTIONS);
            randomWeight = builder.define("Enable weight for fish? Useful for fishing competitions", false);
            debugMode = builder.define("Enable debug mode? (Enables additional logging)", false);
            showFilletRecipesInJEI = builder.define("Show Fillet recipes in JEI?", true);
            builder.pop();
        }
    }
    public static ForgeConfigSpec spec = BUILDER.build();
}
