package skidsmc.yeticraftmod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import skidsmc.yeticraftmod.YetiCraftMod;

public class CustomIcecube extends Item 
{
	public CustomIcecube(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(YetiCraftMod.yeticrafttab);
	}
}
