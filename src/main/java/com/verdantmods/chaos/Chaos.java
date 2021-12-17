package com.verdantmods.chaos;

import com.verdantmods.chaos.api.ChaosAPI;
import com.verdantmods.chaos.init.ChaosGuis;
import com.verdantmods.chaos.init.ChaosItems;
import com.verdantmods.chaos.misc.ChaosConfig;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.verdantmods.chaos.client.ClientHandler;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(value = Chaos.MOD_ID)
public class Chaos
{
    public static Chaos instance;
    public final static String MOD_ID = "chaos";
    public final static Logger LOGGER = LogManager.getLogger(MOD_ID);
    public final static CreativeModeTab GROUP = new CreativeModeTab(Chaos.MOD_ID) {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ChaosItems.CHAOS_INGOT.get()); }
    };

    public Chaos() {
//        instance = this;
        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
//        modBus.addListener(this::setupCommon);
//        modBus.addListener(this::setupClient);
        this.registerDeferredRegistries(modBus);
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ChaosConfig.spec);
//        ChaosAPI.Tags.init();
//        FishFilletRecipe.IRECIPE_SERIALIZERS_DEFERRED.register(modBus);
    }

//    private void setupCommon(FMLCommonSetupEvent event) {
//        FishWeightHandler.registerFishData();
//        event.enqueueWork(AquaEntities::setSpawnPlacement);
//        event.enqueueWork(WormFarmBlock::addCompostables);
//        if (AquaConfig.BASIC_OPTIONS.aqFishToBreedCats.get()) {
//            event.enqueueWork(FishRegistry::addCatBreeding);
//        }
//        if (AquaConfig.BASIC_OPTIONS.enableFishSpawning.get()) {
//            FishReadFromJson.read();
//        }
//    }

//    private void setupClient(FMLClientSetupEvent event) {
//        ClientHandler.setupClient();
//    }

    public void registerDeferredRegistries(IEventBus modBus) {
//        ChaosBlockEntities.BLOCK_ENTITY_DEFERRED.register(modBus);
//        ChaosBlocks.BLOCK_DEFERRED.register(modBus);
        ChaosItems.ITEM_DEFERRED.register(modBus);
//        ChaosGuis.MENU_DEFERRED.register(modBus);
    }


}
