package com.verdantmods.chaos.misc;

import net.minecraftforge.common.ForgeConfigSpec;

public class ChaosConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final BasicOptions BASIC_OPTIONS = new BasicOptions(BUILDER);
    public static final ChaosOptions CHAOS_OPTIONS = new ChaosOptions(BUILDER);

    public static class BasicOptions {
        static final String BASIC_OPTIONS = "basic options";
        public ForgeConfigSpec.BooleanValue debugMode;
        public ForgeConfigSpec.BooleanValue showFilletRecipesInJEI;

        BasicOptions(ForgeConfigSpec.Builder builder) {
            builder.push(BASIC_OPTIONS);
            debugMode = builder.define("Enable debug mode? (Enables additional logging)", false);
            showFilletRecipesInJEI = builder.define("Show Fillet recipes in JEI?", true);
            builder.pop();
        }
    }

    public static class ChaosOptions {
        static final String NEPTUNIUM_OPTIONS = "neptunium options";
        public ForgeConfigSpec.BooleanValue enableChaosItems;
        public ForgeConfigSpec.BooleanValue enableChaosArmor;
        public ForgeConfigSpec.BooleanValue addChaosBountyToLoot;

        ChaosOptions(ForgeConfigSpec.Builder builder) {
            builder.push(NEPTUNIUM_OPTIONS);
            enableChaosItems = builder.define("Enable recipes for Chaos items?", true);
            enableChaosArmor = builder.define("Enable recipes for Chaos armor?", true);
            addChaosBountyToLoot = builder.comment("Should Chaos's bounty be added as fishing loot? Very rare.").define("Add Chaos's Bounty as loot?", true);
            builder.pop();
        }
    }
    
    public static ForgeConfigSpec spec = BUILDER.build();
}
