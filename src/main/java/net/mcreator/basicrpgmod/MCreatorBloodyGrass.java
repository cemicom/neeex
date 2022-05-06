package net.mcreator.basicrpgmod;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorBloodyGrass extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:bloodygrass")
	public static final Block block = null;

	public MCreatorBloodyGrass(Elementsbasicrpgmod instance) {
		super(instance, 221);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader
				.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("basicrpgmod:bloodygrass", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GRASS);
			setRegistryName("bloodygrass");
			setUnlocalizedName("bloodygrass");
			setSoundType(SoundType.GROUND);
			setHardness(0.6F);
			setResistance(0.6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.GRASS;
		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
				net.minecraftforge.common.IPlantable plantable) {
			return true;
		}
	}
}
