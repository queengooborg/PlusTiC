package queengooborg.plusticreforged.generator;

import queengooborg.plusticreforged.Resources;
import queengooborg.plusticreforged.api.Material;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.spritetransformer.GreyToColorMapping;

public class GeneratorMaterialTextures extends AbstractMaterialSpriteProvider {
	@Override
	protected void addAllMaterials() {
		for (Material material : Resources.MATERIALS) {
			buildMaterial(material.resourceLocation).meleeHarvest().fallbacks(material.type).colorMapper(material.color.getColorMapper());
		}
	}

	@Override
	public String getName() {
		return "PlusTiC Reforged Material Textures";
	}
}