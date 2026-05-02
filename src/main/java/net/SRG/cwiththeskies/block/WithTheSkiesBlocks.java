package net.SRG.cwiththeskies.block;

import net.SRG.cwiththeskies.cwiththeskies;
import net.SRG.cwiththeskies.item.WithTheSkiesItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WithTheSkiesBlocks {

    public static final DeferredRegister.Blocks BLOCKS=
            DeferredRegister.createBlocks(cwiththeskies.MOD_ID);


    //Example Block

    /* public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock("example_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(20)
                    .explosionResistance(100)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));

     */

    //Example Advanced Block

    /* public static final DeferredBlock<Block> CUSTOM_BLOCK = registerBlock("custom_block",
            () -> new CustomBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));



     */

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        WithTheSkiesItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
