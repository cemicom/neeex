package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorLifeCrystal extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:lifecrystal")
	public static final Item block = null;

	public MCreatorLifeCrystal(Elementsbasicrpgmod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:lifecrystal", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setUnlocalizedName("lifecrystal");
			setRegistryName("lifecrystal");
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

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, EntityPlayer entity) {
			super.onCreated(itemstack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				MCreatorLifeCrystalItemIsCraftedsmelted.executeProcedure($_dependencies);
			}
		}
	}
}
