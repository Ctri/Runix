// Date: 1/6/2014 9:50:33 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class Modelparasite extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Leg1-1;
    ModelRenderer leg2-1;
    ModelRenderer Body;
    ModelRenderer Leg3-1;
    ModelRenderer Leg4-1;
    ModelRenderer Shape1;
    ModelRenderer Shape1;
    ModelRenderer tail;
    ModelRenderer Leg5-1;
    ModelRenderer Leg6-1;
    ModelRenderer leg1-2;
    ModelRenderer leg3-2;
    ModelRenderer leg5-2;
    ModelRenderer leg2-2;
    ModelRenderer leg1-2;
    ModelRenderer leg5-2;
    ModelRenderer antena1;
    ModelRenderer antena1;
  
  public Modelparasite()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 12);
      Head.addBox(-2F, -1F, -2F, 3, 3, 3);
      Head.setRotationPoint(-1F, 21F, -2F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Leg1-1 = new ModelRenderer(this, 18, 4);
      Leg1-1.addBox(0F, 0F, 0F, 2, 1, 1);
      Leg1-1.setRotationPoint(0F, 21F, -1F);
      Leg1-1.setTextureSize(64, 32);
      Leg1-1.mirror = true;
      setRotation(Leg1-1, 0F, 0.5576792F, 0F);
      leg2-1 = new ModelRenderer(this, 12, 4);
      leg2-1.addBox(0F, 0F, 0F, 2, 1, 1);
      leg2-1.setRotationPoint(-3F, 21F, 0F);
      leg2-1.setTextureSize(64, 32);
      leg2-1.mirror = true;
      setRotation(leg2-1, 0F, 2.792527F, -0.0371786F);
      Body = new ModelRenderer(this, 0, 18);
      Body.addBox(-1F, -1F, -1F, 3, 3, 3);
      Body.setRotationPoint(-2F, 21F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Leg3-1 = new ModelRenderer(this, 18, 2);
      Leg3-1.addBox(0F, 0F, 0F, 2, 1, 1);
      Leg3-1.setRotationPoint(0F, 21F, 0F);
      Leg3-1.setTextureSize(64, 32);
      Leg3-1.mirror = true;
      setRotation(Leg3-1, 0F, 0F, 0F);
      Leg4-1 = new ModelRenderer(this, 12, 2);
      Leg4-1.addBox(0F, 0F, 0F, 2, 1, 1);
      Leg4-1.setRotationPoint(-3F, 22F, 0F);
      Leg4-1.setTextureSize(64, 32);
      Leg4-1.mirror = true;
      setRotation(Leg4-1, 0F, 0F, -3.141593F);
      Shape1 = new ModelRenderer(this, 24, 2);
      Shape1.addBox(0F, 1F, -1F, 1, 1, 1);
      Shape1.setRotationPoint(-1F, 20F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 24, 0);
      Shape1.addBox(0F, 0F, -1F, 1, 1, 1);
      Shape1.setRotationPoint(-3F, 21F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 0, 24);
      tail.addBox(-1F, -1F, -1F, 3, 4, 4);
      tail.setRotationPoint(-2F, 20.5F, 3F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 0F, 0F, 0F);
      Leg5-1 = new ModelRenderer(this, 18, 0);
      Leg5-1.addBox(0F, 0F, 0F, 2, 1, 1);
      Leg5-1.setRotationPoint(0F, 21F, 1F);
      Leg5-1.setTextureSize(64, 32);
      Leg5-1.mirror = true;
      setRotation(Leg5-1, 0F, -0.5576792F, 0F);
      Leg6-1 = new ModelRenderer(this, 12, 0);
      Leg6-1.addBox(0F, 0F, 0F, 2, 1, 1);
      Leg6-1.setRotationPoint(-3F, 21F, 2F);
      Leg6-1.setTextureSize(64, 32);
      Leg6-1.mirror = true;
      setRotation(Leg6-1, 0F, -2.792527F, 0.0371786F);
      leg1-2 = new ModelRenderer(this, 28, 5);
      leg1-2.addBox(-0.5F, 0.4666667F, -0.5F, 1, 4, 1);
      leg1-2.setRotationPoint(1.5F, 21F, -2F);
      leg1-2.setTextureSize(64, 32);
      leg1-2.mirror = true;
      setRotation(leg1-2, 0F, 0F, -0.8552113F);
      leg3-2 = new ModelRenderer(this, 32, 5);
      leg3-2.addBox(-0.5F, 0.5F, -0.5F, 1, 4, 1);
      leg3-2.setRotationPoint(1.5F, 21F, 1F);
      leg3-2.setTextureSize(64, 32);
      leg3-2.mirror = true;
      setRotation(leg3-2, 0F, 0F, -0.8552113F);
      leg5-2 = new ModelRenderer(this, 36, 5);
      leg5-2.addBox(-0.5F, 0.5F, -0.5F, 1, 4, 1);
      leg5-2.setRotationPoint(1.5F, 21F, 3F);
      leg5-2.setTextureSize(64, 32);
      leg5-2.mirror = true;
      setRotation(leg5-2, 0F, 0F, -0.8552113F);
      leg2-2 = new ModelRenderer(this, 28, 0);
      leg2-2.addBox(-0.5F, 0.5F, -0.5F, 1, 4, 1);
      leg2-2.setRotationPoint(-4.5F, 21F, -1F);
      leg2-2.setTextureSize(64, 32);
      leg2-2.mirror = true;
      setRotation(leg2-2, 0F, 2.769806F, -0.8552113F);
      leg1-2 = new ModelRenderer(this, 32, 0);
      leg1-2.addBox(-0.5F, 0.5F, -0.5F, 1, 4, 1);
      leg1-2.setRotationPoint(-4.5F, 21F, 0F);
      leg1-2.setTextureSize(64, 32);
      leg1-2.mirror = true;
      setRotation(leg1-2, 0F, -2.862753F, -0.8552113F);
      leg5-2 = new ModelRenderer(this, 36, 0);
      leg5-2.addBox(-0.5F, 0.5F, -0.5F, 1, 4, 1);
      leg5-2.setRotationPoint(-5F, 21F, 2F);
      leg5-2.setTextureSize(64, 32);
      leg5-2.mirror = true;
      setRotation(leg5-2, 0F, -2.41661F, -0.8552113F);
      antena1 = new ModelRenderer(this, 0, 5);
      antena1.addBox(-1F, 0F, 0F, 1, 0, 5);
      antena1.setRotationPoint(-2F, 21F, -3F);
      antena1.setTextureSize(64, 32);
      antena1.mirror = true;
      setRotation(antena1, 2.303835F, 0F, 0F);
      antena1 = new ModelRenderer(this, 0, 0);
      antena1.addBox(0F, 0F, 0F, 1, 0, 5);
      antena1.setRotationPoint(-1F, 21F, -3F);
      antena1.setTextureSize(64, 32);
      antena1.mirror = true;
      setRotation(antena1, 2.303835F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Leg1-1.render(f5);
    leg2-1.render(f5);
    Body.render(f5);
    Leg3-1.render(f5);
    Leg4-1.render(f5);
    Shape1.render(f5);
    Shape1.render(f5);
    tail.render(f5);
    Leg5-1.render(f5);
    Leg6-1.render(f5);
    leg1-2.render(f5);
    leg3-2.render(f5);
    leg5-2.render(f5);
    leg2-2.render(f5);
    leg1-2.render(f5);
    leg5-2.render(f5);
    antena1.render(f5);
    antena1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}