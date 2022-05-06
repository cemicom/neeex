package net.mcreator.basicrpgmod;

import java.util.Set;
import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorDarkPickaxe extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:darkpickaxe")
	public static final Item block = null;

	public MCreatorDarkPickaxe(Elementsbasicrpgmod instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("DARKPICKAXE", 1, 150, 4f, 3f, 21)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("darkpickaxe").setRegistryName("darkpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:darkpickaxe", "inventory"));
	}
}
