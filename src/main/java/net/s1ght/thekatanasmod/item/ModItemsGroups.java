package net.s1ght.thekatanasmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.s1ght.thekatanasmod.TheKatanasMod;
import net.s1ght.thekatanasmod.block.ModBlocks;
import net.s1ght.thekatanasmod.compat.registries.BetterNetherItems;

public class ModItemsGroups {

    public static final ItemGroup THEKATANASMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheKatanasMod.MOD_ID, "diamond_katana"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.thekatanasmod"))
                    .icon(() -> new ItemStack(ModItems.DIAMOND_KATANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_KATANA);
                        entries.add(ModItems.STONE_KATANA);
                        entries.add(ModItems.IRON_KATANA);
                        entries.add(ModItems.GOLDEN_KATANA);
                        entries.add(ModItems.DIAMOND_KATANA);
                        entries.add(ModItems.NETHERITE_KATANA);

                        entries.add(ModItems.MURAMASA);

                        if (FabricLoader.getInstance().isModLoaded("betternether")) {
                            entries.add(BetterNetherItems.CINCINNASITE_KATANA);
                            entries.add(BetterNetherItems.CINCINNASITE_DIAMOND_KATANA);
                            entries.add(BetterNetherItems.NETHER_RUBY_KATANA);
                        }

                        entries.add(ModItems.WOODEN_BLADE);
                        entries.add(ModItems.STONE_BLADE);
                        entries.add(ModItems.IRON_BLADE);
                        entries.add(ModItems.GOLDEN_BLADE);
                        entries.add(ModItems.DIAMOND_BLADE);
                        entries.add(ModItems.DEMONITE_BLADE);

                        if (FabricLoader.getInstance().isModLoaded("betternether")) {
                            entries.add(BetterNetherItems.CINCINNASITE_BLADE);
                            entries.add(BetterNetherItems.NETHER_RUBY_BLADE);
                        }

                        entries.add(ModItems.DEMONITE_INGOT);
                        entries.add(ModItems.HEAVENLY_HANDLE);
                        entries.add(ModItems.DEMONITE);
                        entries.add(ModBlocks.DEMONITE_ORE);
                    }).build());

    public static void registerItemGroups() {
        TheKatanasMod.LOGGER.info("Registering Item Groups for" + TheKatanasMod.MOD_ID);
    }
}
