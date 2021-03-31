
package net.mcreator.sturcturemodv.world.structure;

import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.Block;

import net.mcreator.sturcturemodv.ElementsSturcturemodv;

import java.util.Random;

@ElementsSturcturemodv.ModElement.Tag
public class StructureZelt_gruen extends ElementsSturcturemodv.ModElement {
	public StructureZelt_gruen(ElementsSturcturemodv instance) {
		super(instance, 5);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		if ((random.nextInt(1000000) + 1) <= 10000) {
			int count = random.nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = 255;
				if (isNetherType) {
					boolean notpassed = true;
					while (height > 0) {
						if (notpassed && (world.isAirBlock(new BlockPos(i, height, k)) || !world.getBlockState(new BlockPos(i, height, k)).getBlock()
								.getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement()))
							notpassed = false;
						else if (!notpassed && !world.isAirBlock(new BlockPos(i, height, k)) && world.getBlockState(new BlockPos(i, height, k))
								.getBlock().getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement())
							break;
						height--;
					}
				} else {
					while (height > 0) {
						if (!world.isAirBlock(new BlockPos(i, height, k)) && world.getBlockState(new BlockPos(i, height, k)).getBlock()
								.getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement())
							break;
						height--;
					}
				}
				int j = height - 1;
				boolean biomeCriteria = false;
				Biome biome = world.getBiome(new BlockPos(i, j, k));
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("ocean")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("desert")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("extreme_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("swampland")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("river")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("hell")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("sky")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("frozen_ocean")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("frozen_river")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("ice_mountains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mushroom_island")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mushroom_island_shore")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("beaches")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("desert_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("smaller_extreme_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("jungle")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("jungle_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("jungle_edge")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("deep_ocean")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("stone_beach")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("cold_beach")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("extreme_hills_with_trees")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("savanna")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("savanna_rock")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mesa")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mesa_rock")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mesa_clear_rock")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_desert")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_extreme_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_swampland")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_ice_flats")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_jungle")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_jungle_edge")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_extreme_hills_with_trees")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_savanna")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_savanna_rock")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_mesa")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_mesa_rock")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_mesa_clear_rock")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("void")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("desert_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("forest_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("taiga_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("smaller_extreme_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("birch_forest_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("taiga_cold_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("redwood_taiga_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("extreme_hills_with_trees")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_extreme_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_birch_forest_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_redwood_taiga_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("mutated_extreme_hills_with_trees")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("ocean")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("plains")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("desert")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("extreme_hills")))
					biomeCriteria = true;
				if (Biome.REGISTRY.getNameForObject(biome).equals(new ResourceLocation("river")))
					biomeCriteria = true;
				if (!biomeCriteria)
					continue;
				if (world.isRemote)
					return;
				Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("sturcturemodv", "zeltgruen"));
				if (template == null)
					return;
				Rotation rotation = Rotation.values()[random.nextInt(3)];
				Mirror mirror = Mirror.values()[random.nextInt(2)];
				BlockPos spawnTo = new BlockPos(i, j + 0, k);
				IBlockState iblockstate = world.getBlockState(spawnTo);
				world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
				template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(rotation).setMirror(mirror)
						.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
			}
		}
	}
}
