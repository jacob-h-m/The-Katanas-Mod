package net.s1ght.manyweapons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManyWeapons implements ModInitializer {
	public static final String MOD_ID = "manyweapons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world from"  + MOD_ID + "!");
	}
}