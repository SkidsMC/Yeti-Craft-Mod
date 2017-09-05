package skidsmc.yeticraftmod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import skidsmc.yeticraftmod.Reference;
import skidsmc.yeticraftmod.YetiCraftMod;
import skidsmc.yeticraftmod.init.blocks.CustomOre;

public class BlockInit 
{
	public static Block ice_ore;
	
	public static void init()
	{
		ice_ore = new CustomOre("ice_ore", 2.0F, 4.0F, 2);
	}
	
	public static void register()
	{
		registerBlock(ice_ore);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(YetiCraftMod.yeticrafttab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(ice_ore);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":"
		+ block.getUnlocalizedName().substring(5)));
	}
}
