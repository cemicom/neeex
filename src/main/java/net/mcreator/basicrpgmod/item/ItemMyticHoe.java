
package net.mcreator.basicrpgmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

import java.util.Set;
import java.util.HashMap;

@ElementsBasicRPGmod.ModElement.Tag
public class ItemMyticHoe extends ElementsBasicRPGmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:mytichoe")
	public static final Item block = null;
	public ItemMyticHoe(ElementsBasicRPGmod instance) {
		super(instance, 89);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("MYTICHOE", 1, 170, 3f, 0f, 14)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("mytichoe").setRegistryName("mytichoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:mytichoe", "inventory"));
	}
}
