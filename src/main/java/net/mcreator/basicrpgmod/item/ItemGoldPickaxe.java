
package net.mcreator.basicrpgmod.item;

@ElementsBasicRPGmod.ModElement.Tag
public class ItemGoldPickaxe extends ElementsBasicRPGmod.ModElement {

	@GameRegistry.ObjectHolder("basicrpgmod:goldpickaxe")
	public static final Item block = null;

	public ItemGoldPickaxe(ElementsBasicRPGmod instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("GOLDPICKAXE", 0, 90, 3f, -2f, 11)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 0);
				return ret.keySet();
			}

		}.setUnlocalizedName("goldpickaxe").setRegistryName("goldpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:goldpickaxe", "inventory"));
	}

}
