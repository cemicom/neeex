package net.mcreator.basicrpgmod.procedure;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureDarkScalePlantPlantDestroyedByPlayer extends ElementsBasicRPGmod.ModElement {

	public ProcedureDarkScalePlantPlantDestroyedByPlayer(ElementsBasicRPGmod instance) {
		super(instance, 119);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DarkScalePlantPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DarkScalePlantPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DarkScalePlantPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DarkScalePlantPlantDestroyedByPlayer!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if ((Math.random() < 0.1)) {
		}

	}

}
