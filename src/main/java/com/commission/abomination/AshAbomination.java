package com.commission.abomination;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.commission.abomination.proxy.CommonProxy;

@Mod(modid = AshAbomination.MODID, name = AshAbomination.NAME, version = AshAbomination.VERSION)
@Mod.EventBusSubscriber(modid = com.commission.abomination.AshAbomination.MODID)
public class AshAbomination {
    public static final String MODID = "ash_abomination";
    public static final String NAME = "Abu's Ash Abomination";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.commission.abomination.proxy.ClientProxy", serverSide = "com.commission.abomination.proxy.CommonProxy")
    public static CommonProxy PROXY = null;

    @Mod.Instance
    public static com.commission.abomination.AshAbomination instance;

    @Mod.EventHandler
    public static void preinit(FMLPreInitializationEvent e) {
        PROXY.preinit(e);
    }
}