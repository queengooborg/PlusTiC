package queengooborg.plustic.net;

import net.minecraftforge.fml.common.network.simpleimpl.*;
import queengooborg.plustic.config.ModInfo;

public class PacketHandler {
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.MODID);

	public static void init() {
		INSTANCE.registerMessage(PacketReleaseEntity::onMessage, PacketReleaseEntity.class, 0, Side.SERVER);
		INSTANCE.registerMessage(PacketHandleToggleGui::onMessage, PacketHandleToggleGui.class, 1, Side.SERVER);
		INSTANCE.registerMessage(PacketUpdateToggleGui::onMessage, PacketUpdateToggleGui.class, 2, Side.CLIENT);
		INSTANCE.registerMessage(PacketSetPortal::onMessage, PacketSetPortal.class, 3, Side.SERVER);
		INSTANCE.registerMessage(PacketBrownAbracadabra::onMessage, PacketBrownAbracadabra.class, 4, Side.SERVER);
		INSTANCE.registerMessage(PacketUpdateToolModeServer::onMessage, PacketUpdateToolModeServer.class, 5, Side.SERVER);
		INSTANCE.registerMessage(PacketLaserGunZapBlock::onMessage, PacketLaserGunZapBlock.class, 6, Side.CLIENT);
		INSTANCE.registerMessage(PacketOpenFSGui::onMessage, PacketOpenFSGui.class, 7, Side.SERVER);
		INSTANCE.registerMessage(PacketOpenMOTSGui::onMessage, PacketOpenMOTSGui.class, 8, Side.SERVER);
		INSTANCE.registerMessage(PacketPlayMOTS::onMessage, PacketPlayMOTS.class, 9, Side.CLIENT);
		INSTANCE.registerMessage(PacketStopMOTS::onMessage, PacketStopMOTS.class, 10, Side.CLIENT);
		INSTANCE.registerMessage(PacketRequestToggleGui::onMessage, PacketRequestToggleGui.class, 11, Side.SERVER);
		INSTANCE.registerMessage(PacketOpenToggleGui::onMessage, PacketOpenToggleGui.class, 12, Side.CLIENT);
		INSTANCE.registerMessage(PacketUpdateTECentrifugeLiquid::onMessage, PacketUpdateTECentrifugeLiquid.class, 13, Side.CLIENT);
		INSTANCE.registerMessage(PacketUpdateTECentrifugeCoreEnergy::onMessage, PacketUpdateTECentrifugeCoreEnergy.class, 14, Side.CLIENT);
		INSTANCE.registerMessage(PacketRequestUpdateTECentrifuge::onMessage, PacketRequestUpdateTECentrifuge.class, 15, Side.SERVER);

		// TODO add mroe messages when needed
	}
}
