package com.commission.abomination.proxy;


import com.commission.abomination.entity.EntityAshAbomination;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.commission.abomination.client.render.RenderAshAbomination;


public class ClientProxy extends CommonProxy {
	@Override
	public void preinit(FMLPreInitializationEvent e) {
		super.preinit(e);
		RenderingRegistry.registerEntityRenderingHandler(EntityAshAbomination.class, RenderAshAbomination::new);
	}
}

