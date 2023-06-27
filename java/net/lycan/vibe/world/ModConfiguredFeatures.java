package net.lycan.vibe.world;

import net.lycan.VibeMod;
import net.lycan.vibe.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARDIUM_ORE_KEY = registerKey("wardium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WITHERITE_ORE_KEY = registerKey("witherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRAGANIUM_ORE_KEY = registerKey("draganium_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherackReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldWardiumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_WARDIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherWitheriteOres =
                List.of(OreFeatureConfig.createTarget(netherackReplaceables, ModBlocks.NETHER_WITHERITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endDraganiumOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.END_DRAGANIUM_ORE.getDefaultState()));


        register(context, WARDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldWardiumOres, 5, 0));
        register(context, WITHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherWitheriteOres, 4, 0.9f));
        register(context, DRAGANIUM_ORE_KEY, Feature.SCATTERED_ORE, new OreFeatureConfig(endDraganiumOres, 4, 0));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(VibeMod.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}