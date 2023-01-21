package evannakita.ljp.util;

import evannakita.ljp.LJP;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(LJP.ACACIA_TILES, 5, 10);
        registry.add(LJP.ACACIA_TILE_SLAB, 5, 10);
        registry.add(LJP.ACACIA_TILE_STAIRS, 5, 10);
        registry.add(LJP.ACACIA_TILE_WALL, 5, 10);
        registry.add(LJP.BIRCH_TILES, 5, 10);
        registry.add(LJP.BIRCH_TILE_SLAB, 5, 10);
        registry.add(LJP.BIRCH_TILE_STAIRS, 5, 10);
        registry.add(LJP.BIRCH_TILE_WALL, 5, 10);
        registry.add(LJP.DARK_OAK_TILES, 5, 10);
        registry.add(LJP.DARK_OAK_TILE_SLAB, 5, 10);
        registry.add(LJP.DARK_OAK_TILE_STAIRS, 5, 10);
        registry.add(LJP.DARK_OAK_TILE_WALL, 5, 10);
        registry.add(LJP.JUNGLE_TILES, 5, 10);
        registry.add(LJP.JUNGLE_TILE_SLAB, 5, 10);
        registry.add(LJP.JUNGLE_TILE_STAIRS, 5, 10);
        registry.add(LJP.JUNGLE_TILE_WALL, 5, 10);
        registry.add(LJP.MANGROVE_TILES, 5, 10);
        registry.add(LJP.MANGROVE_TILE_SLAB, 5, 10);
        registry.add(LJP.MANGROVE_TILE_STAIRS, 5, 10);
        registry.add(LJP.MANGROVE_TILE_WALL, 5, 10);
        registry.add(LJP.OAK_TILES, 5, 10);
        registry.add(LJP.OAK_TILE_SLAB, 5, 10);
        registry.add(LJP.OAK_TILE_STAIRS, 5, 10);
        registry.add(LJP.OAK_TILE_WALL, 5, 10);
        registry.add(LJP.SPRUCE_TILES, 5, 10);
        registry.add(LJP.SPRUCE_TILE_SLAB, 5, 10);
        registry.add(LJP.SPRUCE_TILE_STAIRS, 5, 10);
        registry.add(LJP.SPRUCE_TILE_WALL, 5, 10);
    }
}
