package com.newlinegaming.Runix.placeholder;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class RunixPlaceHolder extends Item{
	
	public RunixPlaceHolder(int par1) {
		super(par1);

	}
public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("Runix:PlaceHolder1");
}

}