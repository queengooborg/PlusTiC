package queengooborg.plustic.util;

import net.minecraft.item.*;
import slimeknights.tconstruct.tools.ranged.*;

public class EmeraldBoltCoreCastingRecipe extends BoltCoreCastingRecipe {
	public static final EmeraldBoltCoreCastingRecipe INSTANCE = new EmeraldBoltCoreCastingRecipe();
	public static final int boltCoreAmount = Material.VALUE_Gem * 2;

	protected EmeraldBoltCoreCastingRecipe() {
	}

	@Override
	public boolean matches(ItemStack cast, Fluid fluid) {
		return super.matches(cast, fluid) && TinkerFluids.emerald.equals(fluid);
	}

	@Override
	public int getFluidAmount() {
		return boltCoreAmount;
	}
}
