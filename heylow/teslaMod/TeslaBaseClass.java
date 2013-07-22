 package heylow.teslaMod;

//imports
import heylow.teslaMod.Block.TeslaBlock;
import heylow.teslaMod.Block.TeslaToroid;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import heylow.teslaMod.Block.*;
import heylow.teslaMod.Items.*;
import heylow.teslaMod.PFX.*;
import heylow.teslaMod.teslaTab.TabTeslaMod;
import heylow.teslaMod.teslaTab.*;

//Declare its a mod... oddly enough minecraft is retarded and doesn't no whenever a new file is implemented.... stupid minecraft
@Mod(modid="HeyLowTesla",name="The Tesla Mod",version="v1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class TeslaBaseClass {
	//Now Lets Declare Something mod related Shall we
	
	//Creative Tab
	public static CreativeTabs TeslaTab = new TabTeslaMod(CreativeTabs.getNextID(), "HeyLow's Tesla Mod");
	
	//items
	public static Item TeslaEC;
	public static Item TeslaCap;
	public static Item TeslaREBattery;
	public static Item TeslaWire;
	public static Item TeslaMagWire;
	public static Item MagWCoil;
	public static Item AcrylicPlate;
	public static Item AcrylicTube;
	public static Item PCB;
	public static Item SolderIron;
	public static Item Solder;
	public static Item SolderSpool;
	public static Item SSC;
	public static Item WirelessSSC;
	public static Item MS;
	public static Item Plastic;
	public static Item Copper;
	public static Item CopperTube;
	public static Item CopTubeCoil;
	public static Item Steel;
	public static Item PCoil;
	public static Item SCoil;
	public static Item Drill;
	public static Item CarvedAcrylic;
	public static Item ELSocket;
	public static Item Screw;
	public static Item LED;
	public static Item Filament;
	public static Item Light;
	public static Item LightBase;
	public static Item WirelessCoil;
	public static Item TeslaGun;
	public static Item FlashLight;
	public static Item LEDFlashLight;
	public static Item Lantern;
	public static Item LEDLantern;

	//Blocks
	public static Block AcrylicPipe;
	public static Block AcrylicBlock;
	public static Block Toroid;
	public static Block ToroidCenter;
	public static Block WirelessEU;
	
	//Declaring Init
	@Init
	public void load(FMLInitializationEvent event){
		
		//Item Declaration 
		TeslaEC = new TeslaItem(3000).setUnlocalizedName("Put_Texture_Name_Here");
		TeslaCap = new TeslaItem(3001).setUnlocalizedName("Put_Texture_Name_Here1");
		TeslaREBattery = new TeslaItem(3002).setUnlocalizedName("Put_Texture_Name_Here2");
		TeslaGun = new TeslaItem(3003).setUnlocalizedName("Put_Texture_Name_Here3");
		TeslaWire = new TeslaItem(3004).setUnlocalizedName("Put_Texture_Name_Here4");
		TeslaMagWire = new TeslaItem(3005).setUnlocalizedName("Put_Texture_Name_Here5");
		AcrylicPlate = new TeslaItem(3006).setUnlocalizedName("Put_Texture_Name_Here6");
		AcrylicTube = new TeslaItem(3007).setUnlocalizedName("Put_Texture_Name_Here7");
		PCB = new TeslaItem(3008).setUnlocalizedName("Put_Texture_Name_Here8");
		SolderIron = new TeslaItem(3009).setUnlocalizedName("Put_Texture_Name_Here9");
		Solder = new TeslaItem(3010).setUnlocalizedName("Put_Texture_Name_Here10");
		SSC = new TeslaItem(3011).setUnlocalizedName("Put_Texture_Name_Here11");
		MS = new TeslaItem(3012).setUnlocalizedName("Put_Texture_Name_Here12");
		Plastic = new TeslaItem(3013).setUnlocalizedName("Put_Texture_Name_Here13");
		Copper = new TeslaItem(3014).setUnlocalizedName("Put_Texture_Name_Here14");
		CopperTube = new TeslaItem(3015).setUnlocalizedName("Put_Texture_Name_Here15");
		Steel = new TeslaItem(3016).setUnlocalizedName("Put_Texture_Name_Here16");
		PCoil = new TeslaItem(3017).setUnlocalizedName("Put_Texture_Name_Here17");
		SCoil = new TeslaItem(3018).setUnlocalizedName("Put_Texture_Name_Here18");
		Drill = new TeslaItem(3019).setUnlocalizedName("Put_Texture_Name_Here19");
		CarvedAcrylic = new TeslaItem(3020).setUnlocalizedName("Put_Texture_Name_Here20");
		ELSocket = new TeslaItem(3021).setUnlocalizedName("Put_Texture_Name_Here21");
		Screw = new TeslaItem(3022).setUnlocalizedName("Put_Texture_Name_Here22");
		MagWCoil = new TeslaItem(3023).setUnlocalizedName("Put_Texture_Name_Here23");
		CopTubeCoil = new TeslaItem(3024).setUnlocalizedName("Put_Texture_Name_Here24");
		WirelessCoil = new TeslaItem(3025).setUnlocalizedName("Put_Texture_Name_Here25");
		WirelessSSC = new TeslaItem(3026).setUnlocalizedName("Put_Texture_Name_Here26");
		SolderSpool = new TeslaItem(3027).setUnlocalizedName("Put_Texture_Name_Here27");
		LEDFlashLight = new TeslaItem(3028).setUnlocalizedName("Put_Texture_Name_Here28");
		FlashLight = new TeslaItem(3029).setUnlocalizedName("Put_Texture_Name_Here29");
		Lantern = new TeslaItem(3030).setUnlocalizedName("Put_Texture_Name_Here30");
		LEDLantern = new TeslaItem(3031).setUnlocalizedName("Put_Texture_Name_Here31");
		LED = new TeslaItem(3032).setUnlocalizedName("Put_Texture_Name_Here32");
		Light = new TeslaItem(3033).setUnlocalizedName("Put_Texture_Name_Here33");
		Filament = new TeslaItem(3034).setUnlocalizedName("Put_Texture_Name_Here34");
		LightBase = new TeslaItem(3035).setUnlocalizedName("Put_Texture_Name_Here35");
		//Block Declaration
		AcrylicPipe = new TeslaBlock(4000, "AcrylicPipe").setUnlocalizedName("Rawr");
		AcrylicBlock = new TeslaBlock(4001, "AcrylicBlock").setUnlocalizedName("rawr1");
		Toroid = new TeslaToroid(4003, "Torriod").setUnlocalizedName("rawr2");
		ToroidCenter = new TeslaToroid(4004, "ToroidCenter").setUnlocalizedName("Rawr3");
		WirelessEU = new TeslaWireless(4005, "WirelessEU").setUnlocalizedName("Rawr4");
		//Block Registry
		GameRegistry.registerBlock(AcrylicPipe, "AcrylicPipe");
		GameRegistry.registerBlock(AcrylicBlock, "AcrylicBlock");
		GameRegistry.registerBlock(Toroid, "Torroid");
		GameRegistry.registerBlock(ToroidCenter, "TorroidCenter");
		GameRegistry.registerBlock(WirelessEU, "WirelessEU`");
		//Item Registry
		
		//Food Registry
		
		//Language Registry
		
		LanguageRegistry.addName(TeslaEC, "Tesla Energy Cell");
		LanguageRegistry.addName(TeslaCap, "Capacitor");
		LanguageRegistry.addName(TeslaREBattery, "Rechargeable Battery");
		LanguageRegistry.addName(TeslaGun, "Tesla Cannon");
		LanguageRegistry.addName(TeslaWire, "Basic Wire");
		LanguageRegistry.addName(TeslaMagWire, "Magnet Wire");
		LanguageRegistry.addName(AcrylicPlate, "Acrylic Plate");
		LanguageRegistry.addName(AcrylicTube, "Acrylic Tube");
		LanguageRegistry.addName(PCB, "PCB");
		LanguageRegistry.addName(SolderIron, "Soldering Iron");
		LanguageRegistry.addName(Solder, "Solder");
		LanguageRegistry.addName(SSC, "Solid State Controller");
		LanguageRegistry.addName(MS, "Cant Remember The Name");
		LanguageRegistry.addName(Plastic, "Plastic");
		LanguageRegistry.addName(Copper, "Copper Ingot");
		LanguageRegistry.addName(CopperTube, "Copper Tube");
		LanguageRegistry.addName(Steel, "Steel");
		LanguageRegistry.addName(PCoil, "Primary Coil");
		LanguageRegistry.addName(SCoil, "Secondary Coil");
		LanguageRegistry.addName(Drill, "Drill");
		LanguageRegistry.addName(CarvedAcrylic, "Carved Acrylic");
		LanguageRegistry.addName(ELSocket, "Electric Socket");
		LanguageRegistry.addName(Screw, "Screw");
		LanguageRegistry.addName(MagWCoil, "Magnet Wire Coil");
		LanguageRegistry.addName(CopTubeCoil, "Copper Tube Coil");
		LanguageRegistry.addName(WirelessCoil, "Wireless Coil");
		LanguageRegistry.addName(WirelessSSC, "Wireless Solid State Controller");
		LanguageRegistry.addName(SolderSpool, "Solder Spool");
		LanguageRegistry.addName(FlashLight, "Flash Light");
		LanguageRegistry.addName(LEDFlashLight, "Led Flash Light");
		LanguageRegistry.addName(LED, "LED");
		LanguageRegistry.addName(Light, "Light");
		LanguageRegistry.addName(Filament, "Light Filament");
		LanguageRegistry.addName(LightBase, "Light Base");
		LanguageRegistry.addName(LEDLantern, "LED Lantern");
		LanguageRegistry.addName(Lantern, "Lantern");
		LanguageRegistry.addName(AcrylicPipe, "Acrylic Pipe");
		LanguageRegistry.addName(AcrylicBlock, "Acrylic Block");
		LanguageRegistry.addName(Toroid, "Toriod");
		LanguageRegistry.addName(ToroidCenter, "Toriod Center");
		LanguageRegistry.addName(WirelessEU, "Wireless Energy Unit");
		//Recipes
	}
}