package queengooborg.plustic.modules;

import static slimeknights.tconstruct.library.materials.MaterialTypes.*;
import static slimeknights.tconstruct.library.utils.HarvestLevels.*;

import queengooborg.plustic.*;
import queengooborg.plustic.config.*;
import queengooborg.plustic.fluids.*;
import queengooborg.plustic.tools.stats.*;
import queengooborg.plustic.traits.*;
import queengooborg.plustic.util.*;

public class ModuleAstralSorcery implements IModule {
	@Override
	public void init() {
		if (Loader.isModLoaded("astralsorcery") && Config.astralSorcery) {
			Material starmetal = new Material("starmetal", 0x000b56);
			starmetal.addTrait(ImASuperstar.imasuperstar, HEAD);
			starmetal.addTrait(ImASuperstar.imasuperstar, LaserMediumMaterialStats.TYPE);
			starmetal.addTrait(Illuminati.illuminati);
			starmetal.addItem("ingotAstralStarmetal", 1, Material.VALUE_Ingot);
			starmetal.setCraftable(false).setCastable(true);
			PlusTiC.proxy.setRenderInfo(starmetal, 0x000b56);

			FluidMolten starmetalFluid = Utils.fluidMetal("starmetal", 0x000b56);
			starmetalFluid.setTemperature(999);
			Utils.initFluidMetal(starmetalFluid);
			starmetal.setFluid(starmetalFluid);

			TinkerRegistry.addMaterialStats(starmetal,
					new HeadMaterialStats(204, 6.00f, 4.00f, DIAMOND),
					new HandleMaterialStats(1.0f, 60),
					new ExtraMaterialStats(100),
					new BowMaterialStats(0.5f, 1.5f, 7f),
					new LaserMediumMaterialStats(4.6f, 70));

			PlusTiC.materials.put("astralStarmetal", starmetal);
		}
	}
}
