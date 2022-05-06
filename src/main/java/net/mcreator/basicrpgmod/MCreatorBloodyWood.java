package net.mcreator.basicrpgmod;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorBloodyWood extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:bloodywood")
	public static final Block block = null;

	public MCreatorBloodyWood(Elementsbasicrpgmod instance) {
		super(instance, 224);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("basicrpgmod:bloodywood", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setRegistryName("bloodywood");
			setUnlocalizedName("bloodywood");
			setSoundType(SoundType.GROUND);
			setHardness(2F);
			setResistance(2F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}
	}
}
