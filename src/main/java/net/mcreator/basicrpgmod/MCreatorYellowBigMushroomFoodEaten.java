package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorYellowBigMushroomFoodEaten extends Elementsbasicrpgmod.ModElement {
	public MCreatorYellowBigMushroomFoodEaten(Elementsbasicrpgmod instance) {
		super(instance, 197);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorYellowBigMushroomFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 60, (int) 1, (false), (false)));
	}
}
