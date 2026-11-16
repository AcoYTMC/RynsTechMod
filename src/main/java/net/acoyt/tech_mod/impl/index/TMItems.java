package net.acoyt.tech_mod.impl.index;

import net.acoyt.acornlib.api.registrants.ItemRegistrant;
import net.acoyt.tech_mod.impl.TechMod;
import net.acoyt.tech_mod.impl.index.ref.TMArmorMaterials;
import net.acoyt.tech_mod.impl.index.ref.TMItemIds;
import net.acoyt.tech_mod.impl.item.CheckpointItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

/**
 * @author AcoYT
 */
public interface TMItems {
    ItemRegistrant ITEMS = new ItemRegistrant(TechMod.MOD_ID);

    //Item VELVET_METALBACKUP = register(TMItemIds.VELVET_METALBACKUP, Item::new, new Item.Properties());

    Item LOGIC_INGOT = register(TMItemIds.LOGIC_INGOT, Item::new, new Item.Properties()
            .fireResistant());

    Item GOGGLES = register(TMItemIds.GOGGLES, Item::new, new Item.Properties()
            .humanoidArmor(TMArmorMaterials.LOGIC, ArmorType.HELMET)
            .fireResistant());

    Item LOGIC_CHESTPLATE = register(TMItemIds.LOGIC_CHESTPLATE, Item::new, new Item.Properties()
            .humanoidArmor(TMArmorMaterials.LOGIC, ArmorType.CHESTPLATE)
            .fireResistant());

    Item LOGIC_LEGGINGS = register(TMItemIds.LOGIC_LEGGINGS, Item::new, new Item.Properties()
            .humanoidArmor(TMArmorMaterials.LOGIC, ArmorType.LEGGINGS)
            .fireResistant());

    Item LOGIC_BOOTS = register(TMItemIds.LOGIC_BOOTS, Item::new, new Item.Properties()
            .humanoidArmor(TMArmorMaterials.LOGIC, ArmorType.BOOTS)
            .fireResistant());

    Item CHECKPOINT = register(TMItemIds.CHECKPOINT, CheckpointItem::new, new Item.Properties()
            .stacksTo(1)
            .fireResistant());

    private static Item register(ResourceKey<Item> key, Function<Item.Properties, Item> factory, Item.Properties properties) {
        return ITEMS.register(key.identifier().getPath(), factory, properties);
    }

    static void init() {}
}
