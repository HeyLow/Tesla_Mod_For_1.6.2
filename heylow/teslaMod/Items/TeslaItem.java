package heylow.teslaMod.Items;

import heylow.teslaMod.TeslaBaseClass;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.CreativeTabs;
import heylow.teslaMod.teslaTab.*;

public class TeslaItem extends Item{
	public TeslaItem(int par1){
	super(par1);
	setCreativeTab(TeslaBaseClass.TeslaTab);
	}	
}
