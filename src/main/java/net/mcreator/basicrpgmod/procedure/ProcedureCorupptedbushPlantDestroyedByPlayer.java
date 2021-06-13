package net.mcreator.basicrpgmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;

import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureCorupptedbushPlantDestroyedByPlayer extends ElementsBasicRPGmod.ModElement {
	public ProcedureCorupptedbushPlantDestroyedByPlayer(ElementsBasicRPGmod instance) {
		super(instance, 55);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CorupptedbushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CorupptedbushPlantDestroyedByPlayer!");
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
