package skidsmc.yeticraftmod.handlers;

import skidsmc.yeticraftmod.init.BlockInit;
import skidsmc.yeticraftmod.init.ItemInit;

public class RegistryHandler 
{
    public static void Client()
    {
    	ItemInit.register();
    	BlockInit.registerRenders();
    }
    
    public static void Common()
    {
    	ItemInit.init();
    	BlockInit.init();
    	BlockInit.register();
    }
}
