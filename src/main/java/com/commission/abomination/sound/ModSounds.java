package com.commission.abomination.sound;

import com.commission.abomination.AshAbomination;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
public class ModSounds {
    public static final SoundEvent ASH_ABOMINATION_AMBIENT = new SoundEvent(new ResourceLocation(AshAbomination.MODID, "ash_abomination_ambient")).setRegistryName("ash_abomination_ambient");
    public static final SoundEvent ASH_ABOMINATION_HURT = new SoundEvent(new ResourceLocation(AshAbomination.MODID, "ash_abomination_hit")).setRegistryName("ash_abomination_hit");
    public static final SoundEvent ASH_ABOMINATION_DEATH = new SoundEvent(new ResourceLocation(AshAbomination.MODID, "ash_abomination_death")).setRegistryName("ash_abomination_death");

    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerSounds(final RegistryEvent.Register<SoundEvent> event) {
            event.getRegistry().register(ASH_ABOMINATION_AMBIENT);
            event.getRegistry().register(ASH_ABOMINATION_DEATH);
            event.getRegistry().register(ASH_ABOMINATION_HURT);
        }
    }
}
