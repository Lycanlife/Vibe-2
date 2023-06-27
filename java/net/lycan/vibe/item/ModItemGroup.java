package net.lycan.vibe.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lycan.VibeMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup VIBE;

    public static void registerItemGroups() {
        VIBE = FabricItemGroup.builder(new Identifier(VibeMod.MOD_ID, "vibe"))
                .displayName(Text.translatable("itemgroup.wardium"))
                .icon(() -> new ItemStack(ModItems.WARDIUM_INGOT)).build();
    }
}