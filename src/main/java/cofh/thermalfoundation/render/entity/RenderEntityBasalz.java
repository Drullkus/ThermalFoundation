package cofh.thermalfoundation.render.entity;

import cofh.thermalfoundation.entity.monster.EntityBasalz;
import cofh.thermalfoundation.render.model.ModelElemental;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly (Side.CLIENT)
public class RenderEntityBasalz extends RenderLiving<EntityBasalz> {

	private static ResourceLocation texture;

	static {
		texture = new ResourceLocation("thermalfoundation:textures/entity/" + "basalz.png");
	}

	public RenderEntityBasalz(RenderManager renderManager) {

		super(renderManager, ModelElemental.instance, 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBasalz entity) {

		return texture;
	}

	@Override
	public void doRender(EntityBasalz entity, double x, double y, double z, float entityYaw, float partialTicks) {

		doRenderBasalz(entity, x, y, z, entityYaw, partialTicks);
	}

	private void doRenderBasalz(EntityBasalz entity, double x, double y, double z, float entityYaw, float partialTicks) {

		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

}
