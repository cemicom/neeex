package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorShockedSaplingPlantRightClicked extends Elementsbasicrpgmod.ModElement {
	public MCreatorShockedSaplingPlantRightClicked(Elementsbasicrpgmod instance) {
		super(instance, 172);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorShockedSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorShockedSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorShockedSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorShockedSaplingPlantRightClicked!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorSockedWood.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MCreatorSockedWood.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), MCreatorSockedWood.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), MCreatorSockedWood.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), MCreatorSockedWood.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) z), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 5), (int) z), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 3), (int) (y + 5), (int) z), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z + 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 5), (int) (z - 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z + 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z - 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) (z - 0)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 6), (int) z), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 6), (int) (z + 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 6), (int) (z - 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 6), (int) (z - 0)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 4), (int) z), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z + 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 0), (int) (y + 4), (int) (z - 1)), MCreatorShockedleafes.block.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 4), (int) (z - 0)), MCreatorShockedleafes.block.getDefaultState(), 3);
	}
}
