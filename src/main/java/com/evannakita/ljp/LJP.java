package com.evannakita.ljp;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.evannakita.ljp.block.ModBlocks;
import com.evannakita.ljp.block.ModItems;

@Mod(LJP.MOD_ID)

public class LJP {
	public static final String MOD_ID = "ljp";

	// Directly reference a log4j logger
	private static final Logger LOGGER = LogManager.getLogger("ljp");

	public static final String OAK_TILES = null;

	public LJP() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.register(eventBus);
		ModBlocks.register(eventBus);

		// Register LJP for server and other relevant game events
		MinecraftForge.EVENT_BUS.register(this);
	};

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("HELLO FROM PREINIT");
	}
}