package com.date44.date44mod.client.block;

import com.date44.date44mod.Date44mod;
import com.date44.date44mod.client.block.styl;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class blockStyl extends TileEntitySpecialRenderer {
	private final styl model;
	private final ResourceLocation texture = new ResourceLocation(Date44mod.MODID + ':' + "textures/model/M2.png");

	public blockStyl() {
		this.model = new styl();
	}

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scala) {
		GL11.glPushMatrix();
			GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5);
			GL11.glRotated(180,0,0,1);
			this.bindTexture(texture);
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F);
			GL11.glPopMatrix();
		GL11.glPopMatrix();

	}
}
