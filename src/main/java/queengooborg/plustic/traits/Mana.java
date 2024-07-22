package queengooborg.plustic.traits;

import queengooborg.plustic.api.*;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.items.*;
import slimeknights.tconstruct.library.traits.*;
import slimeknights.tconstruct.library.utils.*;
import vazkii.botania.api.mana.*;

public class Mana extends AbstractTrait {
	public static final int MANA_DRAW = 100;
	public static final Mana mana = new Mana();

	public Mana() {
		super("mana", 0x54E5FF);
		Toggle.addToggleable(identifier);
	}

	@Override
	public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (TagUtil.getTagSafe(tool).getBoolean(ModReinforced.TAG_UNBREAKABLE)) {
			return;
		}
		if (!world.isRemote
				&& entity instanceof EntityPlayer
				&& ToolHelper.getCurrentDurability(tool) < ToolHelper.getMaxDurability(tool)
				&& Toggle.getToggleState(tool, identifier)
				&& drawMana((EntityPlayer) entity)) {
			ToolHelper.unbreakTool(tool);
			ToolHelper.healTool(tool, 1, (EntityPlayer) entity);
		}
	}

	@Override
	public int onToolDamage(ItemStack tool, int damage, int newDamage, EntityLivingBase entity) {
		if (TagUtil.getTagSafe(tool).getBoolean(ModReinforced.TAG_UNBREAKABLE)) {
			return 0;
		}
		if (!entity.getEntityWorld().isRemote
				&& entity instanceof EntityPlayer
				&& Toggle.getToggleState(tool, identifier)
				&& drawMana((EntityPlayer) entity)) {
			--newDamage;
		}
		return super.onToolDamage(tool, damage, newDamage, entity);
	}

	private static boolean drawMana(EntityPlayer ent) {
		IItemHandler handler = ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		for (int i = 0; i < handler.getSlots(); ++i) {
			if (ManaItemHandler.requestManaExactForTool(handler.getStackInSlot(i), ent, MANA_DRAW, true)) {
				return true;
			}
		}

		return false;
	}
}
