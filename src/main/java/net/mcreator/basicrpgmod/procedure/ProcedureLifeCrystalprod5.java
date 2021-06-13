package net.mcreator.basicrpgmod.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.item.ItemLifeCrystal4;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal3;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal2;
import net.mcreator.basicrpgmod.item.ItemLifeCrystal;
import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureLifeCrystalprod5 extends ElementsBasicRPGmod.ModElement {
	public ProcedureLifeCrystalprod5(ElementsBasicRPGmod instance) {
		super(instance, 19);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LifeCrystalprod5!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LifeCrystalprod5!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LifeCrystalprod5!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LifeCrystalprod5!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LifeCrystalprod5!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal4.block, (int) (1)))
				: false)
				&& ((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal3.block, (int) (1)))
						: false))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).clearActivePotions();
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLifeCrystal3.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(ItemLifeCrystal3.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		} else {
			if ((((entity instanceof EntityPlayer)
					? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal4.block, (int) (1)))
					: false)
					&& ((entity instanceof EntityPlayer)
							? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal2.block, (int) (1)))
							: false))) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLifeCrystal2.block, (int) (1)).getItem(), -1, (int) 1,
							null);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(ItemLifeCrystal2.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			} else {
				if ((((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal4.block, (int) (1)))
						: false)
						&& ((entity instanceof EntityPlayer)
								? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemLifeCrystal.block, (int) (1)))
								: false))) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).clearActivePotions();
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLifeCrystal.block, (int) (1)).getItem(), -1, (int) 1,
								null);
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(ItemLifeCrystal.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				} else {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).addExperience((int) 0);
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
