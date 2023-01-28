package com.evannakita.ljp.block;

import java.util.function.Supplier;

import com.evannakita.ljp.LJP;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LJP.MOD_ID);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // Oak Tiles
    public static final RegistryObject<Block> OAK_TILES = registerBlock(
        "oak_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Oak Tile Stairs
    public static final RegistryObject<Block> OAK_TILE_STAIRS = registerBlock(
        "oak_tile_stairs",
        () -> new StairBlock(
            () -> OAK_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Oak Tile Slab
    public static final RegistryObject<Block> OAK_TILE_SLAB = registerBlock(
        "oak_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Oak Tile Wall
    public static final RegistryObject<Block> OAK_TILE_WALL = registerBlock(
        "oak_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Spruce Tiles
    public static final RegistryObject<Block> SPRUCE_TILES = registerBlock(
        "spruce_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Spruce Tile Stairs
    public static final RegistryObject<Block> SPRUCE_TILE_STAIRS = registerBlock(
        "spruce_tile_stairs",
        () -> new StairBlock(
            () -> SPRUCE_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Spruce Tile Slab
    public static final RegistryObject<Block> SPRUCE_TILE_SLAB = registerBlock(
        "spruce_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Spruce Tile Wall
    public static final RegistryObject<Block> SPRUCE_TILE_WALL = registerBlock(
        "spruce_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Birch Tiles
    public static final RegistryObject<Block> BIRCH_TILES = registerBlock(
        "birch_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Birch Tile Stairs
    public static final RegistryObject<Block> BIRCH_TILE_STAIRS = registerBlock(
        "birch_tile_stairs",
        () -> new StairBlock(
            () -> BIRCH_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Birch Tile Slab
    public static final RegistryObject<Block> BIRCH_TILE_SLAB = registerBlock(
        "birch_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Birch Tile Wall
    public static final RegistryObject<Block> BIRCH_TILE_WALL = registerBlock(
        "birch_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Jungle Tiles
    public static final RegistryObject<Block> JUNGLE_TILES = registerBlock(
        "jungle_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Jungle Tile Stairs
    public static final RegistryObject<Block> JUNGLE_TILE_STAIRS = registerBlock(
        "jungle_tile_stairs",
        () -> new StairBlock(
            () -> JUNGLE_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Jungle Tile Slab
    public static final RegistryObject<Block> JUNGLE_TILE_SLAB = registerBlock(
        "jungle_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Jungle Tile Wall
    public static final RegistryObject<Block> JUNGLE_TILE_WALL = registerBlock(
        "jungle_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Acacia Tiles
    public static final RegistryObject<Block> ACACIA_TILES = registerBlock(
        "acacia_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Acacia Tile Stairs
    public static final RegistryObject<Block> ACACIA_TILE_STAIRS = registerBlock(
        "acacia_tile_stairs",
        () -> new StairBlock(
            () -> ACACIA_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Acacia Tile Slab
    public static final RegistryObject<Block> ACACIA_TILE_SLAB = registerBlock(
        "acacia_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Acacia Tile Wall
    public static final RegistryObject<Block> ACACIA_TILE_WALL = registerBlock(
        "acacia_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Dark Oak Tiles
    public static final RegistryObject<Block> DARK_OAK_TILES = registerBlock(
        "dark_oak_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Dark Oak Tile Stairs
    public static final RegistryObject<Block> DARK_OAK_TILE_STAIRS = registerBlock(
        "dark_oak_tile_stairs",
        () -> new StairBlock(
            () -> DARK_OAK_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Dark Oak Tile Slab
    public static final RegistryObject<Block> DARK_OAK_TILE_SLAB = registerBlock(
        "dark_oak_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Dark Oak Tile Wall
    public static final RegistryObject<Block> DARK_OAK_TILE_WALL = registerBlock(
        "dark_oak_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Crimson Tiles
    public static final RegistryObject<Block> CRIMSON_TILES = registerBlock(
        "crimson_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Crimson Tile Stairs
    public static final RegistryObject<Block> CRIMSON_TILE_STAIRS = registerBlock(
        "crimson_tile_stairs",
        () -> new StairBlock(
            () -> CRIMSON_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Crimson Tile Slab
    public static final RegistryObject<Block> CRIMSON_TILE_SLAB = registerBlock(
        "crimson_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Crimson Tile Wall
    public static final RegistryObject<Block> CRIMSON_TILE_WALL = registerBlock(
        "crimson_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Warped Tiles
    public static final RegistryObject<Block> WARPED_TILES = registerBlock(
        "warped_tiles",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Warped Tile Stairs
    public static final RegistryObject<Block> WARPED_TILE_STAIRS = registerBlock(
        "warped_tile_stairs",
        () -> new StairBlock(
            () -> WARPED_TILES.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Warped Tile Slab
    public static final RegistryObject<Block> WARPED_TILE_SLAB = registerBlock(
        "warped_tile_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Warped Tile Wall
    public static final RegistryObject<Block> WARPED_TILE_WALL = registerBlock(
        "warped_tile_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .explosionResistance(2.0F)
            .sound(SoundType.WOOD)
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Amethyst Stairs
    public static final RegistryObject<Block> AMETHYST_STAIRS = registerBlock(
        "amethyst_stairs",
        () -> new StairBlock(
            () -> Blocks.AMETHYST_BLOCK.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.AMETHYST)
            .strength(1.5F)
            .explosionResistance(1.5F)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Amethyst Slab
    public static final RegistryObject<Block> AMETHYST_SLAB = registerBlock(
        "amethyst_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.AMETHYST)
            .strength(1.5F)
            .explosionResistance(1.5F)
            .sound(SoundType.AMETHYST)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Obsidian Stairs
    public static final RegistryObject<Block> OBSIDIAN_STAIRS = registerBlock(
        "obsidian_stairs",
        () -> new StairBlock(
            () -> Blocks.OBSIDIAN.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(50.0F)
            .explosionResistance(1200.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Obsidian Slab
    public static final RegistryObject<Block> OBSIDIAN_SLAB = registerBlock(
        "obsidian_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(50.0F)
            .explosionResistance(1200.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Calcite Stairs
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock(
        "calcite_stairs",
        () -> new StairBlock(
            () -> Blocks.CALCITE.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Calcite Slab
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock(
        "calcite_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Calcite Wall
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock(
        "calcite_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Tuff Stairs
    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock(
        "tuff_stairs",
        () -> new StairBlock(
            () -> Blocks.TUFF.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Tuff Slab
    public static final RegistryObject<Block> TUFF_SLAB = registerBlock(
        "tuff_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Tuff Wall
    public static final RegistryObject<Block> TUFF_WALL = registerBlock(
        "tuff_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Dripstone Stairs
    public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock(
        "dripstone_stairs",
        () -> new StairBlock(
            () -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Dripstone Slab
    public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock(
        "dripstone_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Dripstone Wall
    public static final RegistryObject<Block> DRIPSTONE_WALL = registerBlock(
        "dripstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Sandstone Pillar
    public static final RegistryObject<Block> SANDSTONE_PILLAR = registerBlock(
        "sandstone_pillar",
        () -> new RotatedPillarBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Red Sandstone Pillar
    public static final RegistryObject<Block> RED_SANDSTONE_PILLAR = registerBlock(
        "red_sandstone_pillar",
        () -> new RotatedPillarBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Cut Calcite
    public static final RegistryObject<Block> CUT_CALCITE = registerBlock(
        "cut_calcite",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Cut Calcite Slab
    public static final RegistryObject<Block> CUT_CALCITE_SLAB = registerBlock(
        "cut_calcite_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Calcite Pillar
    public static final RegistryObject<Block> CALCITE_PILLAR = registerBlock(
        "calcite_pillar",
        () -> new RotatedPillarBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Dripstone Pillar
    public static final RegistryObject<Block> DRIPSTONE_PILLAR = registerBlock(
        "dripstone_pillar",
        () -> new RotatedPillarBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Sandstone Wall
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock(
        "smooth_sandstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Red Sandstone Wall
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock(
        "smooth_red_sandstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Basalt Stairs
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = registerBlock(
        "smooth_basalt_stairs",
        () -> new StairBlock(
            () -> Blocks.SMOOTH_BASALT.defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Smooth Basalt Slab
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock(
        "smooth_basalt_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Basalt Wall
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock(
        "smooth_basalt_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Calcite
    public static final RegistryObject<Block> SMOOTH_CALCITE = registerBlock(
        "smooth_calcite",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Calcite Stairs
    public static final RegistryObject<Block> SMOOTH_CALCITE_STAIRS = registerBlock(
        "smooth_calcite_stairs",
        () -> new StairBlock(
            () -> SMOOTH_CALCITE.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Smooth Calcite Slab
    public static final RegistryObject<Block> SMOOTH_CALCITE_SLAB = registerBlock(
        "smooth_calcite_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Calcite Wall
    public static final RegistryObject<Block> SMOOTH_CALCITE_WALL = registerBlock(
        "smooth_calcite_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Dripstone
    public static final RegistryObject<Block> SMOOTH_DRIPSTONE = registerBlock(
        "smooth_dripstone",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Dripstone Stairs
    public static final RegistryObject<Block> SMOOTH_DRIPSTONE_STAIRS = registerBlock(
        "smooth_dripstone_stairs",
        () -> new StairBlock(
            () -> SMOOTH_DRIPSTONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Smooth Dripstone Slab
    public static final RegistryObject<Block> SMOOTH_DRIPSTONE_SLAB = registerBlock(
        "smooth_dripstone_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Smooth Dripstone Wall
    public static final RegistryObject<Block> SMOOTH_DRIPSTONE_WALL = registerBlock(
        "smooth_dripstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(2.0F)
            .explosionResistance(6.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Granite Wall
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock(
        "polished_granite_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Diorite Wall
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock(
        "polished_diorite_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Andesite Wall
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock(
        "polished_andesite_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Sandstone
    public static final RegistryObject<Block> POLISHED_SANDSTONE = registerBlock(
        "polished_sandstone",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Sandstone Stairs
    public static final RegistryObject<Block> POLISHED_SANDSTONE_STAIRS = registerBlock(
        "polished_sandstone_stairs",
        () -> new StairBlock(
            () -> POLISHED_SANDSTONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Polished Sandstone Slab
    public static final RegistryObject<Block> POLISHED_SANDSTONE_SLAB = registerBlock(
        "polished_sandstone_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Sandstone Wall
    public static final RegistryObject<Block> POLISHED_SANDSTONE_WALL = registerBlock(
        "polished_sandstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Red Sandstone
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE = registerBlock(
        "polished_red_sandstone",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Red Sandstone Stairs
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE_STAIRS = registerBlock(
        "polished_red_sandstone_stairs",
        () -> new StairBlock(
            () -> POLISHED_RED_SANDSTONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Polished Red Sandstone Slab
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE_SLAB = registerBlock(
        "polished_red_sandstone_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Red Sandstone Wall
    public static final RegistryObject<Block> POLISHED_RED_SANDSTONE_WALL = registerBlock(
        "polished_red_sandstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.8F)
            .explosionResistance(0.8F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Calcite
    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock(
        "polished_calcite",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Calcite Stairs
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock(
        "polished_calcite_stairs",
        () -> new StairBlock(
            () -> POLISHED_CALCITE.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Polished Calcite Slab
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock(
        "polished_calcite_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Calcite Wall
    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock(
        "polished_calcite_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Tuff
    public static final RegistryObject<Block> POLISHED_TUFF = registerBlock(
        "polished_tuff",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Tuff Stairs
    public static final RegistryObject<Block> POLISHED_TUFF_STAIRS = registerBlock(
        "polished_tuff_stairs",
        () -> new StairBlock(
            () -> POLISHED_TUFF.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Polished Tuff Slab
    public static final RegistryObject<Block> POLISHED_TUFF_SLAB = registerBlock(
        "polished_tuff_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Tuff Wall
    public static final RegistryObject<Block> POLISHED_TUFF_WALL = registerBlock(
        "polished_tuff_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Dripstone
    public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock(
        "polished_dripstone",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Dripstone Stairs
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock(
        "polished_dripstone_stairs",
        () -> new StairBlock(
            () -> POLISHED_DRIPSTONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Polished Dripstone Slab
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock(
        "polished_dripstone_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Dripstone Wall
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_WALL = registerBlock(
        "polished_dripstone_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Chiseled Granite
    public static final RegistryObject<Block> CHISELED_GRANITE_BRICKS = registerBlock(
        "chiseled_granite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Chiseled Diorite
    public static final RegistryObject<Block> CHISELED_DIORITE_BRICKS = registerBlock(
        "chiseled_diorite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Chiseled Andesite
    public static final RegistryObject<Block> CHISELED_ANDESITE_BRICKS = registerBlock(
        "chiseled_andesite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Chiseled Calcite
    public static final RegistryObject<Block> CHISELED_CALCITE_BRICKS = registerBlock(
        "chiseled_calcite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(0.75F)
            .explosionResistance(0.75F)
            .sound(SoundType.CALCITE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Chiseled Tuff
    public static final RegistryObject<Block> CHISELED_TUFF_BRICKS = registerBlock(
        "chiseled_tuff_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Chiseled Dripstone
    public static final RegistryObject<Block> CHISELED_DRIPSTONE = registerBlock(
        "chiseled_dripstone",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Granite Bricks
    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock(
        "granite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Granite Brick Stairs
    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = registerBlock(
        "granite_brick_stairs",
        () -> new StairBlock(
            () -> GRANITE_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Granite Brick Slab
    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = registerBlock(
        "granite_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Granite Brick Wall
    public static final RegistryObject<Block> GRANITE_BRICK_WALL = registerBlock(
        "granite_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Diorite Bricks
    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock(
        "diorite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Diorite Brick Stairs
    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = registerBlock(
        "diorite_brick_stairs",
        () -> new StairBlock(
            () -> DIORITE_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Diorite Brick Slab
    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = registerBlock(
        "diorite_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Diorite Brick Wall
    public static final RegistryObject<Block> DIORITE_BRICK_WALL = registerBlock(
        "diorite_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Andesite Bricks
    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock(
        "andesite_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Andesite Brick Stairs
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock(
        "andesite_brick_stairs",
        () -> new StairBlock(
            () -> ANDESITE_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Andesite Brick Slab
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock(
        "andesite_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Andesite Brick Wall
    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = registerBlock(
        "andesite_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Basalt Bricks
    public static final RegistryObject<Block> BASALT_BRICKS = registerBlock(
        "basalt_bricks",
        () -> new RotatedPillarBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Basalt Brick Stairs
    public static final RegistryObject<Block> BASALT_BRICK_STAIRS = registerBlock(
        "basalt_brick_stairs",
        () -> new StairBlock(
            () -> BASALT_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Basalt Brick Slab
    public static final RegistryObject<Block> BASALT_BRICK_SLAB = registerBlock(
        "basalt_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Basalt Brick Wall
    public static final RegistryObject<Block> BASALT_BRICK_WALL = registerBlock(
        "basalt_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.25F)
            .explosionResistance(4.2F)
            .sound(SoundType.BASALT)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Tuff Bricks
    public static final RegistryObject<Block> TUFF_BRICKS = registerBlock(
        "tuff_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Tuff Brick Stairs
    public static final RegistryObject<Block> TUFF_BRICK_STAIRS = registerBlock(
        "tuff_brick_stairs",
        () -> new StairBlock(
            () -> TUFF_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Tuff Brick Slab
    public static final RegistryObject<Block> TUFF_BRICK_SLAB = registerBlock(
        "tuff_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Tuff Brick Wall
    public static final RegistryObject<Block> TUFF_BRICK_WALL = registerBlock(
        "tuff_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(6.0F)
            .sound(SoundType.TUFF)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Dripstone Bricks
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICKS = registerBlock(
        "polished_dripstone_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Cracked Polished Dripstone Bricks
    public static final RegistryObject<Block> CRACKED_POLISHED_DRIPSTONE_BRICKS = registerBlock(
        "cracked_polished_dripstone_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Dripstone Brick Stairs
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_STAIRS = registerBlock(
        "polished_dripstone_brick_stairs",
        () -> new StairBlock(
            () -> POLISHED_DRIPSTONE_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Polished Dripstone Brick Slab
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_SLAB = registerBlock(
        "polished_dripstone_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Polished Dripstone Brick Wall
    public static final RegistryObject<Block> POLISHED_DRIPSTONE_BRICK_WALL = registerBlock(
        "polished_dripstone_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Mossy Polished Dripstone Bricks
    public static final RegistryObject<Block> MOSSY_POLISHED_DRIPSTONE_BRICKS = registerBlock(
        "mossy_polished_dripstone_bricks",
        () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Mossy Polished Dripstone Brick Stairs
    public static final RegistryObject<Block> MOSSY_POLISHED_DRIPSTONE_BRICK_STAIRS = registerBlock(
        "mossy_polished_dripstone_brick_stairs",
        () -> new StairBlock(
            () -> MOSSY_POLISHED_DRIPSTONE_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
    
    // Mossy Polished Dripstone Brick Slab
    public static final RegistryObject<Block> MOSSY_POLISHED_DRIPSTONE_BRICK_SLAB = registerBlock(
        "mossy_polished_dripstone_brick_slab",
        () -> new SlabBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );

    // Mossy Polished Dripstone Brick Wall
    public static final RegistryObject<Block> MOSSY_POLISHED_DRIPSTONE_BRICK_WALL = registerBlock(
        "mossy_polished_dripstone_brick_wall",
        () -> new WallBlock(
            BlockBehaviour.Properties.of(Material.STONE)
            .strength(1.5F)
            .explosionResistance(1.0F)
            .sound(SoundType.DRIPSTONE_BLOCK)
            .requiresCorrectToolForDrops()
        ),
        CreativeModeTab.TAB_BUILDING_BLOCKS
    );
}