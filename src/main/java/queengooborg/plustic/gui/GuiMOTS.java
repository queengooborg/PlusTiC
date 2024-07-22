package queengooborg.plustic.gui;

import queengooborg.plustic.config.ModInfo;
import queengooborg.plustic.traits.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.util.*;

public class GuiMOTS extends GuiContainer {
	public static final ResourceLocation TEX = new ResourceLocation(ModInfo.MODID, "textures/gui/mots.png");

	private final InventoryPlayer playerInv;

	public GuiMOTS(Container cont, InventoryPlayer playerInv) {
		super(cont);
		this.playerInv = playerInv;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1, 1, 1, 1);
		mc.getTextureManager().bindTexture(TEX);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String name = MusicOfTheSpheres.musicofthespheres.getLocalizedName();
		fontRenderer.drawString(name, xSize / 2 - fontRenderer.getStringWidth(name) / 2, 6, 0x404040);
		fontRenderer.drawString(playerInv.getDisplayName().getUnformattedText(), 8, ySize - 94, 0x404040);
	}
}
