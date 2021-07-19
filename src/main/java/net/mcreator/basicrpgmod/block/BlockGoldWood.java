
package net.mcreator.basicrpgmod.block;

@ElementsBasicRPGmod.ModElement.Tag
public class BlockGoldWood extends ElementsBasicRPGmod.ModElement {

	@GameRegistry.ObjectHolder("basicrpgmod:goldwood")
	public static final Block block = null;

	public BlockGoldWood(ElementsBasicRPGmod instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("goldwood"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("basicrpgmod:goldwood", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.WOOD);

			setUnlocalizedName("goldwood");
			setSoundType(SoundType.WOOD);

			setHardness(2F);
			setResistance(2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

		}

	}

}
