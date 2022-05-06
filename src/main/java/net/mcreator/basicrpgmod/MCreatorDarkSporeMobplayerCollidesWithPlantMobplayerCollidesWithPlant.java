package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant extends Elementsbasicrpgmod.ModElement {
	public MCreatorDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant(Elementsbasicrpgmod instance) {
		super(instance, 204);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err
					.println("Failed to load dependency world for procedure MCreatorDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorPurpleGel.block.getDefaultState(), 3);
		}
	}
}
