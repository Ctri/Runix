package com.newlinegaming.Runix;

import com.newlinegaming.Runix.apiimpl.API;
import com.newlinegaming.Runix.handlers.RuneHandler;
import com.newlinegaming.Runix.proxys.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = RunixMain.MODID,  name = RunixMain.MODID, version = RunixMain.VERSION, dependencies = "required-after:Forge@[14.22.1.2478,)", useMetadata = true)
public class RunixMain {
    public static final String MODID = "runix";
    public static final String VERSION = "1.0";


    @Mod.Instance
    public static RunixMain instance;

    public final CreativeTabs tabs = new CreativeTabs("runix") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.GOLDEN_AXE);
        }
    };

    @SidedProxy(clientSide = "com.newlinegaming.Runix.proxys.ClientProxy", serverSide = "com.newlinegaming.Runix.proxys.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static RunixMain instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
        Tiers tiers = new Tiers(); //load the list of block tiers
        tiers.initializeEnergyRegistry();
        MinecraftForge.EVENT_BUS.register(RuneHandler.getInstance());
    }

    @EventHandler
    public void serverStop(FMLServerStoppingEvent event){
        System.out.println("Clearing all runes");
        for(AbstractRune r : RuneHandler.getInstance().runeRegistry)
            if( r instanceof PersistentRune)
                ((PersistentRune) r).clearActiveMagic();
    }
}
/**
    public static final CreativeTabs TabRunix = new TabRunix(LibInfo.MOD_ID + ":runix");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
//        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + LibInfo.MOD_NAME + ".cfg"));
        ModBlock.init();
        ModFluid.init();
        ModItem.init();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderInformation();
        proxy.registerTileEnitiy();
    }


}
*/