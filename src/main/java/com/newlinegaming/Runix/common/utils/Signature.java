package com.newlinegaming.Runix.common.utils;

import illyohs.mods.yssgaroth.common.world.SigBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//import com.newlinegaming.Runix.common.runes.AbstractRune;



import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class Signature {
    
    public ArrayList<SigBlock> blocks;
    public transient ArrayList<Integer> metaWhiteList;
    
    public Signature()
    {
        blocks = new ArrayList<SigBlock>();
    }

    /**Legacy Note: Signatures now include "Tier 0" blocks as valid signature options.
     * @param rune for fetching the runicFormulae()
     * @param coords with facing
     */
//    public Signature(AbstractRune rune, WorldXYZ coords) {
//        blocks = new ArrayList<SigBlock>();
//        Block[] usableMetaData = new Block[]{//this list specifically lacks any block that uses meta for orientation
//                Blocks.carpet,
////                Block.cloth, 
//                Blocks.wheat, //added just in case you WANT an impossible waypoint
//                Blocks.hardened_clay, Blocks.jukebox, //adjusting the notes would change your Signature :D
//                Blocks.planks, 
//                Blocks.heavy_weighted_pressure_plate, Blocks.light_weighted_pressure_plate, Blocks.wooden_pressure_plate, Blocks.stone_pressure_plate, //may be some potential there
//                Blocks.stained_hardened_clay,
//                Blocks.log, Blocks.log2, Blocks.double_wooden_slab, Blocks.wooden_slab,
//        };
//        metaWhiteList = Tiers.loadBlockIds(usableMetaData);
//
//        HashMap<WorldXYZ, SigBlock> shape = rune.runicFormulae(coords);
//        for (WorldXYZ target : shape.keySet()) {
//            if (shape.get(target).blockID == AbstractRune.SIGR) {
//                int blockID = target.getBlockId();
//                if( blockID != 0 ){
//                    if(metaWhiteList.contains(new Integer(blockID)))
//                        blocks.add(target.getSigBlock());
//                    else
//                        blocks.add(new SigBlock(blockID, 0));//just the blockID
//                }
//            }
//        }
//        rune.aetherSay(coords.getWorld(), "Signature:" + blocks.toString());
//    }
//    
//    public boolean equals(Signature other){
//        for( SigBlock b : blocks){//ensure the two signatures have the same number of instances of each block i.e. 3 cobble vs 1 cobble
//            if( Collections.frequency(other.blocks, b) != Collections.frequency(blocks, b))
//                return false;
//        }
////        System.out.println("Match found");//"Comparing:" + this + " =? " + other + " = " + answer);
//        return true;
//    }
//    
//    public String toString(){
//        return blocks.toString();
//    }
//
//    public boolean isEmpty() {
//        return blocks.isEmpty();
//    }
}