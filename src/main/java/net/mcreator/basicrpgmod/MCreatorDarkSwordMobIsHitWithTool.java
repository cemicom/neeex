package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorDarkSwordMobIsHitWithTool extends Elementsbasicrpgmod.ModElement {
	public MCreatorDarkSwordMobIsHitWithTool(Elementsbasicrpgmod instance) {
		super(instance, 216);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorDarkSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, (int) 45, (int) 0, (false), (false)));
	}
}
