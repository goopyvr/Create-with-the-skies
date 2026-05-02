package net.SRG.cwiththeskies.item;

import net.SRG.cwiththeskies.cwiththeskies;
import net.SRG.cwiththeskies.item.magnifier_glass.MagnifierItem;
import net.SRG.cwiththeskies.item.sublevel_creator.SublevelCreatorItem;
import net.SRG.cwiththeskies.item.sublevel_remover.SublevelRemoverItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WithTheSkiesItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(cwiththeskies.MOD_ID);

    //Example Advanced Item
    /*
    public static final DeferredItem<Item> CUSTOM_ITEM = ITEMS.register("custom_item",
            () -> new CustomItem(new Item.Properties()));

     */

    public static final DeferredItem<Item> MAGNIFIER_GLASS = ITEMS.register("magnifier_item",
            () -> new MagnifierItem(new Item.Properties()));

    public static final DeferredItem<Item> SUBLEVEL_CREATOR = ITEMS.register("sublevel_creator",
            () -> new SublevelCreatorItem(new Item.Properties()));

    public static final DeferredItem<Item> SUBLEVEL_REMOVER = ITEMS.register("sublevel_remover",
            () -> new SublevelRemoverItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
