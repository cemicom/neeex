package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorMyticSwordMobIsHitWithTool extends Elementsbasicrpgmod.ModElement {
	public MCreatorMyticSwordMobIsHitWithTool(Elementsbasicrpgmod instance) {
		super(instance, 218);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorMyticSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof EntityZombie) || (entity instanceof EntityWitherSkeleton)) || ((entity instanceof EntityStray) || (entity instanceof EntityWither))) || (((entity instanceof EntitySkeletonHorse) || (entity instanceof EntityPigZombie)) || ((entity instanceof EntityHusk) || (entity instanceof EntitySkeleton)))) || (entity instanceof EntityArrow))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1.5);
		}
	}
}
