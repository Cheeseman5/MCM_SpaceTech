package com.schwig.stech.creativetab;

import com.schwig.stech.init.ModItems;
import com.schwig.stech.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabST
{
    public static final CreativeTabs ST_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Space Tech";
        }
    };



}
