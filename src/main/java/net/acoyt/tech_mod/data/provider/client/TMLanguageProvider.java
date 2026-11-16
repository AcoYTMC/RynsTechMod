package net.acoyt.tech_mod.data.provider.client;

import net.acoyt.tech_mod.impl.index.TMAttributes;
import net.acoyt.tech_mod.impl.index.TMBlocks;
import net.acoyt.tech_mod.impl.index.TMItems;
import net.acoyt.tech_mod.impl.index.tag.TMItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

/**
 * @author AcoYT
 */
public class TMLanguageProvider extends FabricLanguageProvider {
    public TMLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder builder) {
        TMAttributes.ATTRIBUTES.registerLang(provider, builder);
        TMBlocks.BLOCKS.registerLang(provider, builder);
        TMItems.ITEMS.registerLang(provider, builder);

        TMItemTags.BUILDER.registerLang(provider, builder);
    }
}
