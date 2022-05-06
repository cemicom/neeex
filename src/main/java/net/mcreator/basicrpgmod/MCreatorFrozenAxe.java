package net.mcreator.basicrpgmod;

import java.util.Set;

import com.google.common.collect.Sets;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorFrozenAxe extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:frozenaxe")
	public static final Item block = null;

	public MCreatorFrozenAxe(Elementsbasicrpgmod instance) {
		super(instance, 176);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("frozenaxe").setRegistryName("frozenaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:frozenaxe", "inventory"));
	}

	private static class ItemToolCustom extends ItemTool {
		private static final Set<Block> effective_items_set = com.google.common.collect.Sets.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF,
				Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON,
				Blocks.WOODEN_PRESSURE_PLATE});

		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("FROZENAXE", 1, 190, 5f, 5.3f, 14), effective_items_set);
			this.attackDamage = 5.3f;
			this.attackSpeed = -3.1F;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}
	}
}
