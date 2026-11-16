package net.acoyt.tech_mod.impl.index.ref;

import net.acoyt.tech_mod.impl.TechMod;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

/**
 * @author AcoYT
 */
public interface TMEquipmentAssets {
    ResourceKey<EquipmentAsset> LOGIC = createId("logic");

    private static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, TechMod.id(name));
    }
}
