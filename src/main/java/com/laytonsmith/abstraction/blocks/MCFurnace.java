package com.laytonsmith.abstraction.blocks;

import com.laytonsmith.abstraction.MCFurnaceInventory;

public interface MCFurnace extends MCContainer {
	short getBurnTime();
	void setBurnTime(short burnTime);
	short getCookTime();
	void setCookTime(short cookTime);
	@Override
	MCFurnaceInventory getInventory();
}
