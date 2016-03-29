/*
 * File name: BlockCropTomato.java
 * com.github.firecrafty.foodmod.blocks.plants.BlockCropTomato
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
package com.github.firecrafty.foodmod.blocks.plants;

import com.github.firecrafty.foodmod.core.FMItems;
import java.util.Random;
import net.minecraft.item.Item;

/**
 *
 * @author firecrafty
 */
public class BlockCropTomato extends FMBlockCrops{
    public BlockCropTomato() {
        //basic block setup
        setBlockName("tomatoCrop");
        setBlockTextureName("foodmod:tomatoCrop_stage_0");
    }
    
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand) {
        return (parMetadata/2);
    }
    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune) {
        System.out.println("BlockCropTomato getItemDropped();");
        return FMItems.tomatoFruit;
    }
}
