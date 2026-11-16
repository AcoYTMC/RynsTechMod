package net.acoyt.tech_mod.impl;

import com.mojang.logging.LogUtils;
import net.acoyt.tech_mod.impl.index.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;

public class TechMod implements ModInitializer {
    public static final String MOD_ID = "tech_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public void onInitialize() {
        TMAttributes.init();
        TMBlockEntities.init();
        TMBlocks.init();
        TMCreativeModeTabs.init();
        TMDataComponents.init();
        TMItems.init();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
