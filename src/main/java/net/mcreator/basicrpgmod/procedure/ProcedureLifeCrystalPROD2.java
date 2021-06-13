package net.mcreator.basicrpgmod.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.item.ItemLifeCrystal6;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal5;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal4;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal3;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal2;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

import java.util.Collection;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureLifeCrystalPROD2 extends ElementsBasicRPGmod.ModElement {
	public ProcedureLifeCrystalPROD2(ElementsBasicRPGmod instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LifeCrystalPROD2!");
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
			if (((new Object() {
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
			}.check()) && ((((((entity instanceof EntityPlayer)
					? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal6.block, (int) (1)))
					: false)
					|| ((entity instanceof EntityPlayer)
							? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal5.block, (int) (1)))
							: false))
					|| ((entity instanceof EntityPlayer)
							? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal4.block, (int) (1)))
							: false))
					|| ((entity instanceof EntityPlayer)
							? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal3.block, (int) (1)))
							: false))
					|| (((entity instanceof EntityPlayer)
							? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal2.block, (int) (1)))
							: false)
							|| ((entity instanceof EntityPlayer)
									? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal.block, (int) (1)))
									: false))))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).addExperience((int) 0);
			} else {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
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
