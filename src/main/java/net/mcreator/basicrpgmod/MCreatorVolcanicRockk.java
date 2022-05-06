package net.mcreator.basicrpgmod;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorVolcanicRockk extends Elementsbasicrpgmod.ModElement {
	public MCreatorVolcanicRockk(Elementsbasicrpgmod instance) {
		super(instance, 131);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorVolcanicRock.block, (int) (1)).getItem())
			return 100000;
		return 0;
	}
}
