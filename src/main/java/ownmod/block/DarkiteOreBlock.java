
package ownmod.block;

import ownmod.init.OwnModModItems;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.Collections;

public class DarkiteOreBlock extends Block {
	public DarkiteOreBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.sculk.break")),
						() -> new SoundEvent(new ResourceLocation("block.nether_ore.step")),
						() -> new SoundEvent(new ResourceLocation("block.amethyst_block.place")),
						() -> new SoundEvent(new ResourceLocation("block.anvil.hit")),
						() -> new SoundEvent(new ResourceLocation("block.slime_block.fall"))))
				.strength(1.25f, 12f).lightLevel(s -> 1).friction(0.4f).speedFactor(0.8f).jumpFactor(0.9f).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0f, 0.4f, 0.4f};
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 2;
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 3;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.BLOCK;
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(OwnModModItems.DARKITE.get()));
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 2; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.2D * 20;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.2D;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.2D * 20;
			world.addParticle(ParticleTypes.WITCH, x0, y0, z0, 0, 0, 0);
		}
	}
}
