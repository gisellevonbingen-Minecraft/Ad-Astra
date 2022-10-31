package earth.terrarium.ad_astra.mixin.fabric;

import earth.terrarium.ad_astra.items.armour.JetSuit;
import net.fabricmc.fabric.api.entity.event.v1.FabricElytraItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(JetSuit.class)
public class JetSuitMixin implements FabricElytraItem {
    @Shadow
    private boolean isFallFlying;

    @Override
    public boolean useCustomElytra(LivingEntity entity, ItemStack chestStack, boolean tickElytra) {
        return this.isFallFlying;
    }
}