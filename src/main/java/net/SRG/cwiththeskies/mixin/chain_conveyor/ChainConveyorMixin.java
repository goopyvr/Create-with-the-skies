package net.SRG.cwiththeskies.mixin.chain_conveyor;

import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChainConveyorBlockEntity.class)
public class ChainConveyorMixin {
    //TODO: fix ts pls

    @Inject(method = "getChainCost", at = @At("HEAD"), cancellable = true)
    protected int getChainCost(BlockPos connection, CallbackInfoReturnable<Integer> cir){

        connection = BlockPos.ZERO;
        return (int) Math.max(Math.round(Vec3.atLowerCornerOf(connection)
                .length() / 2.5), 1);
    }
}
