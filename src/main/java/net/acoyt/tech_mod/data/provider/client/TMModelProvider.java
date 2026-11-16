package net.acoyt.tech_mod.data.provider.client;

import net.acoyt.tech_mod.impl.index.TMItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

/**
 * @author AcoYT
 */
public class TMModelProvider extends FabricModelProvider {
    public TMModelProvider(FabricPackOutput output) {
        super(output);
    }

    public void generateBlockStateModels(BlockModelGenerators generators) {
        //
    }

    public void generateItemModels(ItemModelGenerators generators) {
        generators.generateFlatItem(TMItems.LOGIC_INGOT, ModelTemplates.FLAT_ITEM);

        generateNullsafeTrimmableArmorSet(
                generators,
                null,
                TMItems.LOGIC_CHESTPLATE,
                TMItems.LOGIC_LEGGINGS,
                TMItems.LOGIC_BOOTS,
                false,
                Map.of()
        );
    }

    public static void generateNullsafeTrimmableArmorSet(ItemModelGenerators generators, @Nullable Item helmet, @Nullable Item chestplate, @Nullable Item leggings, @Nullable Item boots, boolean hasDyedLayer, Map<TrimMaterials.Palette, TrimMaterials.Palette> trimPaletteReplacements) {
        if (helmet != null) generators.generateTrimmableItem(helmet, ItemModelGenerators.TRIM_PREFIX_HELMET, hasDyedLayer, trimPaletteReplacements);
        if (chestplate != null) generators.generateTrimmableItem(chestplate, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, hasDyedLayer, trimPaletteReplacements);
        if (leggings != null) generators.generateTrimmableItem(leggings, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, hasDyedLayer, trimPaletteReplacements);
        if (boots != null) generators.generateTrimmableItem(boots, ItemModelGenerators.TRIM_PREFIX_BOOTS, hasDyedLayer, trimPaletteReplacements);
    }
}
