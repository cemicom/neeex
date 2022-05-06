package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorMoltenSwordMobIsHitWithTool extends Elementsbasicrpgmod.ModElement {
	public MCreatorMoltenSwordMobIsHitWithTool(Elementsbasicrpgmod instance) {
		super(instance, 215);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorMoltenSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 4);
	}
}
