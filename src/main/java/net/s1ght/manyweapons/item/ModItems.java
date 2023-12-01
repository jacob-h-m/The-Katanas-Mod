package net.s1ght.manyweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.s1ght.manyweapons.ManyWeapons;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ManyWeapons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ManyWeapons.LOGGER.info("Registering Mod Items for " + ManyWeapons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
