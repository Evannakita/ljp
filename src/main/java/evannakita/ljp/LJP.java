package evannakita.ljp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
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

		// Acacia Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "acacia_tiles"), ACACIA_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "acacia_tiles"), new BlockItem(ACACIA_TILES, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(ACACIA_TILES, 300);

		// Acacia Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "acacia_tile_slab"), ACACIA_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "acacia_tile_slab"), new BlockItem(ACACIA_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(ACACIA_TILE_STAIRS, 150);

		// Acacia Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "acacia_tile_stairs"), ACACIA_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "acacia_tile_stairs"), new BlockItem(ACACIA_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(ACACIA_TILE_STAIRS, 300);

		// Acacia Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "acacia_tile_wall"), ACACIA_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "acacia_tile_wall"), new BlockItem(ACACIA_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(ACACIA_TILE_STAIRS, 150);

		// Andesite Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "andesite_bricks"), ANDESITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "andesite_bricks"), new BlockItem(ANDESITE_BRICKS, new FabricItemSettings()));

		// Andesite Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "andesite_brick_slab"), ANDESITE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "andesite_brick_slab"), new BlockItem(ANDESITE_BRICK_SLAB, new FabricItemSettings()));

		// Andesite Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "andesite_brick_stairs"), ANDESITE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "andesite_brick_stairs"), new BlockItem(ANDESITE_BRICK_STAIRS, new FabricItemSettings()));

		// Andesite Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "andesite_brick_wall"), ANDESITE_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "andesite_brick_wall"), new BlockItem(ANDESITE_BRICK_WALL, new FabricItemSettings()));

		// Basalt Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "basalt_bricks"), BASALT_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "basalt_bricks"), new BlockItem(BASALT_BRICKS, new FabricItemSettings()));

		// Basalt Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "basalt_brick_slab"), BASALT_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "basalt_brick_slab"), new BlockItem(BASALT_BRICK_SLAB, new FabricItemSettings()));

		// Basalt Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "basalt_brick_stairs"), BASALT_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "basalt_brick_stairs"), new BlockItem(BASALT_BRICK_STAIRS, new FabricItemSettings()));

		// Basalt Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "basalt_brick_wall"), BASALT_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "basalt_brick_wall"), new BlockItem(BASALT_BRICK_WALL, new FabricItemSettings()));

		// Birch Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "birch_tiles"), BIRCH_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "birch_tiles"), new BlockItem(BIRCH_TILES, new FabricItemSettings()));		
		FuelRegistry.INSTANCE.add(BIRCH_TILES, 300);

		// Birch Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "birch_tile_slab"), BIRCH_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "birch_tile_slab"), new BlockItem(BIRCH_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(BIRCH_TILE_STAIRS, 150);

		// Birch Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "birch_tile_stairs"), BIRCH_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "birch_tile_stairs"), new BlockItem(BIRCH_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(BIRCH_TILE_STAIRS, 300);

		// Birch Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "birch_tile_wall"), BIRCH_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "birch_tile_wall"), new BlockItem(BIRCH_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(BIRCH_TILE_STAIRS, 150);

		// Cracked Polished Dripstone Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "cracked_polished_dripstone_bricks"), CRACKED_POLISHED_DRIPSTONE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "cracked_polished_dripstone_bricks"), new BlockItem(CRACKED_POLISHED_DRIPSTONE_BRICKS, new FabricItemSettings()));

		// Crimson Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "crimson_tiles"), CRIMSON_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "crimson_tiles"), new BlockItem(CRIMSON_TILES, new FabricItemSettings()));

		// Crimson Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "crimson_tile_slab"), CRIMSON_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "crimson_tile_slab"), new BlockItem(CRIMSON_TILE_SLAB, new FabricItemSettings()));

		// Crimson Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "crimson_tile_stairs"), CRIMSON_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "crimson_tile_stairs"), new BlockItem(CRIMSON_TILE_STAIRS, new FabricItemSettings()));

		// Crimson Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "crimson_tile_wall"), CRIMSON_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "crimson_tile_wall"), new BlockItem(CRIMSON_TILE_WALL, new FabricItemSettings()));

		// Dark Oak Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dark_oak_tiles"), DARK_OAK_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dark_oak_tiles"), new BlockItem(DARK_OAK_TILES, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILES, 300);

		// Dark Oak Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dark_oak_tile_slab"), DARK_OAK_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dark_oak_tile_slab"), new BlockItem(DARK_OAK_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILE_STAIRS, 150);

		// Dark Oak Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dark_oak_tile_stairs"), DARK_OAK_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dark_oak_tile_stairs"), new BlockItem(DARK_OAK_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILE_STAIRS, 300);

		// Dark Oak Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "dark_oak_tile_wall"), DARK_OAK_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "dark_oak_tile_wall"), new BlockItem(DARK_OAK_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(DARK_OAK_TILE_STAIRS, 150);

		// Diorite Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "diorite_bricks"), DIORITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "diorite_bricks"), new BlockItem(DIORITE_BRICKS, new FabricItemSettings()));

		// Diorite Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "diorite_brick_slab"), DIORITE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "diorite_brick_slab"), new BlockItem(DIORITE_BRICK_SLAB, new FabricItemSettings()));

		// Diorite Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "diorite_brick_stairs"), DIORITE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "diorite_brick_stairs"), new BlockItem(DIORITE_BRICK_STAIRS, new FabricItemSettings()));

		// Diorite Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "diorite_brick_wall"), DIORITE_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "diorite_brick_wall"), new BlockItem(DIORITE_BRICK_WALL, new FabricItemSettings()));

		// Granite Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "granite_bricks"), GRANITE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "granite_bricks"), new BlockItem(GRANITE_BRICKS, new FabricItemSettings()));

		// Granite Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "granite_brick_slab"), GRANITE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "granite_brick_slab"), new BlockItem(GRANITE_BRICK_SLAB, new FabricItemSettings()));

		// Granite Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "granite_brick_stairs"), GRANITE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "granite_brick_stairs"), new BlockItem(GRANITE_BRICK_STAIRS, new FabricItemSettings()));

		// Granite Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "granite_brick_wall"), GRANITE_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "granite_brick_wall"), new BlockItem(GRANITE_BRICK_WALL, new FabricItemSettings()));

		// Jungle Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "jungle_tiles"), JUNGLE_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "jungle_tiles"), new BlockItem(JUNGLE_TILES, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(JUNGLE_TILES, 300);

		// Jungle Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "jungle_tile_slab"), JUNGLE_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "jungle_tile_slab"), new BlockItem(JUNGLE_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(JUNGLE_TILE_STAIRS, 150);

		// Jungle Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "jungle_tile_stairs"), JUNGLE_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "jungle_tile_stairs"), new BlockItem(JUNGLE_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(JUNGLE_TILE_STAIRS, 300);

		// Jungle Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "jungle_tile_wall"), JUNGLE_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "jungle_tile_wall"), new BlockItem(JUNGLE_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(JUNGLE_TILE_STAIRS, 150);

		// Mangrove Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mangrove_tiles"), MANGROVE_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mangrove_tiles"), new BlockItem(MANGROVE_TILES, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(MANGROVE_TILES, 300);

		// Mangrove Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mangrove_tile_slab"), MANGROVE_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mangrove_tile_slab"), new BlockItem(MANGROVE_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(MANGROVE_TILE_STAIRS, 150);

		// Mangrove Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mangrove_tile_stairs"), MANGROVE_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mangrove_tile_stairs"), new BlockItem(MANGROVE_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(MANGROVE_TILE_STAIRS, 300);

		// Mangrove Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mangrove_tile_wall"), MANGROVE_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mangrove_tile_wall"), new BlockItem(MANGROVE_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(MANGROVE_TILE_STAIRS, 150);

		// Mossy Polished Dripstone Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_bricks"), MOSSY_POLISHED_DRIPSTONE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mossy_polished_dripstone_bricks"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICKS, new FabricItemSettings()));

		// Mossy Polished Dripstone Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_brick_slab"), MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mossy_polished_dripstone_brick_slab"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB, new FabricItemSettings()));

		// Mossy Polished Dripstone Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_brick_stairs"), MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mossy_polished_dripstone_brick_stairs"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS, new FabricItemSettings()));

		// Mossy Polished Dripstone Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "mossy_polished_dripstone_brick_wall"), MOSSY_POLISHED_DRIPSTONE_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "mossy_polished_dripstone_brick_wall"), new BlockItem(MOSSY_POLISHED_DRIPSTONE_BRICK_WALL, new FabricItemSettings()));

		// Oak Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "oak_tiles"), OAK_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "oak_tiles"), new BlockItem(OAK_TILES, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(OAK_TILES, 300);

		// Oak Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "oak_tile_slab"), OAK_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "oak_tile_slab"), new BlockItem(OAK_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(OAK_TILE_STAIRS, 150);

		// Oak Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "oak_tile_stairs"), OAK_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "oak_tile_stairs"), new BlockItem(OAK_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(OAK_TILE_STAIRS, 300);

		// Oak Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "oak_tile_wall"), OAK_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "oak_tile_wall"), new BlockItem(OAK_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(OAK_TILE_STAIRS, 150);

		// Polished Dripstone Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_bricks"), POLISHED_DRIPSTONE_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_bricks"), new BlockItem(POLISHED_DRIPSTONE_BRICKS, new FabricItemSettings()));

		// Polished Dripstone Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_brick_slab"), POLISHED_DRIPSTONE_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_brick_slab"), new BlockItem(POLISHED_DRIPSTONE_BRICK_SLAB, new FabricItemSettings()));

		// Polished Dripstone Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_brick_stairs"), POLISHED_DRIPSTONE_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_brick_stairs"), new BlockItem(POLISHED_DRIPSTONE_BRICK_STAIRS, new FabricItemSettings()));

		// Polished Dripstone Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "polished_dripstone_brick_wall"), POLISHED_DRIPSTONE_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "polished_dripstone_brick_wall"), new BlockItem(POLISHED_DRIPSTONE_BRICK_WALL, new FabricItemSettings()));

		// Spruce Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "spruce_tiles"), SPRUCE_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "spruce_tiles"), new BlockItem(SPRUCE_TILES, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(SPRUCE_TILES, 300);

		// Spruce Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "spruce_tile_slab"), SPRUCE_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "spruce_tile_slab"), new BlockItem(SPRUCE_TILE_SLAB, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(SPRUCE_TILE_STAIRS, 150);

		// Spruce Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "spruce_tile_stairs"), SPRUCE_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "spruce_tile_stairs"), new BlockItem(SPRUCE_TILE_STAIRS, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(SPRUCE_TILE_STAIRS, 300);

		// Spruce Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "spruce_tile_wall"), SPRUCE_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "spruce_tile_wall"), new BlockItem(SPRUCE_TILE_WALL, new FabricItemSettings()));
		FuelRegistry.INSTANCE.add(SPRUCE_TILE_STAIRS, 150);

		// Tuff Bricks
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_bricks"), TUFF_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_bricks"), new BlockItem(TUFF_BRICKS, new FabricItemSettings()));

		// Tuff Brick Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_brick_slab"), TUFF_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_brick_slab"), new BlockItem(TUFF_BRICK_SLAB, new FabricItemSettings()));

		// Tuff Brick Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_brick_stairs"), TUFF_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_brick_stairs"), new BlockItem(TUFF_BRICK_STAIRS, new FabricItemSettings()));

		// Tuff Brick Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "tuff_brick_wall"), TUFF_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "tuff_brick_wall"), new BlockItem(TUFF_BRICK_WALL, new FabricItemSettings()));

		// Warped Tiles
		Registry.register(Registries.BLOCK, new Identifier("ljp", "warped_tiles"), WARPED_TILES);
		Registry.register(Registries.ITEM, new Identifier("ljp", "warped_tiles"), new BlockItem(WARPED_TILES, new FabricItemSettings()));

		// Warped Tile Slab
		Registry.register(Registries.BLOCK, new Identifier("ljp", "warped_tile_slab"), WARPED_TILE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("ljp", "warped_tile_slab"), new BlockItem(WARPED_TILE_SLAB, new FabricItemSettings()));

		// Warped Tile Stairs
		Registry.register(Registries.BLOCK, new Identifier("ljp", "warped_tile_stairs"), WARPED_TILE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("ljp", "warped_tile_stairs"), new BlockItem(WARPED_TILE_STAIRS, new FabricItemSettings()));

		// Warped Tile Wall
		Registry.register(Registries.BLOCK, new Identifier("ljp", "warped_tile_wall"), WARPED_TILE_WALL);
		Registry.register(Registries.ITEM, new Identifier("ljp", "warped_tile_wall"), new BlockItem(WARPED_TILE_WALL, new FabricItemSettings()));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.addAfter(Items.STRIPPED_OAK_WOOD,
				OAK_TILES,
				OAK_TILE_STAIRS,
				OAK_TILE_SLAB,
				OAK_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_SPRUCE_WOOD,
				SPRUCE_TILES,
				SPRUCE_TILE_STAIRS,
				SPRUCE_TILE_SLAB,
				SPRUCE_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_BIRCH_WOOD,
				BIRCH_TILES,
				BIRCH_TILE_STAIRS,
				BIRCH_TILE_SLAB,
				BIRCH_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_JUNGLE_WOOD,
				JUNGLE_TILES,
				JUNGLE_TILE_STAIRS,
				JUNGLE_TILE_SLAB,
				JUNGLE_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_ACACIA_WOOD,
				ACACIA_TILES,
				ACACIA_TILE_STAIRS,
				ACACIA_TILE_SLAB,
				ACACIA_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_DARK_OAK_WOOD,
				DARK_OAK_TILES,
				DARK_OAK_TILE_STAIRS,
				DARK_OAK_TILE_SLAB,
				DARK_OAK_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_MANGROVE_WOOD,
				MANGROVE_TILES,
				MANGROVE_TILE_STAIRS,
				MANGROVE_TILE_SLAB,
				MANGROVE_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_CRIMSON_HYPHAE,
				CRIMSON_TILES,
				CRIMSON_TILE_STAIRS,
				CRIMSON_TILE_SLAB,
				CRIMSON_TILE_WALL
			);
			content.addAfter(Items.STRIPPED_WARPED_HYPHAE,
				WARPED_TILES,
				WARPED_TILE_STAIRS,
				WARPED_TILE_SLAB,
				WARPED_TILE_WALL
			);
			content.addAfter(Items.POLISHED_GRANITE_SLAB,
				GRANITE_BRICKS,
				GRANITE_BRICK_STAIRS,
				GRANITE_BRICK_SLAB,
				GRANITE_BRICK_WALL
			);
			content.addAfter(Items.POLISHED_DIORITE_SLAB,
				DIORITE_BRICKS,
				DIORITE_BRICK_STAIRS,
				DIORITE_BRICK_SLAB,
				DIORITE_BRICK_WALL
			);
			content.addAfter(Items.POLISHED_ANDESITE_SLAB,
				ANDESITE_BRICKS,
				ANDESITE_BRICK_STAIRS,
				ANDESITE_BRICK_SLAB,
				ANDESITE_BRICK_WALL
			);
			content.addAfter(Items.REINFORCED_DEEPSLATE,
				POLISHED_DRIPSTONE_BRICKS,
				CRACKED_POLISHED_DRIPSTONE_BRICKS,
				POLISHED_DRIPSTONE_BRICK_STAIRS,
				POLISHED_DRIPSTONE_BRICK_SLAB,
				POLISHED_DRIPSTONE_BRICK_WALL,
				MOSSY_POLISHED_DRIPSTONE_BRICKS,
				MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS,
				MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB,
				MOSSY_POLISHED_DRIPSTONE_BRICK_WALL
			);
			content.addAfter(Items.POLISHED_BASALT,
				BASALT_BRICKS,
				BASALT_BRICK_SLAB,
				BASALT_BRICK_STAIRS,
				BASALT_BRICK_WALL
			);
		});
	}
}