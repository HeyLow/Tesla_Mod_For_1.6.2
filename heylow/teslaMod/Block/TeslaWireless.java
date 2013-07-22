package heylow.teslaMod.Block;

import heylow.teslaMod.TeslaBaseClass;
import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import heylow.teslaMod.teslaTab.*;

public class TeslaWireless extends Block{
	public TeslaWireless(int par1, String texture) {
		super(par1, Material.rock);
		this.setHardness(4.0F);
		this.setResistance(20.0F);
		this.setStepSound(Block.soundMetalFootstep);
		setCreativeTab(TeslaBaseClass.TeslaTab);
	}
}