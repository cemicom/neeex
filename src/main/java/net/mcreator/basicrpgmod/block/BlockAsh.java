
package net.mcreator.basicrpgmod.block;

@ElementsBasicRPGmod.ModElement.Tag
public class BlockAsh extends ElementsBasicRPGmod.ModElement {

	@GameRegistry.ObjectHolder("basicrpgmod:ash")
	public static final Block block = null;

	public BlockAsh(ElementsBasicRPGmod instance) {
		super(instance, 125);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("ash"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("basicrpgmod:ash", "inventory"));

	}

	public static class BlockCustom extends BlockFalling {

		public BlockCustom() {
			super(Material.ROCK);

			setUnlocalizedName("ash");
			setSoundType(SoundType.GROUND);

			setHardness(6F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
				net.minecraftforge.common.IPlantable plantable) {
			return true;
		}

	}

}
