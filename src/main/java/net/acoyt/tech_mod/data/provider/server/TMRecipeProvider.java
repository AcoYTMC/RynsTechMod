package net.acoyt.tech_mod.data.provider.server;

import net.acoyt.tech_mod.impl.index.TMItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.Recipe;

import java.util.concurrent.CompletableFuture;

/**
 * @author AcoYT
 */
public class TMRecipeProvider extends FabricRecipeProvider {
    public TMRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    public RecipeProvider createRecipeProvider(HolderLookup.Provider provider, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            public void buildRecipes() {
                //this.shaped(RecipeCategory.COMBAT, TMItems.LOGIC_HELMET)
                //        .define('X', TMItems.LOGIC_INGOT)
                //        .pattern("XXX")
                //        .pattern("X X")
                //        .unlockedBy(getHasName(TMItems.LOGIC_INGOT), this.has(TMItems.LOGIC_INGOT))
                //        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, TMItems.LOGIC_CHESTPLATE)
                        .define('X', TMItems.LOGIC_INGOT)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .unlockedBy(getHasName(TMItems.LOGIC_INGOT), this.has(TMItems.LOGIC_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, TMItems.LOGIC_LEGGINGS)
                        .define('X', TMItems.LOGIC_INGOT)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy(getHasName(TMItems.LOGIC_INGOT), this.has(TMItems.LOGIC_INGOT))
                        .save(this.output);

                this.shaped(RecipeCategory.COMBAT, TMItems.LOGIC_BOOTS)
                        .define('X', TMItems.LOGIC_INGOT)
                        .pattern("X X")
                        .pattern("X X")
                        .unlockedBy(getHasName(TMItems.LOGIC_INGOT), this.has(TMItems.LOGIC_INGOT))
                        .save(this.output);
            }
        };
    }
}
