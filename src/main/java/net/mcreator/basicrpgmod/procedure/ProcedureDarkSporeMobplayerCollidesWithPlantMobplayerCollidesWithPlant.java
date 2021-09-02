package net.mcreator.basicrpgmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.basicrpgmod.block.BlockPurpleGel;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant extends ElementsBasicRPGmod.ModElement {
	public ProcedureDarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant(ElementsBasicRPGmod instance) {
		super(instance, 204);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DarkSporeMobplayerCollidesWithPlantMobplayerCollidesWithPlant!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockPurpleGel.block.getDefaultState(), 3);
		}
	}
}
