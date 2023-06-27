package net.lycan.vibe.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lycan.vibe.block.ModBlocks;
import net.lycan.vibe.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WARDIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_WARDIUM_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WITHERITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_WITHERITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGANIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_DRAGANIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WARDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_WARDIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARDIUM_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.WITHERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHERITE_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.DRAGANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_HOE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGANIUM_BOOTS, Models.GENERATED);
    }
}