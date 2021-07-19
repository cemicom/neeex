
package net.mcreator.basicrpgmod.item;

@ElementsBasicRPGmod.ModElement.Tag
public class ItemMyticApple extends ElementsBasicRPGmod.ModElement {

	@GameRegistry.ObjectHolder("basicrpgmod:myticapple")
	public static final Item block = null;

	public ItemMyticApple(ElementsBasicRPGmod instance) {
		super(instance, 107);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:myticapple", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("myticapple");
			setRegistryName("myticapple");

			setCreativeTab(CreativeTabs.FOOD);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);

				ProcedureMyticAppleFoodEaten.executeProcedure($_dependencies);
			}
		}

	}

}
