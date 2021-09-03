package net.mcreator.basicrpgmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.potion.PotionShocked;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureFrozenSwordMobIsHitWithTool extends ElementsBasicRPGmod.ModElement {
	public ProcedureFrozenSwordMobIsHitWithTool(ElementsBasicRPGmod instance) {
		super(instance, 217);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FrozenSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionShocked.potion, (int) 30, (int) 0, (false), (false)));
	}
}
