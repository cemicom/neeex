package net.mcreator.basicrpgmod.procedure;

@ElementsBasicRPGmod.ModElement.Tag
public class ProcedureMyticAppleFoodEaten extends ElementsBasicRPGmod.ModElement {

	public ProcedureMyticAppleFoodEaten(ElementsBasicRPGmod instance) {
		super(instance, 107);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MyticAppleFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 60, (int) 0, (false), (false)));

	}

}
