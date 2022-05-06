package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorGreenBigMushroomFoodEaten extends Elementsbasicrpgmod.ModElement {
	public MCreatorGreenBigMushroomFoodEaten(Elementsbasicrpgmod instance) {
		super(instance, 201);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorGreenBigMushroomFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SATURATION, (int) 60, (int) 1, (false), (false)));
	}
}
