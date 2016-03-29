/*
 * File name: FoodMod.java
 * com.github.firecrafty.foodmod.FoodMod
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

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;

import cpw.mods.fml.common.SidedProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author firecrafty
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION) //Initiate the mod
public class FoodMod {

    public static final Logger LOG = LogManager.getLogger(Reference.MOD_NAME);
    //Instance init
    @Instance(value = Reference.MOD_ID)
    public static FoodMod instance;
    //Proxies
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    //Start events
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ItemSetup.preSetup();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        ItemSetup.setup();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //Placeholder for post initialization events
    }
    //End Events
}
