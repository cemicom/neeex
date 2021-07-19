
package net.mcreator.basicrpgmod.item;

@ElementsBasicRPGmod.ModElement.Tag
public class ItemPoisinousBall extends ElementsBasicRPGmod.ModElement {

	@GameRegistry.ObjectHolder("basicrpgmod:poisinousball")
	public static final Item block = null;

	public ItemPoisinousBall(ElementsBasicRPGmod instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:poisinousball", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("poisinousball");
			setRegistryName("poisinousball");
			setCreativeTab(CreativeTabs.MISC);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}

}
