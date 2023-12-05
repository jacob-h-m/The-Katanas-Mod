package net.s1ght.thekatanasmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.s1ght.thekatanasmod.TheKatanasMod;
import net.s1ght.thekatanasmod.item.custom.MuramasaItem;

public class ModItems {

    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, 2, -2.0f, new FabricItemSettings()));
    public static final Item STONE_KATANA = registerItem("stone_katana",
            new SwordItem(ToolMaterials.STONE, 2, -2.0f, new FabricItemSettings()));
    public static final Item IRON_KATANA = registerItem("iron_katana",
            new SwordItem(ToolMaterials.IRON, 2, -2.0f, new FabricItemSettings()));
    public static final Item GOLDEN_KATANA = registerItem("golden_katana",
            new SwordItem(ToolMaterials.GOLD, 2, -2.0f, new FabricItemSettings()));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            new SwordItem(ToolMaterials.DIAMOND, 2, -2.0f, new FabricItemSettings()));
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            new MuramasaItem(ToolMaterials.NETHERITE, 2, -2.0f, new FabricItemSettings().fireproof()));
    public static final Item MURAMASA = registerItem("muramasa",
            new MuramasaItem(ModToolMaterial.DEMONIC_NETHERITE, 3, -1.4f, new FabricItemSettings()));

    public static final Item WOODEN_BLADE = registerItem("wooden_blade",
            new Item(new FabricItemSettings()));
    public static final Item STONE_BLADE = registerItem("stone_blade",
            new Item(new FabricItemSettings()));
    public static final Item GOLDEN_BLADE = registerItem("golden_blade",
            new Item(new FabricItemSettings()));
    public static final Item IRON_BLADE = registerItem("iron_blade",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_BLADE = registerItem("diamond_blade",
            new Item(new FabricItemSettings()));

    public static final Item DEMONITE_INGOT = registerItem("demonite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item HEAVENLY_HANDLE = registerItem("heavenly_handle",
            new Item(new FabricItemSettings()));
    public static final Item DEMONITE_BLADE = registerItem("demonite_blade",
            new Item(new FabricItemSettings()));

    public static final Item DEMONITE = registerItem("demonite",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheKatanasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheKatanasMod.LOGGER.info("Registering Mod Items for " + TheKatanasMod.MOD_ID);
    }
}
