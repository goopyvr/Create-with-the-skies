package net.SRG.cwiththeskies.mixin.chain_conveyor;

import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlock;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlockEntity;
import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.sublevel.ServerSubLevel;
import dev.ryanhcode.sable.sublevel.SubLevel;
import mezz.jei.common.util.ChatUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChainConveyorBlock.class)
public class ChainConveyorMixin {
    //TODO: fix ts pls

    //final SubLevel subLevel = Sable.HELPER.getContaining(level,connection);
    //if(subLevel instanceof final ServerSubLevel serverSubLevel) {

    //}

}
