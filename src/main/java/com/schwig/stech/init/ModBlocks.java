package com.schwig.stech.init;

import com.schwig.stech.block.BlockFlag;
import com.schwig.stech.block.BlockST;

import com.schwig.stech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockST flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
