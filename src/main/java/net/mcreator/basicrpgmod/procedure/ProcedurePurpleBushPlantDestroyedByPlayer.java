package net.mcreator.basicrpgmod.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.basicrpgmod.item.ItemPurpleCotton;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedurePurpleBushPlantDestroyedByPlayer extends ElementsBasicRPGmod.ModElement {
	public ProcedurePurpleBushPlantDestroyedByPlayer(ElementsBasicRPGmod instance) {
		super(instance, 123);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PurpleBushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PurpleBushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PurpleBushPlantDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PurpleBushPlantDestroyedByPlayer!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((Math.random() < 0.1)) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemPurpleCotton.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
