package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorBloodyApple extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:bloodyapple")
	public static final Item block = null;

	public MCreatorBloodyApple(Elementsbasicrpgmod instance) {
		super(instance, 226);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:bloodyapple", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(2, 0.3F, false);
			setUnlocalizedName("bloodyapple");
			setRegistryName("bloodyapple");
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
				MCreatorBloodyAppleFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
