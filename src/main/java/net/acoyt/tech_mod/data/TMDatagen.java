package net.acoyt.tech_mod.data;

import net.acoyt.tech_mod.data.provider.client.TMEquipmentAssetProvider;
import net.acoyt.tech_mod.data.provider.client.TMLanguageProvider;
import net.acoyt.tech_mod.data.provider.client.TMModelProvider;
import net.acoyt.tech_mod.data.provider.server.TMRecipeProvider;
import net.acoyt.tech_mod.data.provider.server.TMTrinketsProvider;
import net.acoyt.tech_mod.data.provider.server.tags.TMBlockTagsProvider;
import net.acoyt.tech_mod.data.provider.server.tags.TMItemTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;

public class TMDatagen implements DataGeneratorEntrypoint {
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Client
        pack.addProvider(TMEquipmentAssetProvider::new);
        pack.addProvider(TMLanguageProvider::new);
        pack.addProvider(TMModelProvider::new);

        // Server
        pack.addProvider(TMBlockTagsProvider::new);
        pack.addProvider(TMItemTagsProvider::new);

        pack.addProvider(TMRecipeProvider::new);
        pack.addProvider(TMTrinketsProvider::new);
    }

    public void buildRegistry(RegistrySetBuilder builder) {
        //
    }
}
