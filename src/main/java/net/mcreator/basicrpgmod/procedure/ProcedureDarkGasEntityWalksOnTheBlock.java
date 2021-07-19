package net.mcreator.basicrpgmod.procedure;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureDarkGasEntityWalksOnTheBlock extends ElementsBasicRPGmod.ModElement {

	public ProcedureDarkGasEntityWalksOnTheBlock(ElementsBasicRPGmod instance) {
		super(instance, 68);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DarkGasEntityWalksOnTheBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 60, (int) 1, (false), (false)));

	}

}
