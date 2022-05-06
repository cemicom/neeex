package net.mcreator.basicrpgmod;

import java.util.Set;
import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorDarkWoodsPickaxe extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:darkwoodspickaxe")
	public static final Item block = null;

	public MCreatorDarkWoodsPickaxe(Elementsbasicrpgmod instance) {
		super(instance, 32);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("DARKWOODSPICKAXE", 0, 90, 3f, 2f, 11)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 0);
				return ret.keySet();
			}
		}.setUnlocalizedName("darkwoodspickaxe").setRegistryName("darkwoodspickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:darkwoodspickaxe", "inventory"));
	}
}
