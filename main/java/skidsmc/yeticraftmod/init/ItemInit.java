package skidsmc.yeticraftmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skidsmc.yeticraftmod.Reference;
import skidsmc.yeticraftmod.init.items.CustomIcecube;
import skidsmc.yeticraftmod.init.items.CustomIcicle;

public class ItemInit 
{
	public static Item icicle;
	public static Item icecube;
	
	public static void init() 
	{
		icicle = new CustomIcicle("icicle");
		icecube = new CustomIcecube("icecube");
	}

	public static void register()
	{
		registerItem(icicle);
		registerItem(icecube);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);

		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
	
}
