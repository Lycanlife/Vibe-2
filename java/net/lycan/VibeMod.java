package net.lycan;

import net.fabricmc.api.ModInitializer;

import net.lycan.vibe.block.ModBlocks;
import net.lycan.vibe.data.ModWorldGenerator;
import net.lycan.vibe.item.ModItemGroup;
import net.lycan.vibe.item.ModItems;
import net.lycan.vibe.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VibeMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("vibe");
	public static final String MOD_ID = "vibe";

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

	}
}