package com.foxstudio.orientmyth.api.item;

import com.foxstudio.orientmyth.api.state.enums.item.ItemMaterialCoreEnum;
import com.foxstudio.orientmyth.item.ItemMaterial;
import com.foxstudio.orientmyth.lib.BaseOrientmythTab;
import net.minecraft.item.Item;

/**
 * @author cyciling
 */
public class ItemMod {
    // TODO: 2021/6/4 ItemSet

    public static Item
            MATERIAL_CORE = new ItemMaterial(ItemMaterialCoreEnum.values().length, BaseOrientmythTab.CORE, ItemModName.MATERIAL_CORE);
}
