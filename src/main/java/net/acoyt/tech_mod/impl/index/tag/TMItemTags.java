package net.acoyt.tech_mod.impl.index.tag;

import net.acoyt.acornlib.api.builder.TagBuilder;
import net.acoyt.tech_mod.impl.TechMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

/**
 * @author AcoYT
 */
public interface TMItemTags {
    TagBuilder<Item> BUILDER = new TagBuilder<>(TechMod.MOD_ID, Registries.ITEM);

    TagKey<Item> REPAIRS_LOGIC_ARMOR = BUILDER.register("repairs_logic_armor");
}
