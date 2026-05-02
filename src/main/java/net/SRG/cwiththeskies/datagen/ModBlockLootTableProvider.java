package net.SRG.cwiththeskies.datagen;

import net.SRG.cwiththeskies.block.WithTheSkiesBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //dropSelf(WithTheSkiesBlocks.CUSTOM_BLOCK.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
         return WithTheSkiesBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
