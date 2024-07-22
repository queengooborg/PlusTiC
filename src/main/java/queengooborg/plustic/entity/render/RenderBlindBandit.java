package queengooborg.plustic.entity.render;

import javax.annotation.*;

import queengooborg.plustic.config.ModInfo;
import queengooborg.plustic.entity.*;
import net.minecraft.util.*;

public class RenderBlindBandit extends RenderLiving<EntityBlindBandit> {
	public static final ResourceLocation tex = new ResourceLocation(ModInfo.MODID + ":textures/entity/blindbandit.png");

	public RenderBlindBandit(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelBlindBandit(), 0.5F);
	}

	@Override
	@Nonnull
	protected ResourceLocation getEntityTexture(@Nonnull EntityBlindBandit ent) {
		return tex;
	}
}
