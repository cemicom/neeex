package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorCorupptedbushPlantDestroyedByPlayer extends Elementsbasicrpgmod.ModElement {
	public MCreatorCorupptedbushPlantDestroyedByPlayer(Elementsbasicrpgmod instance) {
		super(instance, 55);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.spawnParticle(EnumParticleTypes.PORTAL, x, y, z, 1, 2, 1);
		world.spawnParticle(EnumParticleTypes.PORTAL, x, y, z, 1, 2, 1);
		world.spawnParticle(EnumParticleTypes.PORTAL, x, y, z, 1, 2, 1);
		world.spawnParticle(EnumParticleTypes.PORTAL, x, y, z, 1, 2, 1);
	}
}
