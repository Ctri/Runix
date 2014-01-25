package com.newlinegaming.Runix.Runes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.newlinegaming.Runix.PersistentRune;
import com.newlinegaming.Runix.Util_SphericalFunctions;
import com.newlinegaming.Runix.WorldXYZ;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.EnumChatFormatting;

public class FaithRune extends PersistentRune{
	
	protected static ArrayList<PersistentRune> activeFaithList = new ArrayList<PersistentRune>();
	public Integer radius;
	
	public FaithRune(){
	    runeName = "Faith";
	}
	public FaithRune(EntityPlayer creator, WorldXYZ loc, int radius)
	{
	    super(loc, creator, "Faith");
	}
	
	public int[][][] runicTemplateOriginal(){
		return new int [][][] 
           {{{0,0,0},
             {0,41,0},
             {0,0,0}},
            {{41,0,41},
             {0,41,0},
             {41,0,41}}};
	}
	
	public void execute(WorldXYZ coords, EntityPlayer player)
	{
		if (!runeAllowed(player, this)) return;
		for (PersistentRune tmp : activeFaithList)
		{//Josiah: sorry, there's no way to get around type casting and still have an interface or abstract parent 
		    FaithRune fr = (FaithRune)tmp;
			if (fr.location != null && fr.radius != null)
			{
				if(Util_SphericalFunctions.radiusCheck(fr.location, fr.radius+8))
				{
					player.sendChatToPlayer(ChatMessageComponent.createFromText(EnumChatFormatting.RED+"ISLANDS TOO CLOSE"));
					return;
				}
			}
		}
		this.runeName = "Faith";
		this.floatIsland(player, coords);
		
		
	}
	
	
	
	public void floatIsland(EntityPlayer player,WorldXYZ islandCentre)
	{
		aetherSay(player,EnumChatFormatting.GREEN+"Floating an island");
		List<WorldXYZ> points = Util_SphericalFunctions.getSphere(islandCentre, 8);
		aetherSay(player,EnumChatFormatting.GREEN+"Got "+points.size()+" points to raise");
		//use AbstractRune.moveShape() which will charge energy for the move
	}

    @Override
    public ArrayList<PersistentRune> getActiveMagic() {
        return activeFaithList;
    }

    @Override
    public boolean oneRunePerPerson() {
        return false;
    }
    
    public boolean isFlatRuneOnly(){
        return true;
    }
	

	

}