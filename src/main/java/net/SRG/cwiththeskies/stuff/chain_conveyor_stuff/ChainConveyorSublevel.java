package net.SRG.cwiththeskies.stuff.chain_conveyor_stuff;

import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlock;
import com.simibubi.create.content.kinetics.chainConveyor.ChainConveyorBlockEntity;
import dev.ryanhcode.sable.Sable;
import dev.ryanhcode.sable.sublevel.ServerSubLevel;
import dev.ryanhcode.sable.sublevel.SubLevel;
import mezz.jei.common.util.ChatUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.attachment.AttachmentHolder;

import javax.management.remote.SubjectDelegationPermission;

public class ChainConveyorSublevel extends ChainConveyorBlock {
    public ChainConveyorSublevel(Properties properties) {
        super(properties);
    }
    public void ChainConveyorSubLevelHandler(BlockState blockState, Level level, BlockPos pos, Player player, UseOnContext context) {

        final SubLevel subLevel = Sable.HELPER.getContaining(level,pos);
        if(subLevel instanceof final ServerSubLevel serverSubLevel) {

            ChatUtil.writeChatMessage(context.getPlayer(),

                    "Yasss"

                    , ChatFormatting.UNDERLINE);

        }
    }

}
