/*
 * File name: FoodModTabs.java
 * com.github.firecrafty.foodmod.FoodModTabs
 *
 * Copyright (C) 2016 firecrafty
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.firecrafty.foodmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 *
 * @author firecrafty
 */
public final class FoodModTabs extends CreativeTabs
{
    public FoodModTabs(int par1, String par2str)
    {
        super(par1, par2str);
    }
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return FMItems.foodModTabItem;
    }
    
}
