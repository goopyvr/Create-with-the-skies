package net.SRG.cwiththeskies.datagen;

import dev.eriksonn.aeronautics.index.AeroTags;
import net.SRG.cwiththeskies.block.WithTheSkiesBlocks;
import net.SRG.cwiththeskies.cwiththeskies;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, cwiththeskies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //.add(WithTheSkiesBlocks.CUSTOM_BLOCK.get());
        ;

        tag(AeroTags.BlockTags.LEVITITE)
                //.add(WithTheSkiesBlocks.CUSTOM_BLOCK.get());
        ;

        tag(BlockTags.NEEDS_IRON_TOOL)
                //.add(WithTheSkiesBlocks.CUSTOM_BLOCK.get());
        ;
    }
}
