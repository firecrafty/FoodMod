/*
 * File name: FMItems.java
 * com.github.firecrafty.foodmod.FMItems
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
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 *
 * @author firecrafty
 */
public class FMItems
{
    public static Item foodModTabItem = new Item().setTextureName("foodmod:foodModTab");
    
    public static CreativeTabs foodModTab = new FoodModTabs(CreativeTabs.getNextID(), "foodMod");
    public static ItemFoodMeat uncookedSpam;
    public static ItemFoodMeat cookedSpam;
    
    
    public static void registerItems()
    {
        FoodMod.LOG.info(new StringBuilder().append("Registering Items...").toString());
        
        GameRegistry.registerItem(uncookedSpam, uncookedSpam.getUnlocalizedName());
        GameRegistry.registerItem(cookedSpam, cookedSpam.getUnlocalizedName());
        GameRegistry.registerItem(foodModTabItem, foodModTabItem.getUnlocalizedName());
        
        FoodMod.LOG.info(new StringBuilder().append("All Items Registered").toString());
    }
    public static void registerRecipes()
    {
        FoodMod.LOG.info(new StringBuilder().append("Registering Recipes...").toString());
        
        GameRegistry.addRecipe(new ItemStack(FMItems.uncookedSpam, 9), "ABC","CAB","BCA",'A', new ItemStack(Items.beef), 'B', new ItemStack(Items.porkchop), 'C', new ItemStack(Items.chicken));
        GameRegistry.addSmelting(FMItems.uncookedSpam, new ItemStack(FMItems.cookedSpam), 0f);
        
        FoodMod.LOG.info(new StringBuilder().append("Finished Registering Recipes").toString());
        
    }
}
