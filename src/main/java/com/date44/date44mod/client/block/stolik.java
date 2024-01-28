package com.date44.date44mod.client.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * NewProject - Undefined
 * Created using Tabula 4.1.1
 */
public class stolik extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;

    public stolik() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape4 = new ModelRenderer(this, 0, 0);
        this.shape4.setRotationPoint(-7.0F, 10.0F, 5.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 2, 14, 2, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(5.0F, 10.0F, 5.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 2, 14, 2, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(5.0F, 10.0F, -7.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 2, 14, 2, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(-7.0F, 10.0F, -7.0F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 2, 14, 2, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 14);
        this.shape1.setRotationPoint(-8.0F, 8.0F, -8.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 16, 2, 16, 0.0F);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.shape2.render(f5);
        this.shape4.render(f5);
        this.shape3.render(f5);
        this.shape1.render(f5);
        this.shape5.render(f5);
    }

    public void renderModel(float f) {
        this.shape2.render(f);
        this.shape4.render(f);
        this.shape3.render(f);
        this.shape1.render(f);
        this.shape5.render(f);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotate(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
