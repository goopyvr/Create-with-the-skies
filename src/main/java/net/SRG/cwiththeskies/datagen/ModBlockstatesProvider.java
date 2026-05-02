package net.SRG.cwiththeskies.datagen;

import net.SRG.cwiththeskies.cwiththeskies;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockstatesProvider extends BlockStateProvider {

    public ModBlockstatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, cwiththeskies.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //blockWithItem(WithTheSkiesBlocks.CUSTOM_BLOCK);


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
