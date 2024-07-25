package queengooborg.plusticreforged.api;

import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public abstract class Modifier extends slimeknights.tconstruct.library.modifiers.Modifier {
	public String id;
	public String name;
	public Description description;

	public Modifier(String id, String name, Description description, int color) {
		super(color);

		this.id = id;
		this.name = name;
		this.description = description;
	}
}
