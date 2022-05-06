package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorTornadoFlowerMobplayerCollidesWithPlant extends Elementsbasicrpgmod.ModElement {
	public MCreatorTornadoFlowerMobplayerCollidesWithPlant(Elementsbasicrpgmod instance) {
		super(instance, 175);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTornadoFlowerMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.LEVITATION, (int) 4, (int) 120, (false), (false)));
	}
}
