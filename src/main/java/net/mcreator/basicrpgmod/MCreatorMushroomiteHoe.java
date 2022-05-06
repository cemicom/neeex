package net.mcreator.basicrpgmod;

import java.util.Set;
import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorMushroomiteHoe extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:mushroomitehoe")
	public static final Item block = null;

	public MCreatorMushroomiteHoe(Elementsbasicrpgmod instance) {
		super(instance, 209);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("MUSHROOMITEHOE", 1, 150, 4f, 2f, 14)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("mushroomitehoe").setRegistryName("mushroomitehoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:mushroomitehoe", "inventory"));
	}
}
