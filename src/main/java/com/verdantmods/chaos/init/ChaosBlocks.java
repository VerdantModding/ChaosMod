package com.verdantmods.chaos.init;

import com.verdantmods.chaos.Chaos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ChaosBlocks {
    public static final DeferredRegister<Block> BLOCK_DEFERRED = DeferredRegister.create(Block.class, Chaos.MOD_ID);
    public static final RegistryObject<Block> CHAOS_BLOCK = register(new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL)), "chaos_block");

    /**
     * Registers a block with a basic BlockItem
     *
     * @param block that we are registering
     * @param name that the block will register with
     * @return registered block
     */
    public static RegistryObject<Block> register(@Nonnull Block block, @Nonnull String name) {
        return register(block, name, new Item.Properties());
    }

    /**
     * Registers a block with a basic BlockItem
     *
     * @param block that we are registering
     * @param name that the block will register with
     * @param properties fuck if i know
     * @return registered block
     */
    public static RegistryObject<Block> register(@Nonnull Block block, @Nonnull String name, @Nullable Item.Properties properties) {
        ChaosItems.register(() -> new BlockItem(block, properties == null ? new Item.Properties() : properties.tab(Chaos.GROUP)), name);
        return registerBaseBlock(() -> block, name);
    }

    public static RegistryObject<Block> registerBaseBlock(@Nonnull Supplier<Block> initializer, @Nonnull String name) {
        return BLOCK_DEFERRED.register(name, initializer);
    }
}
