package net.SRG.cwiththeskies.datagen;

import net.SRG.cwiththeskies.block.WithTheSkiesBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, WithTheSkiesBlocks.CUSTOM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.GRASS_BLOCK)
                .unlockedBy("has_dirt", has(Items.GRASS_BLOCK)).save(recipeOutput);

         */
    }
}
