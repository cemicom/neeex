package net.mcreator.basicrpgmod;

import java.util.Random;
import java.util.HashMap;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorYellowMushroom extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:yellowmushroom")
	public static final Block block = null;

	public MCreatorYellowMushroom(Elementsbasicrpgmod instance) {
		super(instance, 195);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("basicrpgmod:yellowmushroom",
				"inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		for (int i = 0; i < 4; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenFlowers(((BlockFlower) block), BlockFlower.EnumFlowerType.DANDELION)).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}

	public static class BlockCustomFlower extends BlockFlower {
		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(CreativeTabs.DECORATIONS);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setUnlocalizedName("yellowmushroom");
			setRegistryName("yellowmushroom");
		}

		@Override
		public BlockFlower.EnumFlowerColor getBlockType() {
			return BlockFlower.EnumFlowerColor.YELLOW;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void getSubBlocks(CreativeTabs tab, net.minecraft.util.NonNullList<ItemStack> list) {
			for (BlockFlower.EnumFlowerType blockflower$enumflowertype : BlockFlower.EnumFlowerType.getTypes(this.getBlockType())) {
				list.add(new ItemStack(this, 1, blockflower$enumflowertype.getMeta()));
			}
		}

		@Override
		public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
			super.onEntityCollidedWithBlock(world, pos, state, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			Block block = this;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				MCreatorYellowBigMushroomMobplayerCollidesWithPlant.executeProcedure($_dependencies);
			}
		}
	}
}