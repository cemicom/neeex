package net.mcreator.basicrpgmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.potion.PotionFreezeResistance;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureFrozenLeafFoodEaten extends ElementsBasicRPGmod.ModElement {
	public ProcedureFrozenLeafFoodEaten(ElementsBasicRPGmod instance) {
		super(instance, 162);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FrozenLeafFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionFreezeResistance.potion, (int) 600, (int) 1, (false), (false)));
	}
}
