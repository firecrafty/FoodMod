/*
 * File name: FMBlockCrops.java
 * com.github.firecrafty.foodmod.blocks.plants.FMBlockCrops
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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import static net.minecraft.item.Item.getItemFromBlock;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 *
 * @author firecrafty
 */
public class FMBlockCrops extends BlockBush implements IGrowable {

    protected int maxGrowthStage = 7;

    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcon;

    public FMBlockCrops() {
        setTickRandomly(true);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setCreativeTab((CreativeTabs) null);
        setHardness(0.0F);
        setStepSound(soundTypeGrass);
        disableStats();
    }

    @Override
    protected boolean canPlaceBlockOn(Block parBlock) {
        return parBlock == Blocks.farmland;
    }

    public void incrementGrowStage(World parWorld, Random parRand, int parX, int parY, int parZ) {
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + MathHelper.getRandomIntegerInRange(parRand, 2, 5);

        if (growStage > maxGrowthStage) {
            growStage = maxGrowthStage;
        }
        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random parRand, int parFortune) {
        return getItemFromBlock(this);
    }
    // The type of render that is performed
    public int getRenderType() {
        return 1;//crossed like flowers
    }
    /*
     * Gets the block's texture  
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int parSide, int parGrowthStage) {
        return iIcon[parGrowthStage];
    }
    @Override
    //grow naturally
    public void updateTick(World parWorld, int parX, int parY, int parZ, Random parRand) {
        super.updateTick(parWorld, parX, parY, parZ, parRand);
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ);
        
        if(growStage > 7) {
            growStage = 7;
        }
        
        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }
    
    //Implement the IGrowable interface methods
    @Override
    // checks if plant is finished growing
    public boolean func_149851_a(World parWorld, int parX, int parY, int parZ, boolean p_149851_5_) {
        return parWorld.getBlockMetadata(parX, parY, parZ) != 7;
    }
    
    @Override
    //returns true when bonemeal is used
    public boolean func_149852_a(World p_149852_1_, Random parRand, int p_149852_3_, int p_149852_4_, int p_149852_5_){
        return true;
    }
    @Override
    //processes growth tick logic
    public void func_149853_b(World parWorld, Random parRand, int parX, int parY, int parZ) {
        incrementGrowStage(parWorld, parRand, parX, parY, parZ);
    }
}
