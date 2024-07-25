package queengooborg.plusticreforged.api;

import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;
import slimeknights.tconstruct.library.client.data.spritetransformer.IColorMapping;

public class MaterialColors {
	public int base = 0xD8D8D8;
	public int f63 = 0xFF3F3F3F;
	public int f102 = 0xFF5E5E5E;
	public int f140 = 0xFF828282;
	public int f178 = 0xFFA8A8A8;
	public int f216 = 0xFFD8D8D8;
	public int f255 = 0xFFFFFFFF;
	public int luminosity = 0;

	public MaterialColors() {}

	public MaterialColors(int base) {
		this(base, 0);
	}

	public MaterialColors(int base, int luminosity) {
		// XXX This is a placeholder for the actual color calculation
		// Iron example (base: 0xD8D8D8):
		// [...].colorMapper(
		//  GreyToColorMapping.builderFromBlack()
		//  .addARGB(63, 0xFF353535)
		//  .addARGB(102, 0xFF5E5E5E)
		//  .addARGB(140, 0xFF828282)
		//  .addARGB(178, 0xFFA8A8A8)
		//  .addARGB(216, 0xFFD8D8D8)
		//  .addARGB(255, 0xFFFFFFFF)
		//  .build()
		// );

		// Copper example (base: 0xF98648):
		// [...].colorMapper(
		//  GreyToColorMapping.builderFromBlack()
		//  .addARGB(63, 0xFF72341A)
		//  .addARGB(102, 0xFF934828)
		//  .addARGB(140, 0xFFD87236)
		//  .addARGB(178, 0xFFEF8345)
		//  .addARGB(216, 0xFFFBA165)
		//  .addARGB(255, 0xFFFAC493)
		//  .build()
		// );

		this.base = base;
		this.f63 = 0xFF000000 + base;
		this.f102 = 0xFF000000 + base;
		this.f140 = 0xFF000000 + base;
		this.f178 = 0xFF000000 + base;
		this.f216 = 0xFF000000 + base;
		this.f255 = 0xFF000000 + base;
		this.luminosity = luminosity;
	}

	public MaterialColors(int base, int luminosity, int f63, int f102, int f140, int f178, int f216, int f255) {
		this.base = base;
		this.f63 = f63;
		this.f102 = f102;
		this.f140 = f140;
		this.f178 = f178;
		this.f216 = f216;
		this.f255 = f255;
		this.luminosity = luminosity;
	}

	public IColorMapping getColorMapper() {
		return GreyToColorMapping.builderFromBlack()
			.addARGB(63, f63)
			.addARGB(102, f102)
			.addARGB(140, f140)
			.addARGB(178, f178)
			.addARGB(216, f216)
			.addARGB(255, f255)
			.build();
	}
}