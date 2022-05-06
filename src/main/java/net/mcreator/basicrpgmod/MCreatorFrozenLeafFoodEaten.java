package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorFrozenLeafFoodEaten extends Elementsbasicrpgmod.ModElement {
	public MCreatorFrozenLeafFoodEaten(Elementsbasicrpgmod instance) {
		super(instance, 162);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorFrozenLeafFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorFreezeResistance.potion, (int) 600, (int) 1, (false), (false)));
	}
}
