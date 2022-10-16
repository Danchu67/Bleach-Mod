
package net.mcreator.bleachmod.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class HollowPlainsBiome {

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(4159204).waterFogColor(329011)
				.skyColor(-16777216).foliageColorOverride(-3355444).grassColorOverride(-3355444).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("bleach_mod:tree_hollow_plains",
						FeatureUtils.register("bleach_mod:tree_hollow_plains", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(BleachModModBlocks.HOLLOWOOD.get().defaultBlockState()),
										new ForkingTrunkPlacer(5, 2, 2), BlockStateProvider.simple(Blocks.AIR.defaultBlockState()),
										new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 2))
										.ignoreVines().build()),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
								BiomeFilter.biome())));

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).temperature(0.5f)
				.downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
	}

}
