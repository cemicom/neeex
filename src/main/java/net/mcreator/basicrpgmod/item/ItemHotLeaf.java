
package net.mcreator.basicrpgmod.item;

@ElementsBasicRPGmod.ModElement.Tag
public class ItemHotLeaf extends ElementsBasicRPGmod.ModElement {

	@GameRegistry.ObjectHolder("basicrpgmod:hotleaf")
	public static final Item block = null;

	public ItemHotLeaf(ElementsBasicRPGmod instance) {
		super(instance, 130);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:hotleaf", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(6, 6f, false);
			setUnlocalizedName("hotleaf");
			setRegistryName("hotleaf");

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

				ProcedureHotLeafFoodEaten.executeProcedure($_dependencies);
			}
		}

	}

}
