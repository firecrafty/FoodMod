/*
 * File name: FoodMod.java
 * com.github.firecrafty.minecraft.foodmod.FoodMod
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
package com.github.firecrafty.minecraft.foodmod;

import com.github.firecrafty.minecraft.foodmod.item.ItemMeatFood;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;

import cpw.mods.fml.common.SidedProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid=FoodMod.MODID, name=FoodMod.MODNAME, version=FoodMod.VERSION) //Initiate the mod
public class FoodMod {
    //Overrides mcmod.info
    public static final String MODID = "foodmod";
    public static final String VERSION = "0.1.0-SNAPSHOT";
    public static final String MODNAME = "Food Mod";
    public static final String DESC = "More foods for minecraft!";
    public static final String SRC_URL = "https://github.com/firecrafty/FoodMod";
    public static final String[] AUTHORS = { "firecrafty" };
    
    // Initialize item fields
    public static ItemMeatFood uncookedSpam;
    @Instance(value = FoodMod.MODID)
    public static FoodMod instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerItem(uncookedSpam = (ItemMeatFood) new ItemMeatFood("uncookedSpam", 1, 0.2f, true).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMisc), "uncooked_spam");
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
