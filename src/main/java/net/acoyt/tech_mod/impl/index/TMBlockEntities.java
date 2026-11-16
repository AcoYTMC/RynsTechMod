package net.acoyt.tech_mod.impl.index;

import net.acoyt.acornlib.api.registrants.BlockEntityTypeRegistrant;
import net.acoyt.tech_mod.impl.TechMod;

/**
 * @author AcoYT
 */
public interface TMBlockEntities {
    BlockEntityTypeRegistrant ENTITIES = new BlockEntityTypeRegistrant(TechMod.MOD_ID);

    static void init() {}
}
