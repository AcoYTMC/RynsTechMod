package net.acoyt.tech_mod.impl.index;

import net.acoyt.acornlib.api.registrants.DataComponentTypeRegistrant;
import net.acoyt.tech_mod.impl.TechMod;

/**
 * @author AcoYT
 */
public interface TMDataComponents {
    DataComponentTypeRegistrant COMPONENTS = new DataComponentTypeRegistrant(TechMod.MOD_ID);

    static void init() {}
}
