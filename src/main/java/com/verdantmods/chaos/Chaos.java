package com.verdantmods.chaos;


import com.verdantmods.chaos.init.ChaosBlocks;
import com.verdantmods.chaos.init.ChaosItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(value = Chaos.MOD_ID)
public class Chaos
{
    public final static String MOD_ID = "chaos";
    public final static Logger LOGGER = LogManager.getLogger(MOD_ID);
    public final static CreativeModeTab GROUP = new CreativeModeTab(Chaos.MOD_ID) {
        @Override
        public ItemStack makeIcon() { return new ItemStack(ChaosBlocks.CHAOS_BLOCK.get()); }
    };

    public Chaos() {
        final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        this.registerDeferredRegistries(modBus);
    }

    public void registerDeferredRegistries(IEventBus modBus) {
        ChaosBlocks.BLOCK_DEFERRED.register(modBus);
        ChaosItems.ITEM_DEFERRED.register(modBus);
    }


}
