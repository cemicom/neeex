package net.mcreator.basicrpgmod;

import java.util.HashMap;
import java.util.Collection;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorShockedOnPotionActiveTickju extends Elementsbasicrpgmod.ModElement {
	public MCreatorShockedOnPotionActiveTickju(Elementsbasicrpgmod instance) {
		super(instance, 186);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorShockedOnPotionActiveTickju!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MCreatorShocked.potion)
							return true;
					}
				}
				return false;
			}
		}.check()) || ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.SLOWNESS)
							return true;
					}
				}
				return false;
			}
		}.check()) && (new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.POISON)
							return true;
					}
				}
				return false;
			}
		}.check())))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).clearActivePotions();
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorFreezeResistance.potion, (int) 120, (int) 1, (false), (false)));
		}
	}
}
