package net.acoyt.tech_mod.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.acoyt.tech_mod.impl.index.TMAttributes;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

/**
 * @author AcoYT
 */
@Mixin(Player.class)
public abstract class PlayerMixin extends Avatar {
    protected PlayerMixin(EntityType<? extends LivingEntity> type, Level level) {
        super(type, level);
    }

    @ModifyReturnValue(method = "getFlyingSpeed", at = @At("RETURN"))
    private float techMod$moreAirMobility(float original) {
        return original * (float) this.getAttributeValue(TMAttributes.AIR_MOBILITY_MULTIPLIER);
    }
}
