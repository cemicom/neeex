package net.mcreator.basicrpgmod.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.Entity;

import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureMyticSwordMobIsHitWithTool extends ElementsBasicRPGmod.ModElement {
	public ProcedureMyticSwordMobIsHitWithTool(ElementsBasicRPGmod instance) {
		super(instance, 218);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MyticSwordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof EntityZombie) || (entity instanceof EntityWitherSkeleton))
				|| ((entity instanceof EntityStray) || (entity instanceof EntityWither)))
				|| (((entity instanceof EntitySkeletonHorse) || (entity instanceof EntityPigZombie))
						|| ((entity instanceof EntityHusk) || (entity instanceof EntitySkeleton))))
				|| (entity instanceof EntityArrow))) {
			entity.attackEntityFrom(DamageSource.OUT_OF_WORLD, (float) 1.5);
		}
	}
}
