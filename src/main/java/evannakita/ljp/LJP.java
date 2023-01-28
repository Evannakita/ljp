package evannakita.ljp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import evannakita.ljp.block.ModStairsBlock;
import evannakita.ljp.util.ModFlammableBlocks;

public class LJP implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("ljp");

	// Acacia Tiles
	public static final Block ACACIA_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Acacia Tile Slab
	public static final SlabBlock ACACIA_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Acacia Tile Stairs
	public static final ModStairsBlock ACACIA_TILE_STAIRS = new ModStairsBlock(
		LJP.ACACIA_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Acacia Tile Wall
	public static final WallBlock ACACIA_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

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

	// Andesite Bricks
	public static final Block ANDESITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Andesite Brick Slab
	public static final SlabBlock ANDESITE_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Andesite Brick Stairs
	public static final ModStairsBlock ANDESITE_BRICK_STAIRS = new ModStairsBlock(
		LJP.ANDESITE_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Andesite Brick Wall
	public static final WallBlock ANDESITE_BRICK_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Basalt Bricks
	public static final PillarBlock BASALT_BRICKS = new PillarBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F,4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Basalt Brick Slab
	public static final SlabBlock BASALT_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F,4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Basalt Brick Stairs
	public static final ModStairsBlock BASALT_BRICK_STAIRS = new ModStairsBlock(
		LJP.BASALT_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F,4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Basalt Brick Wall
	public static final WallBlock BASALT_BRICK_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.25F,4.2F)
		.sounds(BlockSoundGroup.BASALT)
		.requiresTool());

	// Birch Tiles
	public static final Block BIRCH_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Birch Tile Slab
	public static final SlabBlock BIRCH_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Birch Tile Stairs
	public static final ModStairsBlock BIRCH_TILE_STAIRS = new ModStairsBlock(
		LJP.BIRCH_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Birch Tile Wall
	public static final WallBlock BIRCH_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

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

	// Chiseled Granite Bricks
	public static final Block CHISELED_GRANITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Chiseled Tuff Bricks
	public static final Block CHISELED_TUFF_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Cracked Polished Dripstone Bricks
	public static final Block CRACKED_POLISHED_DRIPSTONE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Crimson Tiles
	public static final Block CRIMSON_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Crimson Tile Slab
	public static final SlabBlock CRIMSON_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Crimson Tile Stairs
	public static final ModStairsBlock CRIMSON_TILE_STAIRS = new ModStairsBlock(
		LJP.CRIMSON_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Crimson Tile Wall
	public static final WallBlock CRIMSON_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

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

	// Dark Oak Tiles
	public static final Block DARK_OAK_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Dark Oak Tile Slab
	public static final SlabBlock DARK_OAK_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Dark Oak Tile Stairs
	public static final ModStairsBlock DARK_OAK_TILE_STAIRS = new ModStairsBlock(
		LJP.DARK_OAK_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Dark Oak Tile Wall
	public static final WallBlock DARK_OAK_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Diorite Bricks
	public static final Block DIORITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Diorite Brick Slab
	public static final SlabBlock DIORITE_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Diorite Brick Stairs
	public static final ModStairsBlock DIORITE_BRICK_STAIRS = new ModStairsBlock(
		LJP.DIORITE_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Diorite Brick Wall
	public static final WallBlock DIORITE_BRICK_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
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

	// Granite Bricks
	public static final Block GRANITE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Granite Brick Slab
	public static final SlabBlock GRANITE_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Granite Brick Stairs
	public static final ModStairsBlock GRANITE_BRICK_STAIRS = new ModStairsBlock(
		LJP.GRANITE_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Granite Brick Wall
	public static final WallBlock GRANITE_BRICK_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F,6.0F)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool());

	// Jungle Tiles
	public static final Block JUNGLE_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Jungle Tile Slab
	public static final SlabBlock JUNGLE_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Jungle Tile Stairs
	public static final ModStairsBlock JUNGLE_TILE_STAIRS = new ModStairsBlock(
		LJP.JUNGLE_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Jungle Tile Wall
	public static final WallBlock JUNGLE_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Mangrove Tiles
	public static final Block MANGROVE_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Mangrove Tile Slab
	public static final SlabBlock MANGROVE_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Mangrove Tile Stairs
	public static final ModStairsBlock MANGROVE_TILE_STAIRS = new ModStairsBlock(
		LJP.MANGROVE_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Mangrove Tile Wall
	public static final WallBlock MANGROVE_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Mossy Polished Dripstone Bricks
	public static final Block MOSSY_POLISHED_DRIPSTONE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Mossy Polished Dripstone Brick Slab
	public static final SlabBlock MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Mossy Polished Dripstone Brick Stairs
	public static final ModStairsBlock MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS = new ModStairsBlock(
		LJP.MOSSY_POLISHED_DRIPSTONE_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Mossy Polished Dripstone Brick Wall
	public static final WallBlock MOSSY_POLISHED_DRIPSTONE_BRICK_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Oak Tiles
	public static final Block OAK_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Oak Tile Slab
	public static final SlabBlock OAK_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Oak Tile Stairs
	public static final ModStairsBlock OAK_TILE_STAIRS = new ModStairsBlock(
		LJP.OAK_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Oak Tile Wall
	public static final WallBlock OAK_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

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
		LJP.POLISHED_CALCITE.getDefaultState(),
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
		LJP.POLISHED_DRIPSTONE.getDefaultState(),
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

	// Polished Dripstone Bricks
	public static final Block POLISHED_DRIPSTONE_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Dripstone Brick Slab
	public static final SlabBlock POLISHED_DRIPSTONE_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Dripstone Brick Stairs
	public static final ModStairsBlock POLISHED_DRIPSTONE_BRICK_STAIRS = new ModStairsBlock(
		LJP.POLISHED_DRIPSTONE_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 1.0F)
		.sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
		.requiresTool());

	// Polished Dripstone Brick Wall
	public static final WallBlock POLISHED_DRIPSTONE_BRICK_WALL = new WallBlock(
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
		LJP.POLISHED_RED_SANDSTONE.getDefaultState(),
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
		LJP.POLISHED_SANDSTONE.getDefaultState(),
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
		LJP.POLISHED_TUFF.getDefaultState(),
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
		LJP.SMOOTH_CALCITE.getDefaultState(),
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
		LJP.SMOOTH_DRIPSTONE.getDefaultState(),
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

	// Spruce Tiles
	public static final Block SPRUCE_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Spruce Tile Slab
	public static final SlabBlock SPRUCE_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Spruce Tile Stairs
	public static final ModStairsBlock SPRUCE_TILE_STAIRS = new ModStairsBlock(
		LJP.SPRUCE_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Spruce Tile Wall
	public static final WallBlock SPRUCE_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Tuff Bricks
	public static final Block TUFF_BRICKS = new Block(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Tuff Brick Slab
	public static final SlabBlock TUFF_BRICK_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Tuff Brick Stairs
	public static final ModStairsBlock TUFF_BRICK_STAIRS = new ModStairsBlock(
		LJP.TUFF_BRICKS.getDefaultState(),
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
		.requiresTool());

	// Tuff Brick Wall
	public static final WallBlock TUFF_BRICK_WALL = new WallBlock(
		FabricBlockSettings.of(Material.STONE)
		.strength(1.5F, 6.0F)
		.sounds(BlockSoundGroup.TUFF)
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

	// Warped Tiles
	public static final Block WARPED_TILES = new Block(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Warped Tile Slab
	public static final SlabBlock WARPED_TILE_SLAB = new SlabBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Warped Tile Stairs
	public static final ModStairsBlock WARPED_TILE_STAIRS = new ModStairsBlock(
		LJP.WARPED_TILES.getDefaultState(),
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	// Warped Tile Wall
	public static final WallBlock WARPED_TILE_WALL = new WallBlock(
		FabricBlockSettings.of(Material.WOOD)
		.strength(2.0F,2.0F)
		.sounds(BlockSoundGroup.WOOD));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModFlammableBlocks.registerFlammableBlocks();

		// Oak Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "oak_tiles"), OAK_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "oak_tiles"), new BlockItem(OAK_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(OAK_TILES, 300);

		// Oak Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "oak_tile_slab"), OAK_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "oak_tile_slab"), new BlockItem(OAK_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(OAK_TILE_STAIRS, 150);

		// Oak Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "oak_tile_stairs"), OAK_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "oak_tile_stairs"), new BlockItem(OAK_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(OAK_TILE_STAIRS, 300);

		// Oak Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "oak_tile_wall"), OAK_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "oak_tile_wall"), new BlockItem(OAK_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(OAK_TILE_STAIRS, 150);

		// Spruce Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "spruce_tiles"), SPRUCE_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "spruce_tiles"), new BlockItem(SPRUCE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(SPRUCE_TILES, 300);

		// Spruce Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "spruce_tile_slab"), SPRUCE_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "spruce_tile_slab"), new BlockItem(SPRUCE_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(SPRUCE_TILE_STAIRS, 150);

		// Spruce Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "spruce_tile_stairs"), SPRUCE_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "spruce_tile_stairs"), new BlockItem(SPRUCE_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(SPRUCE_TILE_STAIRS, 300);

		// Spruce Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "spruce_tile_wall"), SPRUCE_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "spruce_tile_wall"), new BlockItem(SPRUCE_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(SPRUCE_TILE_STAIRS, 150);

		// Birch Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "birch_tiles"), BIRCH_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "birch_tiles"), new BlockItem(BIRCH_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));		
		FuelRegistry.INSTANCE.add(BIRCH_TILES, 300);

		// Birch Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "birch_tile_slab"), BIRCH_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "birch_tile_slab"), new BlockItem(BIRCH_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(BIRCH_TILE_STAIRS, 150);

		// Birch Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "birch_tile_stairs"), BIRCH_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "birch_tile_stairs"), new BlockItem(BIRCH_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(BIRCH_TILE_STAIRS, 300);

		// Birch Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "birch_tile_wall"), BIRCH_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "birch_tile_wall"), new BlockItem(BIRCH_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(BIRCH_TILE_STAIRS, 150);

		// Jungle Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "jungle_tiles"), JUNGLE_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "jungle_tiles"), new BlockItem(JUNGLE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(JUNGLE_TILES, 300);

		// Jungle Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "jungle_tile_slab"), JUNGLE_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "jungle_tile_slab"), new BlockItem(JUNGLE_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(JUNGLE_TILE_STAIRS, 150);

		// Jungle Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "jungle_tile_stairs"), JUNGLE_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "jungle_tile_stairs"), new BlockItem(JUNGLE_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(JUNGLE_TILE_STAIRS, 300);

		// Jungle Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "jungle_tile_wall"), JUNGLE_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "jungle_tile_wall"), new BlockItem(JUNGLE_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(JUNGLE_TILE_STAIRS, 150);

		// Acacia Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "acacia_tiles"), ACACIA_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "acacia_tiles"), new BlockItem(ACACIA_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(ACACIA_TILES, 300);

		// Acacia Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "acacia_tile_slab"), ACACIA_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "acacia_tile_slab"), new BlockItem(ACACIA_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(ACACIA_TILE_STAIRS, 150);

		// Acacia Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "acacia_tile_stairs"), ACACIA_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "acacia_tile_stairs"), new BlockItem(ACACIA_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(ACACIA_TILE_STAIRS, 300);

		// Acacia Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "acacia_tile_wall"), ACACIA_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "acacia_tile_wall"), new BlockItem(ACACIA_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(ACACIA_TILE_STAIRS, 150);

		// Dark Oak Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dark_oak_tiles"), DARK_OAK_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dark_oak_tiles"), new BlockItem(DARK_OAK_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILES, 300);

		// Dark Oak Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dark_oak_tile_slab"), DARK_OAK_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dark_oak_tile_slab"), new BlockItem(DARK_OAK_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILE_STAIRS, 150);

		// Dark Oak Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dark_oak_tile_stairs"), DARK_OAK_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dark_oak_tile_stairs"), new BlockItem(DARK_OAK_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILE_STAIRS, 300);

		// Dark Oak Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dark_oak_tile_wall"), DARK_OAK_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dark_oak_tile_wall"), new BlockItem(DARK_OAK_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILE_STAIRS, 150);

		// Mangrove Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mangrove_tiles"), MANGROVE_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mangrove_tiles"), new BlockItem(MANGROVE_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(MANGROVE_TILES, 300);

		// Mangrove Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mangrove_tile_slab"), MANGROVE_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mangrove_tile_slab"), new BlockItem(MANGROVE_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(MANGROVE_TILE_STAIRS, 150);

		// Mangrove Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mangrove_tile_stairs"), MANGROVE_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mangrove_tile_stairs"), new BlockItem(MANGROVE_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(MANGROVE_TILE_STAIRS, 300);

		// Mangrove Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mangrove_tile_wall"), MANGROVE_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mangrove_tile_wall"), new BlockItem(MANGROVE_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		FuelRegistry.INSTANCE.add(MANGROVE_TILE_STAIRS, 150);

		// Crimson Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "crimson_tiles"), CRIMSON_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "crimson_tiles"), new BlockItem(CRIMSON_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Crimson Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "crimson_tile_slab"), CRIMSON_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "crimson_tile_slab"), new BlockItem(CRIMSON_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Crimson Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "crimson_tile_stairs"), CRIMSON_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "crimson_tile_stairs"), new BlockItem(CRIMSON_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Crimson Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "crimson_tile_wall"), CRIMSON_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "crimson_tile_wall"), new BlockItem(CRIMSON_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Warped Tiles
		Registry.register(Registry.BLOCK, new Identifier("ljp", "warped_tiles"), WARPED_TILES);
		Registry.register(Registry.ITEM, new Identifier("ljp", "warped_tiles"), new BlockItem(WARPED_TILES, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Warped Tile Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "warped_tile_slab"), WARPED_TILE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "warped_tile_slab"), new BlockItem(WARPED_TILE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Warped Tile Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "warped_tile_stairs"), WARPED_TILE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "warped_tile_stairs"), new BlockItem(WARPED_TILE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Warped Tile Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "warped_tile_wall"), WARPED_TILE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "warped_tile_wall"), new BlockItem(WARPED_TILE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Amethyst Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "amethyst_slab"), AMETHYST_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "amethyst_slab"), new BlockItem(AMETHYST_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Amethyst Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "amethyst_stairs"), AMETHYST_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "amethyst_stairs"), new BlockItem(AMETHYST_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Obsidian Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "obsidian_slab"), OBSIDIAN_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "obsidian_slab"), new BlockItem(OBSIDIAN_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Obsidian Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "obsidian_stairs"), OBSIDIAN_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "obsidian_stairs"), new BlockItem(OBSIDIAN_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Calcite Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "calcite_slab"), CALCITE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "calcite_slab"), new BlockItem(CALCITE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Calcite Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "calcite_stairs"), CALCITE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "calcite_stairs"), new BlockItem(CALCITE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Calcite Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "calcite_wall"), CALCITE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "calcite_wall"), new BlockItem(CALCITE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_slab"), TUFF_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_slab"), new BlockItem(TUFF_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_stairs"), TUFF_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_stairs"), new BlockItem(TUFF_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_wall"), TUFF_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_wall"), new BlockItem(TUFF_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Dripstone Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dripstone_slab"), DRIPSTONE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dripstone_slab"), new BlockItem(DRIPSTONE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Dripstone Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dripstone_stairs"), DRIPSTONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dripstone_stairs"), new BlockItem(DRIPSTONE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Dripstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dripstone_wall"), DRIPSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dripstone_wall"), new BlockItem(DRIPSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Sandstone Pillar
		Registry.register(Registry.BLOCK, new Identifier("ljp", "sandstone_pillar"), SANDSTONE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("ljp", "sandstone_pillar"), new BlockItem(SANDSTONE_PILLAR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Red Sandstone Pillar
		Registry.register(Registry.BLOCK, new Identifier("ljp", "red_sandstone_pillar"), RED_SANDSTONE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("ljp", "red_sandstone_pillar"), new BlockItem(RED_SANDSTONE_PILLAR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Cut Calcite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "cut_calcite"), CUT_CALCITE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "cut_calcite"), new BlockItem(CUT_CALCITE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Cut Calcite Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "cut_calcite_slab"), CUT_CALCITE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "cut_calcite_slab"), new BlockItem(CUT_CALCITE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Calcite Pillar
		Registry.register(Registry.BLOCK, new Identifier("ljp", "calcite_pillar"), CALCITE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("ljp", "calcite_pillar"), new BlockItem(CALCITE_PILLAR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Dripstone Pillar
		Registry.register(Registry.BLOCK, new Identifier("ljp", "dripstone_pillar"), DRIPSTONE_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("ljp", "dripstone_pillar"), new BlockItem(DRIPSTONE_PILLAR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Sandstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_sandstone_wall"), SMOOTH_SANDSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_sandstone_wall"), new BlockItem(SMOOTH_SANDSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Red Sandstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_red_sandstone_wall"), SMOOTH_RED_SANDSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_red_sandstone_wall"), new BlockItem(SMOOTH_RED_SANDSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Basalt Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_basalt_slab"), SMOOTH_BASALT_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_basalt_slab"), new BlockItem(SMOOTH_BASALT_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Basalt Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_basalt_stairs"), SMOOTH_BASALT_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_basalt_stairs"), new BlockItem(SMOOTH_BASALT_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Basalt Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_basalt_wall"), SMOOTH_BASALT_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_basalt_wall"), new BlockItem(SMOOTH_BASALT_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Calcite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_calcite"), SMOOTH_CALCITE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_calcite"), new BlockItem(SMOOTH_CALCITE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Calcite Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_calcite_slab"), SMOOTH_CALCITE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_calcite_slab"), new BlockItem(SMOOTH_CALCITE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Calcite Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_calcite_stairs"), SMOOTH_CALCITE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_calcite_stairs"), new BlockItem(SMOOTH_CALCITE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Calcite Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_calcite_wall"), SMOOTH_CALCITE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_calcite_wall"), new BlockItem(SMOOTH_CALCITE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Dripstone
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_dripstone"), SMOOTH_DRIPSTONE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_dripstone"), new BlockItem(SMOOTH_DRIPSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Dripstone Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_dripstone_slab"), SMOOTH_DRIPSTONE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_dripstone_slab"), new BlockItem(SMOOTH_DRIPSTONE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Dripstone Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_dripstone_stairs"), SMOOTH_DRIPSTONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_dripstone_stairs"), new BlockItem(SMOOTH_DRIPSTONE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Smooth Dripstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "smooth_dripstone_wall"), SMOOTH_DRIPSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "smooth_dripstone_wall"), new BlockItem(SMOOTH_DRIPSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Granite Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_granite_wall"), POLISHED_GRANITE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_granite_wall"), new BlockItem(POLISHED_GRANITE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Diorite Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_diorite_wall"), POLISHED_DIORITE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_diorite_wall"), new BlockItem(POLISHED_DIORITE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Andesite Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_andesite_wall"), POLISHED_ANDESITE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_andesite_wall"), new BlockItem(POLISHED_ANDESITE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Sandstone
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_sandstone"), POLISHED_SANDSTONE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_sandstone"), new BlockItem(POLISHED_SANDSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Sandstone Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_sandstone_slab"), POLISHED_SANDSTONE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_sandstone_slab"), new BlockItem(POLISHED_SANDSTONE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Sandstone Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_sandstone_stairs"), POLISHED_SANDSTONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_sandstone_stairs"), new BlockItem(POLISHED_SANDSTONE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Sandstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_sandstone_wall"), POLISHED_SANDSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_sandstone_wall"), new BlockItem(POLISHED_SANDSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Red Sandstone
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_red_sandstone"), POLISHED_RED_SANDSTONE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_red_sandstone"), new BlockItem(POLISHED_RED_SANDSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Red Sandstone Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_red_sandstone_slab"), POLISHED_RED_SANDSTONE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_red_sandstone_slab"), new BlockItem(POLISHED_RED_SANDSTONE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Red Sandstone Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_red_sandstone_stairs"), POLISHED_RED_SANDSTONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_red_sandstone_stairs"), new BlockItem(POLISHED_RED_SANDSTONE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Red Sandstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_red_sandstone_wall"), POLISHED_RED_SANDSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_red_sandstone_wall"), new BlockItem(POLISHED_RED_SANDSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Calcite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_calcite"), POLISHED_CALCITE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_calcite"), new BlockItem(POLISHED_CALCITE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Calcite Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_calcite_slab"), POLISHED_CALCITE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_calcite_slab"), new BlockItem(POLISHED_CALCITE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Calcite Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_calcite_stairs"), POLISHED_CALCITE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_calcite_stairs"), new BlockItem(POLISHED_CALCITE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Calcite Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_calcite_wall"), POLISHED_CALCITE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_calcite_wall"), new BlockItem(POLISHED_CALCITE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Tuff
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_tuff"), POLISHED_TUFF);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_tuff"), new BlockItem(POLISHED_TUFF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Tuff Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_tuff_slab"), POLISHED_TUFF_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_tuff_slab"), new BlockItem(POLISHED_TUFF_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Tuff Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_tuff_stairs"), POLISHED_TUFF_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_tuff_stairs"), new BlockItem(POLISHED_TUFF_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Tuff Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_tuff_wall"), POLISHED_TUFF_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_tuff_wall"), new BlockItem(POLISHED_TUFF_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone"), POLISHED_DRIPSTONE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone"), new BlockItem(POLISHED_DRIPSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_slab"), POLISHED_DRIPSTONE_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_slab"), new BlockItem(POLISHED_DRIPSTONE_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_stairs"), POLISHED_DRIPSTONE_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_stairs"), new BlockItem(POLISHED_DRIPSTONE_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_wall"), POLISHED_DRIPSTONE_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_wall"), new BlockItem(POLISHED_DRIPSTONE_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Chiseled Granite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "chiseled_granite_bricks"), CHISELED_GRANITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "chiseled_granite_bricks"), new BlockItem(CHISELED_GRANITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Chiseled Diorite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "chiseled_diorite_bricks"), CHISELED_DIORITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "chiseled_diorite_bricks"), new BlockItem(CHISELED_DIORITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Chiseled Andesite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "chiseled_andesite_bricks"), CHISELED_ANDESITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "chiseled_andesite_bricks"), new BlockItem(CHISELED_ANDESITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Chiseled Calcite
		Registry.register(Registry.BLOCK, new Identifier("ljp", "chiseled_calcite_bricks"), CHISELED_CALCITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "chiseled_calcite_bricks"), new BlockItem(CHISELED_CALCITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Chiseled Tuff
		Registry.register(Registry.BLOCK, new Identifier("ljp", "chiseled_tuff_bricks"), CHISELED_TUFF_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "chiseled_tuff_bricks"), new BlockItem(CHISELED_TUFF_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Chiseled Dripstone
		Registry.register(Registry.BLOCK, new Identifier("ljp", "chiseled_dripstone"), CHISELED_DRIPSTONE);
		Registry.register(Registry.ITEM, new Identifier("ljp", "chiseled_dripstone"), new BlockItem(CHISELED_DRIPSTONE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Granite Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "granite_bricks"), GRANITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Granite Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "granite_brick_slab"), GRANITE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "granite_brick_slab"), new BlockItem(GRANITE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Granite Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "granite_brick_stairs"), GRANITE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "granite_brick_stairs"), new BlockItem(GRANITE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Granite Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "granite_brick_wall"), GRANITE_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "granite_brick_wall"), new BlockItem(GRANITE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Diorite Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "diorite_bricks"), DIORITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Diorite Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "diorite_brick_slab"), DIORITE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "diorite_brick_slab"), new BlockItem(DIORITE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Diorite Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "diorite_brick_stairs"), DIORITE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "diorite_brick_stairs"), new BlockItem(DIORITE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Diorite Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "diorite_brick_wall"), DIORITE_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "diorite_brick_wall"), new BlockItem(DIORITE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Andesite Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "andesite_bricks"), ANDESITE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Andesite Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "andesite_brick_slab"), ANDESITE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "andesite_brick_slab"), new BlockItem(ANDESITE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Andesite Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "andesite_brick_stairs"), ANDESITE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "andesite_brick_stairs"), new BlockItem(ANDESITE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Andesite Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "andesite_brick_wall"), ANDESITE_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "andesite_brick_wall"), new BlockItem(ANDESITE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Basalt Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "basalt_bricks"), BASALT_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "basalt_bricks"), new BlockItem(BASALT_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Basalt Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "basalt_brick_slab"), BASALT_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "basalt_brick_slab"), new BlockItem(BASALT_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Basalt Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "basalt_brick_stairs"), BASALT_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "basalt_brick_stairs"), new BlockItem(BASALT_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Basalt Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "basalt_brick_wall"), BASALT_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "basalt_brick_wall"), new BlockItem(BASALT_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_bricks"), TUFF_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_bricks"), new BlockItem(TUFF_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_brick_slab"), TUFF_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_brick_slab"), new BlockItem(TUFF_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_brick_stairs"), TUFF_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_brick_stairs"), new BlockItem(TUFF_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Tuff Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "tuff_brick_wall"), TUFF_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "tuff_brick_wall"), new BlockItem(TUFF_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_bricks"), POLISHED_DRIPSTONE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_bricks"), new BlockItem(POLISHED_DRIPSTONE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Cracked Polished Dripstone Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "cracked_polished_dripstone_bricks"), CRACKED_POLISHED_DRIPSTONE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "cracked_polished_dripstone_bricks"), new BlockItem(CRACKED_POLISHED_DRIPSTONE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_brick_slab"), POLISHED_DRIPSTONE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_brick_slab"), new BlockItem(POLISHED_DRIPSTONE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_brick_stairs"), POLISHED_DRIPSTONE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_brick_stairs"), new BlockItem(POLISHED_DRIPSTONE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Polished Dripstone Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "polished_dripstone_brick_wall"), POLISHED_DRIPSTONE_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "polished_dripstone_brick_wall"), new BlockItem(POLISHED_DRIPSTONE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Mossy Polished Dripstone Bricks
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_bricks"), MOSSY_POLISHED_DRIPSTONE_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mossy_polished_dripstone_bricks"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Mossy Polished Dripstone Brick Slab
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_brick_slab"), MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mossy_polished_dripstone_brick_slab"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Mossy Polished Dripstone Brick Stairs
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_brick_stairs"), MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mossy_polished_dripstone_brick_stairs"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		// Mossy Polished Dripstone Brick Wall
		Registry.register(Registry.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_brick_wall"), MOSSY_POLISHED_DRIPSTONE_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("ljp", "mossy_polished_dripstone_brick_wall"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICK_WALL, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}