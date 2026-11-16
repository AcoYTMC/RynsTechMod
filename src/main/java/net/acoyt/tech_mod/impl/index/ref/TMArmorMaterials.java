package net.acoyt.tech_mod.impl.index.ref;

import net.acoyt.tech_mod.impl.index.tag.TMItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;

/**
 * @author AcoYT
 */
public interface TMArmorMaterials {
    ArmorMaterial LOGIC = new ArmorMaterial(
            ArmorMaterials.NETHERITE.durability() + ArmorMaterials.LEATHER.durability(),
            ArmorMaterials.DIAMOND.defense(),
            ArmorMaterials.NETHERITE.enchantmentValue(),
            ArmorMaterials.NETHERITE.equipSound(),
            ArmorMaterials.DIAMOND.toughness(),
            ArmorMaterials.DIAMOND.knockbackResistance(),
            TMItemTags.REPAIRS_LOGIC_ARMOR,
            TMEquipmentAssets.LOGIC
    );
}
