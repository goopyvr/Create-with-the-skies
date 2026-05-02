package net.SRG.cwiththeskies.item.sublevel_remover;

import dev.ryanhcode.sable.api.sublevel.SubLevelContainer;
import dev.ryanhcode.sable.sublevel.SubLevel;
import dev.ryanhcode.sable.sublevel.storage.SubLevelRemovalReason;
import mezz.jei.common.util.ChatUtil;
import net.SRG.cwiththeskies.helpers.SableHelpers;
import net.minecraft.ChatFormatting;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class SublevelRemoverItem extends Item {
    public SublevelRemoverItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {

        Level level = context.getLevel();
        Player player = context.getPlayer();

        if (!level.isClientSide)     {
            SubLevel subLevel = SableHelpers.getTargetedSubLevel(level, player);

            if(subLevel != null){
                level.playSound(null,context.getClickedPos(), SoundEvents.COPPER_BULB_FALL, SoundSource.MASTER);

                SubLevelContainer.getContainer(level).removeSubLevel(subLevel, SubLevelRemovalReason.REMOVED);
                ChatUtil.writeChatMessage(player,

                        "Succesfully §4Removed Sublevel§f: [" + subLevel.getUniqueId() + "]"

                        , ChatFormatting.UNDERLINE);


            }else {
                ChatUtil.writeChatMessage(player,

                        "§4Failed to Remove Sublevel as it isn't a valid Sublevel§4"
                        , ChatFormatting.UNDERLINE);
                level.playSound(null,context.getClickedPos(), SoundEvents.BOTTLE_FILL, SoundSource.MASTER);
            }



        }

        return InteractionResult.SUCCESS;
    }
}
