package net.acoyt.tech_mod.data.provider.server.tags;

import eu.pb4.trinkets.api.DefaultTrinketSlotTags;
import net.acoyt.tech_mod.impl.index.ref.TMItemIds;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

/**
 * @author AcoYT
 */
public class TMItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public TMItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    public void addTags(HolderLookup.Provider provider) {
        this.builder(DefaultTrinketSlotTags.HEAD_HAT)
                .add(TMItemIds.GOGGLES)
                .setReplace(false);

        this.builder(ItemTags.HEAD_ARMOR)
                .add(TMItemIds.GOGGLES)
                .setReplace(false);

        this.builder(ItemTags.CHEST_ARMOR)
                .add(TMItemIds.LOGIC_CHESTPLATE)
                .setReplace(false);

        this.builder(ItemTags.LEG_ARMOR)
                .add(TMItemIds.LOGIC_LEGGINGS)
                .setReplace(false);

        this.builder(ItemTags.FOOT_ARMOR)
                .add(TMItemIds.LOGIC_BOOTS)
                .setReplace(false);
    }
}
