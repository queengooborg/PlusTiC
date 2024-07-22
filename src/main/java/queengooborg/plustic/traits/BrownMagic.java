package queengooborg.plustic.traits;

import queengooborg.plustic.*;
import queengooborg.plustic.api.*;
import queengooborg.plustic.net.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import slimeknights.tconstruct.library.traits.*;

public class BrownMagic extends AbstractTrait {
	public static final BrownMagic brownmagic = new BrownMagic();

	public BrownMagic() {
		super("brownmagic", 0x3A1B00);
		Portal.addPortalable(identifier);
	}

	@Override
	public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (isSelected && FMLCommonHandler.instance().getSide().isClient()) {
			if (PlusTiC.proxy.isControlPressed("brown_magic")) {
				PacketHandler.INSTANCE.sendToServer(new PacketBrownAbracadabra());
			}
		}
	}
}
