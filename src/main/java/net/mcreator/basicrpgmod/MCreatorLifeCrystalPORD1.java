package net.mcreator.basicrpgmod;

import java.util.HashMap;
import java.util.Collection;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorLifeCrystalPORD1 extends Elementsbasicrpgmod.ModElement {
	public MCreatorLifeCrystalPORD1(Elementsbasicrpgmod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorLifeCrystalPORD1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.HEALTH_BOOST)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).addExperienceLevel((int) 0);
		} else {
			if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal6.block,
					(int) (1))) : false)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity)
							.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 90000000, (int) 24, (false), (false)));
			} else {
				if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal5.block,
						(int) (1))) : false)) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 90000000, (int) 20, (false),
								(false)));
				} else {
					if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal4.block,
							(int) (1))) : false)) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 90000000, (int) 16, (false),
									(false)));
					} else {
						if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
								MCreatorLifeCrystal3.block, (int) (1))) : false)) {
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 90000000, (int) 8,
										(false), (false)));
						} else {
							if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
									MCreatorLifeCrystal2.block, (int) (1))) : false)) {
								if (entity instanceof EntityLivingBase)
									((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 90000000, (int) 4,
											(false), (false)));
							} else {
								if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
										MCreatorLifeCrystal.block, (int) (1))) : false)) {
									if (entity instanceof EntityLivingBase)
										((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 90000000,
												(int) 2, (false), (false)));
								} else {
									if (entity instanceof EntityPlayer)
										((EntityPlayer) entity).addExperience((int) 0);
								}
							}
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
