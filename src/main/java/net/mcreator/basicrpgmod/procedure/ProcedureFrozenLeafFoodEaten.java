package net.mcreator.basicrpgmod.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.potion.PotionShocked;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

import java.util.Collection;

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
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == PotionShocked.potion)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).clearActivePotions();
		}
	}
}
