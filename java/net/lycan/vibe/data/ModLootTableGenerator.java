package net.lycan.vibe.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lycan.vibe.block.ModBlocks;
import net.lycan.vibe.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WARDIUM_BLOCK);
        addDrop(ModBlocks.WITHERITE_BLOCK);
        addDrop(ModBlocks.DRAGANIUM_BLOCK);

        addDrop(ModBlocks.DEEPSLATE_WARDIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_WARDIUM_ORE, ModItems.RAW_WARDIUM));
        addDrop(ModBlocks.NETHER_WITHERITE_ORE, oreDrops(ModBlocks.NETHER_WITHERITE_ORE, ModItems.WITHERITE_CRYSTAL));
        addDrop(ModBlocks.END_DRAGANIUM_ORE, oreDrops(ModBlocks.END_DRAGANIUM_ORE, ModItems.DRAGANIUM));

    }
}
