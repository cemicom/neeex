package net.mcreator.basicrpgmod;

import java.util.Random;

@Elementsbasicrpgmod.ModElement.Tag
public class MCreatorDarkmountains extends Elementsbasicrpgmod.ModElement {
	@GameRegistry.ObjectHolder("basicrpgmod:darkmountains")
	public static final BiomeGenCustom biome = null;

	public MCreatorDarkmountains(Elementsbasicrpgmod instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.DRY);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
	}

	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Darkmountains").setRainfall(0.5F).setBaseHeight(0F).setWaterColor(-13421773).setHeightVariation(2F)
					.setTemperature(0.5F));
			setRegistryName("darkmountains");
			topBlock = MCreatorDarkGrass.block.getDefaultState();
			fillerBlock = MCreatorDarkStone.block.getDefaultState();
			decorator.generateFalls = true;
			decorator.treesPerChunk = 1;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 4;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -16777216;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -16777216;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -16777216;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return new CustomTree();
		}
	}

	static class CustomTree extends WorldGenAbstractTree {
		CustomTree() {
			super(false);
		}

		@Override
		public boolean generate(World world, Random rand, BlockPos position) {
			int height = rand.nextInt(5) + 7;
			boolean spawnTree = true;
			if (position.getY() >= 1 && position.getY() + height + 1 <= world.getHeight()) {
				for (int j = position.getY(); j <= position.getY() + 1 + height; j++) {
					int k = 1;
					if (j == position.getY())
						k = 0;
					if (j >= position.getY() + height - 1)
						k = 2;
					for (int px = position.getX() - k; px <= position.getX() + k && spawnTree; ++px) {
						for (int pz = position.getZ() - k; pz <= position.getZ() + k && spawnTree; ++pz) {
							if (j >= 0 && j < world.getHeight()) {
								if (!this.isReplaceable(world, new BlockPos(px, j, pz))) {
									spawnTree = false;
								}
							} else {
								spawnTree = false;
							}
						}
					}
				}
				if (!spawnTree) {
					return false;
				} else {
					Block ground = world.getBlockState(position.add(0, -1, 0)).getBlock();
					Block ground2 = world.getBlockState(position.add(0, -2, 0)).getBlock();
					if (!((ground == MCreatorDarkGrass.block.getDefaultState().getBlock() || ground == MCreatorDarkStone.block.getDefaultState()
							.getBlock()) && (ground2 == MCreatorDarkGrass.block.getDefaultState().getBlock() || ground2 == MCreatorDarkStone.block
							.getDefaultState().getBlock())))
						return false;
					IBlockState state = world.getBlockState(position.down());
					if (position.getY() < world.getHeight() - height - 1) {
						state.getBlock().onPlantGrow(state, world, position.down(), position);
						for (int genh = position.getY() - 3 + height; genh <= position.getY() + height; genh++) {
							int i4 = genh - (position.getY() + height);
							int j1 = 1 - i4 / 2;
							for (int k1 = position.getX() - j1; k1 <= position.getX() + j1; ++k1) {
								int l1 = k1 - position.getX();
								for (int i2 = position.getZ() - j1; i2 <= position.getZ() + j1; ++i2) {
									int j2 = i2 - position.getZ();
									if (Math.abs(l1) != j1 || Math.abs(j2) != j1 || rand.nextInt(2) != 0 && i4 != 0) {
										BlockPos blockpos = new BlockPos(k1, genh, i2);
										state = world.getBlockState(blockpos);
										if (state.getBlock().isAir(state, world, blockpos) || state.getBlock().isLeaves(state, world, blockpos)
												|| state.getBlock() == Blocks.AIR.getDefaultState().getBlock()
												|| state.getBlock() == MCreatorDarkLeaves.block.getDefaultState().getBlock()) {
											this.setBlockAndNotifyAdequately(world, blockpos, MCreatorDarkLeaves.block.getDefaultState());
										}
									}
								}
							}
						}
						for (int genh = 0; genh < height; genh++) {
							BlockPos genhPos = position.up(genh);
							state = world.getBlockState(genhPos);
							if (state.getBlock().isAir(state, world, genhPos) || state.getBlock() == Blocks.AIR.getDefaultState().getBlock()
									|| state.getBlock() == MCreatorDarkLeaves.block.getDefaultState().getBlock()) {
								this.setBlockAndNotifyAdequately(world, position.up(genh), MCreatorDarkWood.block.getDefaultState());
							}
						}
						return true;
					} else {
						return false;
					}
				}
			} else {
				return false;
			}
		}

		private void addVines(World world, BlockPos pos) {
			this.setBlockAndNotifyAdequately(world, pos, Blocks.AIR.getDefaultState());
			int i = 5;
			for (BlockPos blockpos = pos.down(); world.isAirBlock(blockpos) && i > 0; --i) {
				this.setBlockAndNotifyAdequately(world, blockpos, Blocks.AIR.getDefaultState());
				blockpos = blockpos.down();
			}
		}

		@Override
		protected boolean canGrowInto(Block blockType) {
			return blockType.getDefaultState().getMaterial() == Material.AIR || blockType == MCreatorDarkWood.block.getDefaultState().getBlock()
					|| blockType == MCreatorDarkLeaves.block.getDefaultState().getBlock()
					|| blockType == MCreatorDarkGrass.block.getDefaultState().getBlock()
					|| blockType == MCreatorDarkStone.block.getDefaultState().getBlock();
		}

		@Override
		protected void setDirtAt(World world, BlockPos pos) {
			if (world.getBlockState(pos).getBlock() != MCreatorDarkStone.block.getDefaultState().getBlock())
				this.setBlockAndNotifyAdequately(world, pos, MCreatorDarkStone.block.getDefaultState());
		}

		@Override
		public boolean isReplaceable(World world, BlockPos pos) {
			net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
			return state.getBlock().isAir(state, world, pos) || canGrowInto(state.getBlock()) || state.getBlock().isReplaceable(world, pos);
		}
	}
}
