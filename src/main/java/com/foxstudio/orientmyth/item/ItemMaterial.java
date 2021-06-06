package com.foxstudio.orientmyth.item;

import com.foxstudio.orientmyth.api.item.ItemModName;
import com.foxstudio.orientmyth.api.state.enums.item.ItemMaterialCoreEnum;
import com.foxstudio.orientmyth.lib.BaseOrientmythTab;
import com.foxstudio.orientmyth.lib.base.ItemMetaBase;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author cyciling
 */
public class ItemMaterial extends ItemMetaBase {
    public ItemMaterial(int meta, CreativeTabs tab, String name) {
        super(0, 64, meta, true, tab, name);
    }
}
