package com.commission.abomination.client.render;

import com.commission.abomination.AshAbomination;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderAshAbomination extends RenderZombie {
    private static final ResourceLocation ASH_ABOMINATION = new ResourceLocation(AshAbomination.MODID, "textures/entity/ash_abomination.png");

    public RenderAshAbomination(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityZombie entity)
    {
        return ASH_ABOMINATION;
    }
}
