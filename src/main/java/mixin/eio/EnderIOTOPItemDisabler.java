package mixin.eio;

import crazypants.enderio.api.upgrades.IDarkSteelUpgrade;
import crazypants.enderio.base.integration.top.TOPUtil;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import javax.annotation.Nonnull;

@Mixin(TOPUtil.class)
public class EnderIOTOPItemDisabler {
    @Shadow @Final @Nonnull private static String MODID_TOP;

    /**
     * @author Drathonix
     * Disable the probe DS upgrade
     */
    @SubscribeEvent
    @Overwrite
    public static void registerDarkSteelUpgrades(@Nonnull RegistryEvent.Register<IDarkSteelUpgrade> event) {
    }
}
