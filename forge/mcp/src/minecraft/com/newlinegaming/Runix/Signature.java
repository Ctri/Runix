package com.newlinegaming.Runix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Signature {
    
    public ArrayList<SigBlock> blocks;
    
    public Signature()
    {
        blocks = new ArrayList<SigBlock>();
    }

    public Signature(AbstractRune rune, WorldXYZ coords) {
        blocks = new ArrayList<SigBlock>();

        HashMap<WorldXYZ, SigBlock> shape = rune.runicFormulae(coords);
        for (WorldXYZ target : shape.keySet()) {
            if (shape.get(target).blockID == AbstractRune.SIGR) {
                if (!Tiers.isTier0(target.getBlockId()))
                    blocks.add(target.getSigBlock());
                else
                    blocks.add(new SigBlock(0, 0));
            }
        }
        rune.aetherSay(coords.worldObj, "Signature:" + blocks.toString());
    }
    
    public boolean equals(Signature other){
        for( SigBlock b : blocks){//ensure the two signatures have the same number of instances of each block i.e. 3 cobble vs 1 cobble
            if( Collections.frequency(other.blocks, b) != Collections.frequency(blocks, b))
                return false;
        }
        System.out.println("Match found");//"Comparing:" + this + " =? " + other + " = " + answer);
        return true;
    }
    
    public String toString(){
        return blocks.toString();
    }
}
