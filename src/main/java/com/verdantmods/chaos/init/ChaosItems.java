package com.verdantmods.chaos.init;

import com.verdantmods.chaos.Chaos;
import com.verdantmods.chaos.item.SimpleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Chaos.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChaosItems {
    public static final DeferredRegister<Item> ITEM_DEFERRED = DeferredRegister.create(Item.class, Chaos.MOD_ID);

    public static final RegistryObject<Item> CHAOS_NUGGET = register(SimpleItem::new, "chaos_nugget");
    public static final RegistryObject<Item> CHAOS_INGOT = register(SimpleItem::new, "chaos_ingot");

    /**
     * Registers an item
     *
     * @param initializer The item initializer
     * @param name        The name to register the item with
     * @return The Item that was registered
     */
    public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
        return ITEM_DEFERRED.register(name, initializer);
    }
}
