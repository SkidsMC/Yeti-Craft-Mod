package skidsmc.yeticraftmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import skidsmc.yeticraftmod.init.ItemInit;

public class YetiCraftTab extends CreativeTabs 
{
	public YetiCraftTab(String label) { super("yeticrafttab");
	this.setBackgroundImageName("yeticraft.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.icicle);}

	}
