package com.verdantmods.chaos.api;

import com.verdantmods.chaos.init.ChaosItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class ChaosMats {
    public Tier CHAOS = new Tier() {
        @Override
        public int getUses() {
            return 2500;
        }
        @Override
        public float getSpeed() {
            return 9.0F;
        }
        @Override
        public float getAttackDamageBonus() {
            return 6.0F;
        }
        @Override
        public int getLevel() {
            return 3;
        }
        @Override
        public int getEnchantmentValue() {
            return 15;
        }
        @Override
        @Nonnull
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ChaosItems.CHAOS_INGOT.get());
        }
    };

    public ArmorMaterial CHAOS_ARMOR = new ArmorMaterial() {
        private final int MAX_DAMAGE_FACTOR = 75;

        @Override
        public int getDurabilityForSlot(@Nonnull EquipmentSlot slot) {
            int[] maxDamageArray = new int[]{13, 15, 16, 11};
            return maxDamageArray[slot.getIndex()] * MAX_DAMAGE_FACTOR;
        }
        @Override
        public int getDefenseForSlot(@Nonnull EquipmentSlot slot) {
            int[] damageReduction = new int[]{3, 6, 8, 3};
            return damageReduction[slot.getIndex()];
        }
        @Override
        public int getEnchantmentValue() {
            return 15;
        }
        @Override
        @Nonnull
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_DIAMOND;
        }
        @Override
        @Nonnull
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ChaosItems.CHAOS_INGOT.get());
        }
        @Override
        @Nonnull
        public String getName() {
            return "chaos";
        }
        @Override
        public float getToughness() {
            return 2.0F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.0F;
        }
    };
}
