package net.acoyt.tech_mod.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.acoyt.tech_mod.impl.TechMod;
import net.acoyt.tech_mod.impl.index.TMAttributes;
import net.acoyt.tech_mod.impl.index.tag.TMItemTags;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

/**
 * @author AcoYT
 */
@Mixin(ArmorMaterial.class)
public abstract class ArmorMaterialMixin {
    @Shadow @Final private TagKey<Item> repairIngredient;

    @WrapOperation(
            method = "createAttributes",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/component/ItemAttributeModifiers$Builder;build()Lnet/minecraft/world/item/component/ItemAttributeModifiers;"
            )
    )
    private ItemAttributeModifiers techMod$extraAttributes(ItemAttributeModifiers.Builder instance, Operation<ItemAttributeModifiers> original, ArmorType type) {
        if (repairIngredient == TMItemTags.REPAIRS_LOGIC_ARMOR) {
            EquipmentSlotGroup slotGroup = EquipmentSlotGroup.bySlot(type.getSlot());
            Identifier modifierId = TechMod.id("armor." + type.getName());
            if (type == ArmorType.CHESTPLATE) {
                instance.add(
                        TMAttributes.AIR_MOBILITY_MULTIPLIER,
                        new AttributeModifier(modifierId, 0.2, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                        slotGroup
                );

                instance.add(
                        Attributes.WATER_MOVEMENT_EFFICIENCY,
                        new AttributeModifier(modifierId, 12.0, AttributeModifier.Operation.ADD_VALUE),
                        slotGroup
                );
            } else if (type == ArmorType.BOOTS) {
                instance.add(
                        Attributes.STEP_HEIGHT,
                        new AttributeModifier(modifierId, 1.0, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                        slotGroup
                );

                instance.add(
                        Attributes.JUMP_STRENGTH,
                        new AttributeModifier(modifierId, 0.8, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL),
                        slotGroup
                );
            }
        }

        return original.call(instance);
    }
}
