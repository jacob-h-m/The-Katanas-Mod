package net.s1ght.thekatanasmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.s1ght.thekatanasmod.datagen.ModBlockTagProvider;
import net.s1ght.thekatanasmod.datagen.ModLootTableProvider;
import net.s1ght.thekatanasmod.datagen.ModWorldGenerator;
import net.s1ght.thekatanasmod.world.ModConfiguredFeatures;
import net.s1ght.thekatanasmod.world.ModPlacedFeatures;

public class TheKatanasModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        TheKatanasMod.LOGGER.info("Registry" + TheKatanasMod.MOD_ID);
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // Adding a provider example:
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModWorldGenerator::new);
        pack.addProvider(ModLootTableProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
        TheKatanasMod.LOGGER.info("Registry" + TheKatanasMod.MOD_ID);
    }
}
