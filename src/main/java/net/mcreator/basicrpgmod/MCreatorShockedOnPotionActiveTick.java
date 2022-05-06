package net.mcreator.basicrpgmod;

import java.util.HashMap;
import java.util.Collection;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorShockedOnPotionActiveTick extends Elementsbasicrpgmod.ModElement {
	public MCreatorShockedOnPotionActiveTick(Elementsbasicrpgmod instance) {
		super(instance, 154);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorShockedOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.SPEED)
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
		}.check()))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		} else {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 120, (int) 1, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 120, (int) 1, (false), (false)));
		}
	}
}
