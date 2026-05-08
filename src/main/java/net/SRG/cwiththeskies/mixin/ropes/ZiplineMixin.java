package net.SRG.cwiththeskies.mixin.ropes;

import com.simibubi.create.AllTags;
import dev.simulated_team.simulated.content.blocks.rope.strand.client.ZiplineClientManager;
import dev.simulated_team.simulated.index.SimTags;
import dev.simulated_team.simulated.util.click_interactions.InteractCallback;
import net.SRG.cwiththeskies.stuff.packages_on_ropes.PackageOnRope;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static dev.simulated_team.simulated.content.blocks.rope.strand.client.ZiplineClientManager.hoveringRope;
import static dev.simulated_team.simulated.content.blocks.rope.strand.client.ZiplineClientManager.ridingRope;

@Mixin(ZiplineClientManager.class)
public class ZiplineMixin {

   @Inject(method = "onUse", at = @At("HEAD"),cancellable = true)
    private void onUse(int modifiers, int action, KeyMapping rightKey, CallbackInfoReturnable<InteractCallback.Result> cir) {

       if (action == GLFW.GLFW_RELEASE || hoveringRope == null || ridingRope == hoveringRope)
           cir.setReturnValue(InteractCallback.Result.empty());


       final Minecraft mcx = Minecraft.getInstance();
       final ItemStack mainHandItemx = mcx.player.getMainHandItem();

       final Boolean isPackage = AllTags.AllItemTags.PACKAGES.matches(mainHandItemx);

       if (isPackage){
            //TODO: here shall lay the legendary code that will put package on rope
       }
   }

   @Inject(method = "isRopeInteractable", at = @At("HEAD"), cancellable = true)
   private static void isRopeInteractable(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
       cir.setReturnValue(AllTags.AllItemTags.CHAIN_RIDEABLE.matches(stack) || stack.is(SimTags.Items.DESTROYS_ROPE) || AllTags.AllItemTags.PACKAGES.matches(stack));
   }

}
