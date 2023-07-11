package evannakita.infill;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import evannakita.infill.block.ModStairsBlock;

public class Infill implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("ljp");

	// Amethyst Slab
	public static final SlabBlock AMETHYST_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.AMETHYST)
		.strength(1.5F,1.5F)
		.sounds(BlockSoundGroup.AMETHYST_BLOCK)
		.requiresTool());

	// Amethyst Stairs
	public static final ModStairsBlock AMETHYST_STAIRS = new ModStairsBlock(
		Blocks.AMETHYST_BLOCK.getDefaultState(),
		FabricBlockSettings.of(Material.AMETHYST)
		.strength(1.5F,1.5F)
		.sounds(BlockSoundGroup.AMETHYST_BLOCK)
		.requiresTool());

	// Calcite Pillar
	public static final PillarBlock CALCITE_PILLAR = new PillarBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F,0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Calcite Slab
	public static final SlabBlock CALCITE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F,0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Calcite Stairs
	public static final ModStairsBlock CALCITE_STAIRS = new ModStairsBlock(
		Blocks.CALCITE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F,0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Calcite Wall
	public static final WallBlock CALCITE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Chiseled Andesite
	public static final Block CHISELED_ANDESITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Chiseled Calcite
	public static final Block CHISELED_CALCITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Chiseled Diorite
	public static final Block CHISELED_DIORITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Chiseled Dripstone
	public static final Block CHISELED_DRIPSTONE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Chiseled Granite
	public static final Block CHISELED_GRANITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Chiseled Tuff
	public static final Block CHISELED_TUFF_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Cut Calcite
	public static final Block CUT_CALCITE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F,0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Cut Calcite Slab
	public static final SlabBlock CUT_CALCITE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F,0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Dripstone Pillar
	public static final PillarBlock DRIPSTONE_PILLAR = new PillarBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Dripstone Slab
	public static final SlabBlock DRIPSTONE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,1.5F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Dripstone Stairs
	public static final ModStairsBlock DRIPSTONE_STAIRS = new ModStairsBlock(
		Blocks.DRIPSTONE_BLOCK.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,1.5F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Dripstone Wall
	public static final WallBlock DRIPSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Obsidian Slab
	public static final SlabBlock OBSIDIAN_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.DECORATION)
		.strength(50.0F,1200.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Obsidian Stairs
	public static final ModStairsBlock OBSIDIAN_STAIRS = new ModStairsBlock(
		Blocks.OBSIDIAN.getDefaultState(),
		FabricBlockSettings.of(Material.DECORATION)
		.strength(50.0F,1200.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Andesite Wall
	public static final WallBlock POLISHED_ANDESITE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Calcite
	public static final Block POLISHED_CALCITE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F, 0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Polished Calcite Slab
	public static final SlabBlock POLISHED_CALCITE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F, 0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Polished Calcite Stairs
	public static final ModStairsBlock POLISHED_CALCITE_STAIRS = new ModStairsBlock(
		Infill.POLISHED_CALCITE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F, 0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Polished Calcite Wall
	public static final WallBlock POLISHED_CALCITE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.75F, 0.75F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Polished Diorite Wall
	public static final WallBlock POLISHED_DIORITE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Dripstone
	public static final Block POLISHED_DRIPSTONE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Dripstone Slab
	public static final SlabBlock POLISHED_DRIPSTONE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Dripstone Stairs
	public static final ModStairsBlock POLISHED_DRIPSTONE_STAIRS = new ModStairsBlock(
		Infill.POLISHED_DRIPSTONE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Dripstone Wall
	public static final WallBlock POLISHED_DRIPSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Granite Wall
	public static final WallBlock POLISHED_GRANITE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Red Sandstone
	public static final Block POLISHED_RED_SANDSTONE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Red Sandstone Slab
	public static final SlabBlock POLISHED_RED_SANDSTONE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Red Sandstone Stairs
	public static final ModStairsBlock POLISHED_RED_SANDSTONE_STAIRS = new ModStairsBlock(
		Infill.POLISHED_RED_SANDSTONE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Red Sandstone Wall
	public static final WallBlock POLISHED_RED_SANDSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Sandstone
	public static final Block POLISHED_SANDSTONE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Sandstone Slab
	public static final SlabBlock POLISHED_SANDSTONE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Sandstone Stairs
	public static final ModStairsBlock POLISHED_SANDSTONE_STAIRS = new ModStairsBlock(
		Infill.POLISHED_SANDSTONE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Sandstone Wall
	public static final WallBlock POLISHED_SANDSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Polished Tuff
	public static final Block POLISHED_TUFF = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Polished Tuff Slab
	public static final SlabBlock POLISHED_TUFF_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Polished Tuff Stairs
	public static final ModStairsBlock POLISHED_TUFF_STAIRS = new ModStairsBlock(
		Infill.POLISHED_TUFF.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Polished Tuff Wall
	public static final WallBlock POLISHED_TUFF_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Red Sandstone Pillar
	public static final PillarBlock RED_SANDSTONE_PILLAR = new PillarBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Sandstone Pillar
	public static final PillarBlock SANDSTONE_PILLAR = new PillarBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(0.8F, 0.8F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Smooth Calcite
	public static final Block SMOOTH_CALCITE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F, 6.0F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Smooth Basalt Slab
	public static final SlabBlock SMOOTH_BASALT_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F, 4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Smooth Basalt Stairs
	public static final ModStairsBlock SMOOTH_BASALT_STAIRS = new ModStairsBlock(
		Blocks.SMOOTH_BASALT.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F, 4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Smooth Basalt Wall
	public static final WallBlock SMOOTH_BASALT_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F, 4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Smooth Calcite Slab
	public static final SlabBlock SMOOTH_CALCITE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F, 6.0F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Smooth Calcite Stairs
	public static final ModStairsBlock SMOOTH_CALCITE_STAIRS = new ModStairsBlock(
		Infill.SMOOTH_CALCITE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F, 6.0F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Smooth Calcite Wall
	public static final WallBlock SMOOTH_CALCITE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,6.0F)
		.sounds(BlockSoundGroup.CALCITE)
		.requiresTool());

	// Smooth Dripstone
	public static final Block SMOOTH_DRIPSTONE = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F, 6.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Smooth Dripstone Slab
	public static final SlabBlock SMOOTH_DRIPSTONE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F, 6.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Smooth Dripstone Stairs
	public static final ModStairsBlock SMOOTH_DRIPSTONE_STAIRS = new ModStairsBlock(
		Infill.SMOOTH_DRIPSTONE.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F, 6.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Smooth Dripstone Wall
	public static final WallBlock SMOOTH_DRIPSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,6.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Smooth Red Sandstone Wall
	public static final WallBlock SMOOTH_RED_SANDSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Smooth Sandstone Wall
	public static final WallBlock SMOOTH_SANDSTONE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Tuff Slab
	public static final SlabBlock TUFF_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Tuff Stairs
	public static final ModStairsBlock TUFF_STAIRS = new ModStairsBlock(
		Blocks.TUFF.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Tuff Wall
	public static final WallBlock TUFF_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		// Amethyst Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "amethyst_slab"), AMETHYST_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "amethyst_slab"), new BlockItem(AMETHYST_SLAB, new FabricItemSettings()));

		// Amethyst Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "amethyst_stairs"), AMETHYST_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "amethyst_stairs"), new BlockItem(AMETHYST_STAIRS, new FabricItemSettings()));

		// Calcite Pillar
		Registry.register(Registries.BLOCK, new Identifier("ljp", "calcite_pillar"), CALCITE_PILLAR);
		Registry.register(Registries.ITEM, new Identifier("ljp", "calcite_pillar"), new BlockItem(CALCITE_PILLAR, new FabricItemSettings()));

		// Calcite Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "calcite_slab"), CALCITE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "calcite_slab"), new BlockItem(CALCITE_SLAB, new FabricItemSettings()));

		// Calcite Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "calcite_stairs"), CALCITE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "calcite_stairs"), new BlockItem(CALCITE_STAIRS, new FabricItemSettings()));

		// Calcite Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "calcite_wall"), CALCITE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "calcite_wall"), new BlockItem(CALCITE_WALL, new FabricItemSettings()));

		// Chiseled Andesite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "chiseled_andesite_bricks"), CHISELED_ANDESITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "chiseled_andesite_bricks"), new BlockItem(CHISELED_ANDESITE_BRICKS, new FabricItemSettings()));

		// Chiseled Calcite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "chiseled_calcite_bricks"), CHISELED_CALCITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "chiseled_calcite_bricks"), new BlockItem(CHISELED_CALCITE_BRICKS, new FabricItemSettings()));

		// Chiseled Diorite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "chiseled_diorite_bricks"), CHISELED_DIORITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "chiseled_diorite_bricks"), new BlockItem(CHISELED_DIORITE_BRICKS, new FabricItemSettings()));

		// Chiseled Dripstone
		Registry.register(Registries.BLOCK, new Identifier("ljp", "chiseled_dripstone"), CHISELED_DRIPSTONE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "chiseled_dripstone"), new BlockItem(CHISELED_DRIPSTONE, new FabricItemSettings()));

		// Chiseled Granite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "chiseled_granite_bricks"), CHISELED_GRANITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "chiseled_granite_bricks"), new BlockItem(CHISELED_GRANITE_BRICKS, new FabricItemSettings()));

		// Chiseled Tuff
		Registry.register(Registries.BLOCK, new Identifier("ljp", "chiseled_tuff_bricks"), CHISELED_TUFF_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "chiseled_tuff_bricks"), new BlockItem(CHISELED_TUFF_BRICKS, new FabricItemSettings()));

		// Cut Calcite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "cut_calcite"), CUT_CALCITE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "cut_calcite"), new BlockItem(CUT_CALCITE, new FabricItemSettings()));

		// Cut Calcite Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "cut_calcite_slab"), CUT_CALCITE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "cut_calcite_slab"), new BlockItem(CUT_CALCITE_SLAB, new FabricItemSettings()));

		// Dripstone Pillar
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dripstone_pillar"), DRIPSTONE_PILLAR);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dripstone_pillar"), new BlockItem(DRIPSTONE_PILLAR, new FabricItemSettings()));

		// Dripstone Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dripstone_slab"), DRIPSTONE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dripstone_slab"), new BlockItem(DRIPSTONE_SLAB, new FabricItemSettings()));

		// Dripstone Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dripstone_stairs"), DRIPSTONE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dripstone_stairs"), new BlockItem(DRIPSTONE_STAIRS, new FabricItemSettings()));

		// Dripstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dripstone_wall"), DRIPSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dripstone_wall"), new BlockItem(DRIPSTONE_WALL, new FabricItemSettings()));

		// Obsidian Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "obsidian_slab"), OBSIDIAN_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "obsidian_slab"), new BlockItem(OBSIDIAN_SLAB, new FabricItemSettings()));

		// Obsidian Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "obsidian_stairs"), OBSIDIAN_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "obsidian_stairs"), new BlockItem(OBSIDIAN_STAIRS, new FabricItemSettings()));

		// Polished Andesite Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_andesite_wall"), POLISHED_ANDESITE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_andesite_wall"), new BlockItem(POLISHED_ANDESITE_WALL, new FabricItemSettings()));

		// Polished Calcite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_calcite"), POLISHED_CALCITE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_calcite"), new BlockItem(POLISHED_CALCITE, new FabricItemSettings()));

		// Polished Calcite Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_calcite_slab"), POLISHED_CALCITE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_calcite_slab"), new BlockItem(POLISHED_CALCITE_SLAB, new FabricItemSettings()));

		// Polished Calcite Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_calcite_stairs"), POLISHED_CALCITE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_calcite_stairs"), new BlockItem(POLISHED_CALCITE_STAIRS, new FabricItemSettings()));

		// Polished Calcite Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_calcite_wall"), POLISHED_CALCITE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_calcite_wall"), new BlockItem(POLISHED_CALCITE_WALL, new FabricItemSettings()));

		// Polished Diorite Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_diorite_wall"), POLISHED_DIORITE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_diorite_wall"), new BlockItem(POLISHED_DIORITE_WALL, new FabricItemSettings()));

		// Polished Dripstone
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone"), POLISHED_DRIPSTONE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone"), new BlockItem(POLISHED_DRIPSTONE, new FabricItemSettings()));

		// Polished Dripstone Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_slab"), new BlockItem(POLISHED_DRIPSTONE_SLAB, new FabricItemSettings()));

		// Polished Dripstone Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_stairs"), new BlockItem(POLISHED_DRIPSTONE_STAIRS, new FabricItemSettings()));

		// Polished Dripstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_wall"), POLISHED_DRIPSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_wall"), new BlockItem(POLISHED_DRIPSTONE_WALL, new FabricItemSettings()));

		// Polished Granite Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_granite_wall"), POLISHED_GRANITE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_granite_wall"), new BlockItem(POLISHED_GRANITE_WALL, new FabricItemSettings()));

		// Polished Red Sandstone
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_red_sandstone"), POLISHED_RED_SANDSTONE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_red_sandstone"), new BlockItem(POLISHED_RED_SANDSTONE, new FabricItemSettings()));

		// Polished Red Sandstone Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_red_sandstone_slab"), POLISHED_RED_SANDSTONE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_red_sandstone_slab"), new BlockItem(POLISHED_RED_SANDSTONE_SLAB, new FabricItemSettings()));

		// Polished Red Sandstone Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_red_sandstone_stairs"), POLISHED_RED_SANDSTONE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_red_sandstone_stairs"), new BlockItem(POLISHED_RED_SANDSTONE_STAIRS, new FabricItemSettings()));

		// Polished Red Sandstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_red_sandstone_wall"), POLISHED_RED_SANDSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_red_sandstone_wall"), new BlockItem(POLISHED_RED_SANDSTONE_WALL, new FabricItemSettings()));

		// Polished Sandstone
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_sandstone"), POLISHED_SANDSTONE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_sandstone"), new BlockItem(POLISHED_SANDSTONE, new FabricItemSettings()));

		// Polished Sandstone Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_sandstone_slab"), POLISHED_SANDSTONE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_sandstone_slab"), new BlockItem(POLISHED_SANDSTONE_SLAB, new FabricItemSettings()));

		// Polished Sandstone Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_sandstone_stairs"), POLISHED_SANDSTONE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_sandstone_stairs"), new BlockItem(POLISHED_SANDSTONE_STAIRS, new FabricItemSettings()));

		// Polished Sandstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_sandstone_wall"), POLISHED_SANDSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_sandstone_wall"), new BlockItem(POLISHED_SANDSTONE_WALL, new FabricItemSettings()));

		// Polished Tuff
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_tuff"), POLISHED_TUFF);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_tuff"), new BlockItem(POLISHED_TUFF, new FabricItemSettings()));

		// Polished Tuff Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_tuff_slab"), POLISHED_TUFF_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_tuff_slab"), new BlockItem(POLISHED_TUFF_SLAB, new FabricItemSettings()));

		// Polished Tuff Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_tuff_stairs"), POLISHED_TUFF_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_tuff_stairs"), new BlockItem(POLISHED_TUFF_STAIRS, new FabricItemSettings()));

		// Polished Tuff Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_tuff_wall"), POLISHED_TUFF_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_tuff_wall"), new BlockItem(POLISHED_TUFF_WALL, new FabricItemSettings()));

		// Red Sandstone Pillar
		Registry.register(Registries.BLOCK, new Identifier("ljp", "red_sandstone_pillar"), RED_SANDSTONE_PILLAR);
		Registry.register(Registries.ITEM, new Identifier("ljp", "red_sandstone_pillar"), new BlockItem(RED_SANDSTONE_PILLAR, new FabricItemSettings()));

		// Sandstone Pillar
		Registry.register(Registries.BLOCK, new Identifier("ljp", "sandstone_pillar"), SANDSTONE_PILLAR);
		Registry.register(Registries.ITEM, new Identifier("ljp", "sandstone_pillar"), new BlockItem(SANDSTONE_PILLAR, new FabricItemSettings()));

		// Smooth Basalt Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_basalt_slab"), SMOOTH_BASALT_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_basalt_slab"), new BlockItem(SMOOTH_BASALT_SLAB, new FabricItemSettings()));

		// Smooth Basalt Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_basalt_stairs"), SMOOTH_BASALT_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_basalt_stairs"), new BlockItem(SMOOTH_BASALT_STAIRS, new FabricItemSettings()));

		// Smooth Basalt Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_basalt_wall"), SMOOTH_BASALT_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_basalt_wall"), new BlockItem(SMOOTH_BASALT_WALL, new FabricItemSettings()));

		// Smooth Calcite
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_calcite"), SMOOTH_CALCITE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_calcite"), new BlockItem(SMOOTH_CALCITE, new FabricItemSettings()));

		// Smooth Calcite Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_calcite_slab"), SMOOTH_CALCITE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_calcite_slab"), new BlockItem(SMOOTH_CALCITE_SLAB, new FabricItemSettings()));

		// Smooth Calcite Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_calcite_stairs"), SMOOTH_CALCITE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_calcite_stairs"), new BlockItem(SMOOTH_CALCITE_STAIRS, new FabricItemSettings()));

		// Smooth Calcite Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_calcite_wall"), SMOOTH_CALCITE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_calcite_wall"), new BlockItem(SMOOTH_CALCITE_WALL, new FabricItemSettings()));

		// Smooth Dripstone
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_dripstone"), SMOOTH_DRIPSTONE);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_dripstone"), new BlockItem(SMOOTH_DRIPSTONE, new FabricItemSettings()));

		// Smooth Dripstone Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_dripstone_slab"), SMOOTH_DRIPSTONE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_dripstone_slab"), new BlockItem(SMOOTH_DRIPSTONE_SLAB, new FabricItemSettings()));

		// Smooth Dripstone Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_dripstone_stairs"), SMOOTH_DRIPSTONE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_dripstone_stairs"), new BlockItem(SMOOTH_DRIPSTONE_STAIRS, new FabricItemSettings()));

		// Smooth Dripstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_dripstone_wall"), SMOOTH_DRIPSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_dripstone_wall"), new BlockItem(SMOOTH_DRIPSTONE_WALL, new FabricItemSettings()));

		// Smooth Red Sandstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_red_sandstone_wall"), SMOOTH_RED_SANDSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_red_sandstone_wall"), new BlockItem(SMOOTH_RED_SANDSTONE_WALL, new FabricItemSettings()));

		// Smooth Sandstone Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "smooth_sandstone_wall"), SMOOTH_SANDSTONE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "smooth_sandstone_wall"), new BlockItem(SMOOTH_SANDSTONE_WALL, new FabricItemSettings()));

		// Tuff Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_slab"), TUFF_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_slab"), new BlockItem(TUFF_SLAB, new FabricItemSettings()));

		// Tuff Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_stairs"), TUFF_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_stairs"), new BlockItem(TUFF_STAIRS, new FabricItemSettings()));

		// Tuff Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_wall"), TUFF_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_wall"), new BlockItem(TUFF_WALL, new FabricItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.addAfter(Items.POLISHED_GRANITE_SLAB,
				POLISHED_GRANITE_WALL,
				CHISELED_GRANITE_BRICKS
			);
			content.addAfter(Items.POLISHED_DIORITE_SLAB,
				POLISHED_DIORITE_WALL,
				CHISELED_DIORITE_BRICKS
			);
			content.addAfter(Items.POLISHED_ANDESITE_SLAB,
				POLISHED_ANDESITE_WALL,
				CHISELED_ANDESITE_BRICKS,
				Items.TUFF,
				TUFF_STAIRS,
				TUFF_SLAB,
				TUFF_WALL,
				POLISHED_TUFF,
				POLISHED_TUFF_SLAB,
				POLISHED_TUFF_STAIRS,
				POLISHED_TUFF_WALL,
				CHISELED_TUFF_BRICKS
			);
			content.addAfter(Items.REINFORCED_DEEPSLATE,
				Items.DRIPSTONE_BLOCK,
				DRIPSTONE_STAIRS,
				DRIPSTONE_SLAB,
				DRIPSTONE_WALL,
				CHISELED_DRIPSTONE,
				SMOOTH_DRIPSTONE,
				SMOOTH_DRIPSTONE_STAIRS,
				SMOOTH_DRIPSTONE_SLAB,
				SMOOTH_DRIPSTONE_WALL,
				DRIPSTONE_PILLAR,
				POLISHED_DRIPSTONE,
				POLISHED_DRIPSTONE_STAIRS,
				POLISHED_DRIPSTONE_SLAB,
				POLISHED_DRIPSTONE_WALL
			);
			content.addAfter(Items.SMOOTH_SANDSTONE_SLAB,
				SMOOTH_SANDSTONE_WALL
			);
			content.addAfter(Items.CUT_SANDSTONE_SLAB,
				SANDSTONE_PILLAR,
				POLISHED_SANDSTONE,
				POLISHED_SANDSTONE_STAIRS,
				POLISHED_SANDSTONE_SLAB,
				POLISHED_SANDSTONE_WALL
			);
			content.addAfter(Items.SMOOTH_RED_SANDSTONE_SLAB,
				SMOOTH_RED_SANDSTONE_WALL
			);
			content.addAfter(Items.CUT_RED_SANDSTONE_SLAB,
				RED_SANDSTONE_PILLAR,
				POLISHED_RED_SANDSTONE,
				POLISHED_RED_SANDSTONE_STAIRS,
				POLISHED_RED_SANDSTONE_SLAB,
				POLISHED_RED_SANDSTONE_WALL,
				Items.CALCITE,
				CALCITE_STAIRS,
				CALCITE_SLAB,
				CALCITE_WALL,
				CHISELED_CALCITE_BRICKS,
				SMOOTH_CALCITE,
				SMOOTH_CALCITE_STAIRS,
				SMOOTH_CALCITE_SLAB,
				SMOOTH_CALCITE_WALL,
				CUT_CALCITE,
				CUT_CALCITE_SLAB,
				CALCITE_PILLAR,
				POLISHED_CALCITE,
				POLISHED_CALCITE_STAIRS,
				POLISHED_CALCITE_SLAB,
				POLISHED_CALCITE_WALL
			);
			content.addAfter(Items.SMOOTH_BASALT,
				SMOOTH_BASALT_STAIRS,
				SMOOTH_BASALT_SLAB,
				SMOOTH_BASALT_WALL
			);
			content.addAfter(Items.POLISHED_BLACKSTONE_BRICK_WALL,
				Items.OBSIDIAN,
				OBSIDIAN_STAIRS,
				OBSIDIAN_SLAB
			);
			content.addAfter(Items.AMETHYST_BLOCK,
				AMETHYST_STAIRS,
				AMETHYST_SLAB
			);
		});
	}
}