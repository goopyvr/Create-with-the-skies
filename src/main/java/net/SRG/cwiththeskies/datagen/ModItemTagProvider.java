package net.SRG.cwiththeskies.datagen;

import net.SRG.cwiththeskies.cwiththeskies;
import net.SRG.cwiththeskies.item.WithTheSkiesItems;
import net.SRG.cwiththeskies.util.WithTheSkiesTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, cwiththeskies.MOD_ID, existingFileHelper);
    }



    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(WithTheSkiesTags.Items.TEST_TAG)
                //.add(WithTheSkiesItems.CUSTOM_ITEM.get());
        ;
    }
}
