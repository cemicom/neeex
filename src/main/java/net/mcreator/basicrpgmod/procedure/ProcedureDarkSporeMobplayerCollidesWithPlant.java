package net.mcreator.basicrpgmod.procedure;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureDarkSporeMobplayerCollidesWithPlant extends ElementsBasicRPGmod.ModElement {

	public ProcedureDarkSporeMobplayerCollidesWithPlant(ElementsBasicRPGmod instance) {
		super(instance, 67);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DarkSporeMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DarkSporeMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DarkSporeMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DarkSporeMobplayerCollidesWithPlant!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockDarkGas.block.getDefaultState(), 3);
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockDarkGas.block.getDefaultState(), 3);
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockDarkGas.block.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockDarkGas.block.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockDarkGas.block.getDefaultState(), 3);
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockDarkGas.block.getDefaultState(), 3);
						}
					}
				}
			}
		}

	}

}
