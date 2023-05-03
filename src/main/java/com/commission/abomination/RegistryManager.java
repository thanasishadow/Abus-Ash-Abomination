package com.commission.abomination;

import com.commission.abomination.entity.EntityAshAbomination;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class RegistryManager {
    public static int intColor(int r, int g, int b) {
        return (r * 65536 + g * 256 + b);
    }

    public static void registerAll() {
        RegisterEntities();
    }

    public static void RegisterEntities() {
        int id = 0;
        EntityRegistry.registerModEntity(new ResourceLocation(AshAbomination.MODID, EntityAshAbomination.NAME), EntityAshAbomination.class, EntityAshAbomination.NAME, id++, AshAbomination.instance, 64, 1, true);
        EntityRegistry.registerEgg(new ResourceLocation(AshAbomination.MODID, EntityAshAbomination.NAME), intColor(128, 128, 128), intColor(256, 256, 256));
        EntityRegistry.addSpawn(EntityAshAbomination.class, 15, 1, 3, EnumCreatureType.MONSTER, Biomes.DESERT, Biomes.DESERT_HILLS);
    }
}
