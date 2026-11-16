package net.acoyt.tech_mod.data.provider.client;

import net.acoyt.tech_mod.impl.TechMod;
import net.acoyt.tech_mod.impl.index.ref.TMEquipmentAssets;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricCodecDataProvider;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/**
 * @author AcoYT
 */
public class TMEquipmentAssetProvider extends FabricCodecDataProvider<EquipmentClientInfo> {
    public TMEquipmentAssetProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture, PackOutput.Target.RESOURCE_PACK, "equipment", EquipmentClientInfo.CODEC);
    }

    public void configure(BiConsumer<Identifier, EquipmentClientInfo> consumer, HolderLookup.Provider provider) {
        consumer.accept(TMEquipmentAssets.LOGIC.identifier(), EquipmentClientInfo.builder()
                .addHumanoidLayers(TechMod.id("logic"))
                .build());
    }

    public String getName() {
        return TechMod.MOD_ID + "_equipment";
    }
}
