package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorFrozenSwordMobIsHitWithTool extends Elementsbasicrpgmod.ModElement {
	public MCreatorFrozenSwordMobIsHitWithTool(Elementsbasicrpgmod instance) {
		super(instance, 217);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorFrozenSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorShocked.potion, (int) 30, (int) 0, (false), (false)));
	}
}
