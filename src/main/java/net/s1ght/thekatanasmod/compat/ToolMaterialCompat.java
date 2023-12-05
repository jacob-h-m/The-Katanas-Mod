package net.s1ght.thekatanasmod.compat;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.s1ght.thekatanasmod.item.ModItems;

import java.util.function.Supplier;

public enum ToolMaterialCompat implements ToolMaterial {
    CINCINNASITE(512,6.2f,5.5f,2,16, "betternether:cincinnasite_ingot"),
    CINCINNASITE_DIAMOND(2061,8.2f,6.7f,3,14, "minecraft:diamond"),
    NETHER_RUBY(2561,9.2f,8.1f,4,22, "betternether:nether_ruby");

    private final int tierDurability;
    private final float tierSpeed;
    private final float tierDamage;
    private final int tierMining;
    private final int tierEnchant;
    private final String tierIngredient;

    ToolMaterialCompat(int tierDurability, float tierSpeed, float tierDamage, int tierMining, int tierEnchant, String tierIngredient) {
        this.tierDurability = tierDurability;
        this.tierSpeed = tierSpeed;
        this.tierDamage = tierDamage;
        this.tierMining = tierMining;
        this.tierEnchant = tierEnchant;
        this.tierIngredient = tierIngredient;
    }


    @Override
    public int getDurability() {
        return tierDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return tierSpeed;
    }

    @Override
    public float getAttackDamage() {
        return tierDamage;
    }

    @Override
    public int getMiningLevel() {
        return tierMining;
    }

    @Override
    public int getEnchantability() {
        return tierEnchant;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Registries.ITEM.get(new Identifier(tierIngredient)));
    }
}
