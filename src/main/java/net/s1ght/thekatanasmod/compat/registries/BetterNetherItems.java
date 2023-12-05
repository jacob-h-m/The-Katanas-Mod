package net.s1ght.thekatanasmod.compat.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.s1ght.thekatanasmod.TheKatanasMod;
import net.s1ght.thekatanasmod.compat.ToolMaterialCompat;

public class BetterNetherItems {

    public static final Item CINCINNASITE_BLADE = registerItem("cincinnasite_blade",
            new Item(new FabricItemSettings()));
    public static final Item NETHER_RUBY_BLADE = registerItem("nether_ruby_blade",
            new Item(new FabricItemSettings()));
    public static final Item CINCINNASITE_KATANA = registerItem("cincinnasite_katana",
            new SwordItem(ToolMaterialCompat.CINCINNASITE, -1, -2.0f, new FabricItemSettings()));
    public static final Item CINCINNASITE_DIAMOND_KATANA = registerItem("cincinnasite_diamond_katana",
            new SwordItem(ToolMaterialCompat.CINCINNASITE_DIAMOND, -1, -2.0f, new FabricItemSettings()));
    public static final Item NETHER_RUBY_KATANA = registerItem("nether_ruby_katana",
            new SwordItem(ToolMaterialCompat.NETHER_RUBY, -3, -2.0f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheKatanasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheKatanasMod.LOGGER.info("Registering Mod Items for " + TheKatanasMod.MOD_ID);
    }
}
