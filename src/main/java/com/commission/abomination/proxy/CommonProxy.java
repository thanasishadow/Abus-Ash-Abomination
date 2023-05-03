package com.commission.abomination.proxy;

import com.commission.abomination.RegistryManager;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preinit(FMLPreInitializationEvent e) {
		RegistryManager.registerAll();
	}
	public void registerEntityRenderers() {}
}
