package net.s1ght.thekatanasmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.s1ght.thekatanasmod.block.ModBlocks;
import net.s1ght.thekatanasmod.compat.registries.BetterNetherItems;
import net.s1ght.thekatanasmod.item.ModItems;
import net.s1ght.thekatanasmod.item.ModItemsGroups;
import net.s1ght.thekatanasmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheKatanasMod implements ModInitializer {
	public static final String MOD_ID = "thekatanasmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world from"  + MOD_ID + "!");

		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		if (FabricLoader.getInstance().isModLoaded("betternether")) {
			BetterNetherItems.registerModItems();
		}

		ModWorldGeneration.generateModWorldGen();
	}

}