package net.SRG.cwiththeskies.helpers;

import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.sublevel.SubLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;

public class SableHelpers {

    public static BlockHitResult getTargetedBlock(Level level, Player player, float partialTicks) {
        return level.clip(new ClipContext(player.getEyePosition(partialTicks), player.getEyePosition(partialTicks).add(player.getLookAngle().scale((double)100)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));
    }

    public static @Nullable SubLevel getTargetedSubLevel(Level level, Player player) {
        return Sable.HELPER.getContaining(level, getTargetedBlock(level, player, 1.0f).getLocation());
    }



}
