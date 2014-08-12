package com.schwig.stech.init;

import com.schwig.stech.item.ItemMapleLeaf;
import com.schwig.stech.item.ItemST;
import com.schwig.stech.reference.Reference;
import com.schwig.stech.utility.Logger;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemST mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
