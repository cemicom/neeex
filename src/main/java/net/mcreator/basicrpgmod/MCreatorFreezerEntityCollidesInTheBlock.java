package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorFreezerEntityCollidesInTheBlock extends Elementsbasicrpgmod.ModElement {
	public MCreatorFreezerEntityCollidesInTheBlock(Elementsbasicrpgmod instance) {
		super(instance, 160);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorFreezerEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorShocked.potion, (int) 120, (int) 1, (false), (false)));
	}
}
