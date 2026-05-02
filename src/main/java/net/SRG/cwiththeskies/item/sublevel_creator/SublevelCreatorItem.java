package net.SRG.cwiththeskies.item.sublevel_creator;

import dev.ryanhcode.sable.api.SubLevelAssemblyHelper;
import dev.ryanhcode.sable.companion.math.BoundingBox3i;
import mezz.jei.common.util.ChatUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

import java.util.List;

public class SublevelCreatorItem extends Item {
    public SublevelCreatorItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(!level.isClientSide) {

            final int range = 0;
            final BlockPos origin = context.getClickedPos();
            final BoundingBox boundingBox = BoundingBox.fromCorners(origin.offset(-range, -range, -range), origin.offset(range, range, range));

            final ServerLevel serverLevel = (ServerLevel) context.getLevel();


            final List<BlockPos> blocks = BlockPos.betweenClosedStream(boundingBox).map(BlockPos::immutable).toList();
            SubLevelAssemblyHelper.assembleBlocks(serverLevel,context.getClickedPos(),blocks,new BoundingBox3i());

            ChatUtil.writeChatMessage(context.getPlayer(),

                    "Succesfully §2Created Sublevel§f from Block: [" + clickedBlock.getDescriptionId() + "]"

                    , ChatFormatting.UNDERLINE);

            level.playSound(null,context.getClickedPos(), SoundEvents.SPYGLASS_USE, SoundSource.BLOCKS);
            level.playSound(null,context.getClickedPos(), SoundEvents.VILLAGER_WORK_LIBRARIAN, SoundSource.BLOCKS);

        }
        return InteractionResult.SUCCESS;
    }

}
