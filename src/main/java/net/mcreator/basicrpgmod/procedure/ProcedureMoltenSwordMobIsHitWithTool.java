package net.mcreator.basicrpgmod.procedure;

import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureMoltenSwordMobIsHitWithTool extends ElementsBasicRPGmod.ModElement {
	public ProcedureMoltenSwordMobIsHitWithTool(ElementsBasicRPGmod instance) {
		super(instance, 215);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MoltenSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 4);
	}
}
