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

import com.github.firecrafty.foodmod.core.FMItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 *
 * @author firecrafty
 */
public class ItemSetup extends FMItems {

    public static void preSetup() {
        FoodMod.LOG.info(new StringBuilder().append("Loading components..."));
        initItems();
        registerItems();
        
        FoodMod.LOG.info(new StringBuilder().append("Finished loading components").toString());
    }
    public static void setup() {
        
        
        FoodMod.LOG.info(new StringBuilder().append("Registering Recipes...").toString());

        GameRegistry.addRecipe(new ItemStack(FMItems.uncookedSpam, 9), "ABC", "CAB", "BCA", 'A', new ItemStack(Items.beef), 'B', new ItemStack(Items.porkchop), 'C', new ItemStack(Items.chicken));
        GameRegistry.addSmelting(FMItems.uncookedSpam, new ItemStack(FMItems.cookedSpam), 0f);

        FoodMod.LOG.info(new StringBuilder().append("Finished Registering Recipes").toString());
    }
}
