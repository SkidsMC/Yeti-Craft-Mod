package skidsmc.yeticraftmod.init.blocks;

import net.minecraft.block.Block;

public class CustomOre extends CustomBlock {

	public CustomOre(String name, float hardness, float resistance, int harvestlevel)
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestlevel);
	}

}
