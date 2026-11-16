package net.acoyt.tech_mod.data.provider.server.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

/**
 * @author AcoYT
 */
public class TMBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public TMBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    public void addTags(HolderLookup.Provider provider) {
        //
    }
}
