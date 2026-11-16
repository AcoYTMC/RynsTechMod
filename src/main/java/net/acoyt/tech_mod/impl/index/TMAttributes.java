package net.acoyt.tech_mod.impl.index;

import net.acoyt.acornlib.api.registrants.AttributeRegistrant;
import net.acoyt.tech_mod.impl.TechMod;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;

/**
 * @author AcoYT
 */
public interface TMAttributes {
    AttributeRegistrant ATTRIBUTES = new AttributeRegistrant(TechMod.MOD_ID);

    Holder<Attribute> AIR_MOBILITY_MULTIPLIER = ATTRIBUTES.registerRef("air_mobility_multiplier",
            new RangedAttribute("attribute.name.air_mobility_multiplier", 1.0, 0.0, 4.0));

    static void init() {}
}
