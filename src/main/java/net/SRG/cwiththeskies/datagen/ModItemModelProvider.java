package net.SRG.cwiththeskies.datagen;

import net.SRG.cwiththeskies.cwiththeskies;
import net.SRG.cwiththeskies.item.WithTheSkiesItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, cwiththeskies.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //basicItem(WithTheSkiesItems.CUSTOM_ITEM.get());
        basicItem(WithTheSkiesItems.MAGNIFIER_GLASS.get());
        basicItem(WithTheSkiesItems.SUBLEVEL_CREATOR.get());
        basicItem(WithTheSkiesItems.SUBLEVEL_REMOVER.get());
    }
}
