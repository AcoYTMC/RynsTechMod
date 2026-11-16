package net.acoyt.tech_mod.data.provider.server;

import eu.pb4.trinkets.api.datagen.TrinketsDataProvider;
import net.acoyt.tech_mod.impl.TechMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

/**
 * @author AcoYT
 */
public class TMTrinketsProvider extends TrinketsDataProvider {
    public TMTrinketsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
        super(packOutput, registries);
    }

    public void generate(TrinketsOutput output) {
        output.entitySlots(TechMod.MOD_ID)
                .addPlayer()
                .addSlot("head/hat");
    }

    public String getName() {
        return TechMod.MOD_ID + "_trinkets";
    }
}
