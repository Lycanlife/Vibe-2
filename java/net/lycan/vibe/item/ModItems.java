package net.lycan.vibe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lycan.VibeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_WARDIUM = registerItem("wardium",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_INGOT = registerItem("wardium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_ROD = registerItem("wardium_rod",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_PICKAXE = registerItem("wardium_pickaxe",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_AXE = registerItem("wardium_axe",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_SWORD = registerItem("wardium_sword",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_SHOVEL = registerItem("wardium_shovel",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_HOE = registerItem("wardium_hoe",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_HELMET = registerItem("wardium_helmet",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_CHESTPLATE = registerItem("wardium_chestplate",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_LEGGINGS = registerItem("wardium_leggings",
            new Item(new FabricItemSettings()));
    public static final Item WARDIUM_BOOTS = registerItem("wardium_boots",
            new Item(new FabricItemSettings()));

    public static final Item WITHERITE = registerItem("witherite",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_CRYSTAL = registerItem("witherite_crystal",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_ROD = registerItem("witherite_rod",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_PICKAXE = registerItem("witherite_pickaxe",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_AXE = registerItem("witherite_axe",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_SWORD = registerItem("witherite_sword",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_SHOVEL = registerItem("witherite_shovel",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_HOE = registerItem("witherite_hoe",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_HELMET = registerItem("witherite_helmet",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_CHESTPLATE = registerItem("witherite_chestplate",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_LEGGINGS = registerItem("witherite_leggings",
            new Item(new FabricItemSettings()));
    public static final Item WITHERITE_BOOTS = registerItem("witherite_boots",
            new Item(new FabricItemSettings()));

    public static final Item DRAGANIUM_INGOT = registerItem("draganium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM = registerItem("draganium",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_ROD = registerItem("draganium_rod",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_PICKAXE = registerItem("draganium_pickaxe",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_AXE = registerItem("draganium_axe",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_SWORD = registerItem("draganium_sword",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_SHOVEL = registerItem("draganium_shovel",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_HOE = registerItem("draganium_hoe",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_HELMET = registerItem("draganium_helmet",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_CHESTPLATE = registerItem("draganium_chestplate",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_LEGGINGS = registerItem("draganium_leggings",
            new Item(new FabricItemSettings()));
    public static final Item DRAGANIUM_BOOTS = registerItem("draganium_boots",
            new Item(new FabricItemSettings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VibeMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.VIBE, RAW_WARDIUM);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_INGOT);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_ROD);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_PICKAXE);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_AXE);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_SWORD);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_SHOVEL);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_HOE);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_HELMET);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_CHESTPLATE);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_LEGGINGS);
        addToItemGroup(ModItemGroup.VIBE, WARDIUM_BOOTS);

        addToItemGroup(ModItemGroup.VIBE, WITHERITE);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_CRYSTAL);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_ROD);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_PICKAXE);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_AXE);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_SWORD);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_SHOVEL);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_HOE);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_HELMET);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_LEGGINGS);
        addToItemGroup(ModItemGroup.VIBE, WITHERITE_BOOTS);

        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_INGOT);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_ROD);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_PICKAXE);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_AXE);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_SWORD);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_SHOVEL);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_HOE);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_HELMET);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_CHESTPLATE);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_LEGGINGS);
        addToItemGroup(ModItemGroup.VIBE, DRAGANIUM_BOOTS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        VibeMod.LOGGER.info("Registering Mod Items for " + VibeMod.MOD_ID);

        addItemsToItemGroup();
    }
}
