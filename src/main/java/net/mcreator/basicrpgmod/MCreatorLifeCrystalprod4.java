package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorLifeCrystalprod4 extends Elementsbasicrpgmod.ModElement {
	public MCreatorLifeCrystalprod4(Elementsbasicrpgmod instance) {
		super(instance, 18);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorLifeCrystalprod4!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorLifeCrystalprod4!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorLifeCrystalprod4!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorLifeCrystalprod4!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorLifeCrystalprod4!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal5.block, (int) (1)))
				: false) && ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
				MCreatorLifeCrystal4.block, (int) (1))) : false))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).clearActivePotions();
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorLifeCrystal4.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(MCreatorLifeCrystal4.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
		} else {
			if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal5.block,
					(int) (1))) : false) && ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
					MCreatorLifeCrystal3.block, (int) (1))) : false))) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).clearActivePotions();
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorLifeCrystal3.block, (int) (1)).getItem(), -1, (int) 1,
							null);
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(MCreatorLifeCrystal3.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			} else {
				if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal5.block,
						(int) (1))) : false) && ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
						MCreatorLifeCrystal2.block, (int) (1))) : false))) {
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).clearActivePotions();
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorLifeCrystal2.block, (int) (1)).getItem(), -1,
								(int) 1, null);
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(MCreatorLifeCrystal2.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				} else {
					if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(MCreatorLifeCrystal5.block,
							(int) (1))) : false) && ((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(
							MCreatorLifeCrystal.block, (int) (1))) : false))) {
						if (entity instanceof EntityLivingBase)
							((EntityLivingBase) entity).clearActivePotions();
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorLifeCrystal.block, (int) (1)).getItem(), -1,
									(int) 1, null);
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, (x + 2), y, z, new ItemStack(MCreatorLifeCrystal.block, (int) (1)));
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
