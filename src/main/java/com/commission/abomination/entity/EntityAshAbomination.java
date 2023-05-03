package com.commission.abomination.entity;

import com.commission.abomination.AshAbomination;
import com.commission.abomination.sound.ModSounds;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityAshAbomination extends EntityZombie {
    public static final ResourceLocation LOOT = new ResourceLocation(AshAbomination.MODID, "entities/ash_abomination");
    public static final String NAME = "ash_abomination";

    public EntityAshAbomination(World worldIn) {
        super(worldIn);
        this.isImmuneToFire = true;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D);
    }

    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    @Override
    protected ResourceLocation getLootTable()
    {
        return LOOT;
    }

    @Override
    public void onLivingUpdate()
    {
        if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.DROWN, 1.0F);
        }
        super.onLivingUpdate();
    }

    @Override
    protected boolean shouldBurnInDay()
    {
        return false;
    }

    protected SoundEvent getAmbientSound()
    {
        return ModSounds.ASH_ABOMINATION_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSounds.ASH_ABOMINATION_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return ModSounds.ASH_ABOMINATION_DEATH;
    }
}
