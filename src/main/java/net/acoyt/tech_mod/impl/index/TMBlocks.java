package net.acoyt.tech_mod.impl.index;

import net.acoyt.acornlib.api.registrants.BlockRegistrant;
import net.acoyt.tech_mod.impl.TechMod;

/**
 * @author AcoYT
 */
public interface TMBlocks {
    BlockRegistrant BLOCKS = new BlockRegistrant(TechMod.MOD_ID);

    static void init() {}
}
