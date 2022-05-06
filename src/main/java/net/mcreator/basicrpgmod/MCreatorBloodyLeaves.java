package net.mcreator.basicrpgmod;

import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorBloodyLeaves extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:bloodyleaves")
	public static final Block block = null;

	public MCreatorBloodyLeaves(Elementsbasicrpgmod instance) {
		super(instance, 223);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("basicrpgmod:bloodyleaves", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setRegistryName("bloodyleaves");
			setUnlocalizedName("bloodyleaves");
			setSoundType(SoundType.GROUND);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			Block block = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				MCreatorBloodyLeavesBlockDestroyedByPlayer.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
