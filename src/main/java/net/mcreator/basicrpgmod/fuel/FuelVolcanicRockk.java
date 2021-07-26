
package net.mcreator.basicrpgmod.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.basicrpgmod.item.ItemVolcanicRock;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class FuelVolcanicRockk extends ElementsBasicRPGmod.ModElement {
	public FuelVolcanicRockk(ElementsBasicRPGmod instance) {
		super(instance, 131);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemVolcanicRock.block, (int) (1)).getItem())
			return 100000;
		return 0;
	}
}
