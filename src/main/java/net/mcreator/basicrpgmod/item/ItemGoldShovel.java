
package net.mcreator.basicrpgmod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.basicrpgmod.ElementsBasicRPGmod;

import java.util.Set;
import java.util.HashMap;

@ElementsBasicRPGmod.ModElement.Tag
public class ItemGoldShovel extends ElementsBasicRPGmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:goldshovel")
	public static final Item block = null;
	public ItemGoldShovel(ElementsBasicRPGmod instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("GOLDSHOVEL", 0, 50, 2f, -2f, 11)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 0);
				return ret.keySet();
			}
		}.setUnlocalizedName("goldshovel").setRegistryName("goldshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("basicrpgmod:goldshovel", "inventory"));
	}
}
