/*
 * File name: ItemSetup.java
 * com.github.firecrafty.foodmod.ItemSetup
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

import com.github.firecrafty.foodmod.common.item.ItemFoodMeat;

/**
 *
 * @author firecrafty
 */
public class ItemSetup extends FMItems
{
    public static void setup()
    {   
        
        FoodMod.LOG.info(new StringBuilder().append("Loading Items...").toString());
        
        uncookedSpam = (ItemFoodMeat) new ItemFoodMeat(2, true).setUnlocalizedName("uncookedSpam").setTextureName("foodmod:uncookedSpam").setCreativeTab(foodModTab);
        cookedSpam = (ItemFoodMeat) new ItemFoodMeat(4, true).setUnlocalizedName("cookedSpam").setTextureName("foodmod:cookedSpam").setCreativeTab(foodModTab);
        
        registerItems();
        registerRecipes();
        
        FoodMod.LOG.info(new StringBuilder().append("Finished Loading Items").toString());
    }
}
