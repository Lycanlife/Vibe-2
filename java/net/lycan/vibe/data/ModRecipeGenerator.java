package net.lycan.vibe.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lycan.vibe.block.ModBlocks;
import net.lycan.vibe.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_WARDIUM), RecipeCategory.MISC, ModItems.WARDIUM_INGOT,
                0.7f, 200, "wardium");
        offerBlasting(exporter, List.of(ModItems.RAW_WARDIUM), RecipeCategory.MISC, ModItems.WARDIUM_INGOT,
                0.7f, 200, "wardium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_WARDIUM_ORE), RecipeCategory.MISC, ModItems.WARDIUM_INGOT,
                0.7f, 100, "wardium");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_WARDIUM_ORE), RecipeCategory.MISC, ModItems.WARDIUM_INGOT,
                0.7f, 100, "wardium");

        offerSmelting(exporter, List.of(ModBlocks.NETHER_WITHERITE_ORE), RecipeCategory.MISC, ModItems.WITHERITE_CRYSTAL,
                0.7f, 200, "witherite");
        offerBlasting(exporter, List.of(ModBlocks.NETHER_WITHERITE_ORE), RecipeCategory.MISC, ModItems.WITHERITE_CRYSTAL,
                0.7f, 100, "witherite");

        offerSmelting(exporter, List.of(ModBlocks.END_DRAGANIUM_ORE), RecipeCategory.MISC, ModItems.DRAGANIUM,
                0.7f, 200, "draganium");
        offerBlasting(exporter, List.of(ModBlocks.END_DRAGANIUM_ORE), RecipeCategory.MISC, ModItems.DRAGANIUM,
                0.7f, 100, "draganium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WARDIUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.WARDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.WITHERITE, RecipeCategory.DECORATIONS,
                ModBlocks.WITHERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DRAGANIUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.DRAGANIUM_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_ROD, 2)
                .pattern(" w")
                .pattern("w ")
                .input('w', ModItems.WARDIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_PICKAXE)
                .pattern("www")
                .pattern(" r ")
                .pattern(" r ")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('r', ModItems.WARDIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_AXE)
                .pattern("ww")
                .pattern("wr")
                .pattern(" r")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('r', ModItems.WARDIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_SWORD)
                .pattern("w")
                .pattern("w")
                .pattern("r")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('r', ModItems.WARDIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_SHOVEL)
                .pattern("w")
                .pattern("r")
                .pattern("r")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('r', ModItems.WARDIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_HOE)
                .pattern("ww")
                .pattern(" r")
                .pattern(" r")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('r', ModItems.WARDIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_HELMET)
                .pattern("www")
                .pattern("wnw")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('n', Items.NETHERITE_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_HELMET),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_CHESTPLATE)
                .pattern("wnw")
                .pattern("www")
                .pattern("www")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('n', Items.NETHERITE_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_CHESTPLATE),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_LEGGINGS)
                .pattern("www")
                .pattern("wnw")
                .pattern("w w")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('n', Items.NETHERITE_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_LEGGINGS),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WARDIUM_BOOTS)
                .pattern("w w")
                .pattern("wnw")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('n', Items.NETHERITE_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_BOOTS),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WARDIUM_BOOTS)));





        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE)
                .pattern("www")
                .pattern("wsw")
                .pattern("www")
                .input('s', Items.NETHER_STAR)
                .input('w', ModItems.WITHERITE_CRYSTAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_INGOT))
                .offerTo(exporter, new Identifier("vibe", "witherite_from_crystal"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_ROD, 2)
                .pattern(" w")
                .pattern("w ")
                .input('w', ModItems.WITHERITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_PICKAXE)
                .pattern("www")
                .pattern(" r ")
                .pattern(" r ")
                .input('w', ModItems.WITHERITE)
                .input('r', ModItems.WITHERITE_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_AXE)
                .pattern("ww")
                .pattern("wr")
                .pattern(" r")
                .input('w', ModItems.WITHERITE)
                .input('r', ModItems.WITHERITE_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_SWORD)
                .pattern("w")
                .pattern("w")
                .pattern("r")
                .input('w', ModItems.WITHERITE)
                .input('r', ModItems.WITHERITE_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_SHOVEL)
                .pattern("w")
                .pattern("r")
                .pattern("r")
                .input('w', ModItems.WITHERITE)
                .input('r', ModItems.WITHERITE_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_HOE)
                .pattern("ww")
                .pattern(" r")
                .pattern(" r")
                .input('w', ModItems.WITHERITE)
                .input('r', ModItems.WITHERITE_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_HELMET)
                .pattern("www")
                .pattern("wnw")
                .input('w', ModItems.WITHERITE)
                .input('n', ModItems.WARDIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_HELMET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_CHESTPLATE)
                .pattern("wnw")
                .pattern("www")
                .pattern("www")
                .input('w', ModItems.WITHERITE)
                .input('n', ModItems.WARDIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_CHESTPLATE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_LEGGINGS)
                .pattern("www")
                .pattern("wnw")
                .pattern("w w")
                .input('w', ModItems.WITHERITE)
                .input('n', ModItems.WARDIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_LEGGINGS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WITHERITE_BOOTS)
                .pattern("w w")
                .pattern("wnw")
                .input('w', ModItems.WITHERITE)
                .input('n', ModItems.WARDIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.WARDIUM_BOOTS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WARDIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WITHERITE_BOOTS)));




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_INGOT, 4)
                .pattern("de")
                .pattern("ed")
                .input('d', ModItems.DRAGANIUM)
                .input('e', Items.ELYTRA)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.ELYTRA),
                        FabricRecipeProvider.conditionsFromItem(Items.ELYTRA))
                .offerTo(exporter, new Identifier("vibe", "draganium_from_elytra"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_ROD, 2)
                .pattern(" w")
                .pattern("w ")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_ROD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_PICKAXE)
                .pattern("www")
                .pattern(" r ")
                .pattern(" r ")
                .input('w', ModItems.WARDIUM_INGOT)
                .input('r', ModItems.WARDIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_AXE)
                .pattern("ww")
                .pattern("wr")
                .pattern(" r")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('r', ModItems.DRAGANIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_SWORD)
                .pattern("w")
                .pattern("w")
                .pattern("r")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('r', ModItems.DRAGANIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_SHOVEL)
                .pattern("w")
                .pattern("r")
                .pattern("r")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('r', ModItems.DRAGANIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_HOE)
                .pattern("ww")
                .pattern(" r")
                .pattern(" r")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('r', ModItems.DRAGANIUM_ROD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_ROD),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_ROD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_HELMET)
                .pattern("www")
                .pattern("wnw")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('n', ModItems.WITHERITE_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_HELMET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_HELMET))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_CHESTPLATE)
                .pattern("wnw")
                .pattern("www")
                .pattern("www")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('n', ModItems.WITHERITE_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_CHESTPLATE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_CHESTPLATE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_LEGGINGS)
                .pattern("www")
                .pattern("wnw")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('n', ModItems.WITHERITE_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_LEGGINGS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_LEGGINGS))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRAGANIUM_BOOTS)
                .pattern("w w")
                .pattern("wnw")
                .input('w', ModItems.DRAGANIUM_INGOT)
                .input('n', ModItems.WITHERITE_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.WITHERITE_BOOTS),
                        FabricRecipeProvider.conditionsFromItem(ModItems.WITHERITE_BOOTS))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DRAGANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DRAGANIUM_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DRAGANIUM_BOOTS)));


    }
}