package net.SRG.cwiththeskies.item;

import net.SRG.cwiththeskies.cwiththeskies;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WithTheSkiesTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, cwiththeskies.MOD_ID);


    public static final Supplier<CreativeModeTab> CREATE_WITH_THE_SKIES = CREATIVE_MODE_TAB.register("create_with_the_skies_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.BARRIER))
                    .title(Component.translatable("creativetab.cwiththeskies"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //output.accept(WithTheSkiesItems.CUSTOM_ITEM);
                        //output.accept(WithTheSkiesBlocks.CUSTOM_BLOCK);

                        output.accept(WithTheSkiesItems.MAGNIFIER_GLASS);
                        output.accept(WithTheSkiesItems.SUBLEVEL_CREATOR);
                        output.accept(WithTheSkiesItems.SUBLEVEL_REMOVER);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
