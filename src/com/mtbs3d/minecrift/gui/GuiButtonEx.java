package com.mtbs3d.minecrift.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiButton;

/**
 * Created with IntelliJ IDEA.
 * User: Engineer
 * Date: 6/5/13
 * Time: 7:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class GuiButtonEx extends GuiButton
{
    public GuiButtonEx(int par1, int par2, int par3, int par4, int par5, String par6Str)
    {
        super(par1, par2, par3, par4, par5, par6Str);
    }

    public int getWidth()
    {
        return super.width;
    }

    public int getHeight()
    {
        return super.height;
    }

    public GuiButtonEx(int par1, int par2, int par3, String par4Str)
    {
        super(par1, par2, par3, par4Str);
    }

    public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3)
    {
        return super.mousePressed(par1Minecraft, par2, par3);
    }
}