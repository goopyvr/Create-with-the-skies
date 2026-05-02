package net.SRG.cwiththeskies.util;

import net.SRG.cwiththeskies.cwiththeskies;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class WithTheSkiesTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(cwiththeskies.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TEST_TAG = createTag("test_tag");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(cwiththeskies.MOD_ID, name));
        }
    }

}
