package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorBloodyAppleFoodEaten extends Elementsbasicrpgmod.ModElement {
	public MCreatorBloodyAppleFoodEaten(Elementsbasicrpgmod instance) {
		super(instance, 226);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorBloodyAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, (int) 500, (int) 1, (false), (false)));
	}
}
