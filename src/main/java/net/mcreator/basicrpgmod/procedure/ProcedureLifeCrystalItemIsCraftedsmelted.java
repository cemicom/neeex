package net.mcreator.basicrpgmod.procedure;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureLifeCrystalItemIsCraftedsmelted extends ElementsBasicRPGmod.ModElement {
	public ProcedureLifeCrystalItemIsCraftedsmelted(ElementsBasicRPGmod instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LifeCrystalItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).clearActivePotions();
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).clearActivePotions();
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).clearActivePotions();
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).clearActivePotions();
	}
}
