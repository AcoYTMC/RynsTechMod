package net.acoyt.tech_mod.impl.index.ref;

import net.acoyt.tech_mod.impl.TechMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

/**
 * @author AcoYT
 */
public interface TMItemIds {
    ResourceKey<Item> LOGIC_INGOT = create("logic_ingot");

    ResourceKey<Item> GOGGLES = create("goggles");
    ResourceKey<Item> LOGIC_CHESTPLATE = create("logic_chestplate");
    ResourceKey<Item> LOGIC_LEGGINGS = create("logic_leggings");
    ResourceKey<Item> LOGIC_BOOTS = create("logic_boots");

    ResourceKey<Item> CHECKPOINT = create("checkpoint");

    private static ResourceKey<Item> create(String id) {
        return ResourceKey.create(Registries.ITEM, TechMod.id(id));
    }
}
