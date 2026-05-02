package net.SRG.cwiththeskies.item.magnifier_glass;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.api.SubLevelAssemblyHelper;
import dev.ryanhcode.sable.api.command.SableCommandHelper;
import dev.ryanhcode.sable.api.command.SubLevelArgumentType;
import dev.ryanhcode.sable.api.sublevel.SubLevelContainer;
import dev.ryanhcode.sable.command.SableCommand;
import dev.ryanhcode.sable.command.SablePhysicsCommands;
import dev.ryanhcode.sable.command.SableSubLevelCommands;
import dev.ryanhcode.sable.companion.math.BoundingBox3i;
import dev.ryanhcode.sable.index.SableAttributes;
import dev.ryanhcode.sable.sublevel.ServerSubLevel;
import dev.ryanhcode.sable.sublevel.SubLevel;
import dev.ryanhcode.sable.util.SableNBTUtils;
import mezz.jei.common.util.ChatUtil;
import net.SRG.cwiththeskies.helpers.SableHelpers;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.AABB;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Collection;
import java.util.List;

public class MagnifierItem extends Item {
    public MagnifierItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();
        Player player = context.getPlayer();

        @NonNull
        SubLevel subLevel = SableHelpers.getTargetedSubLevel(level, player);

        if(!level.isClientSide) {

            ChatUtil.writeChatMessage(context.getPlayer(),
                            "-[INFO]-\n"+

                    "["+ clickedBlock.getDescriptionId() +
                            "]\n§3 Of Coordinates:§6 "+ context.getClickedPos() +
                            ",\n§3 Properties: §6" + clickedBlock.properties()


                    , ChatFormatting.BOLD);

            if(subLevel != null) {
                ChatUtil.writeChatMessage(context.getPlayer(),"§f----------" + "\n§5 Sublevel ID: §6"+
                        subLevel.getUniqueId() + ", \n§5 Logical Pose: §6" + subLevel.logicalPose() +
                        ", \n§5 Name: §6" + subLevel.getName()
                        , ChatFormatting.BOLD);
            }




            level.playSound(null,context.getClickedPos(), SoundEvents.SPYGLASS_USE, SoundSource.BLOCKS);
            level.playSound(null,context.getClickedPos(), SoundEvents.VILLAGER_WORK_LIBRARIAN, SoundSource.BLOCKS);

        }
        return InteractionResult.SUCCESS;
    }
}
