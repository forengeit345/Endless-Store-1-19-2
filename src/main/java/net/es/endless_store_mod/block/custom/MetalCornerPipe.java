package net.es.endless_store_mod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class MetalCornerPipe extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public MetalCornerPipe(Settings settings) {
        super(settings);
    }

    private static VoxelShape SHAPE_N = VoxelShapes.union(
            Block.createCuboidShape(4.5, 4, 11.5, 11.5, 11, 16),
            Block.createCuboidShape(0, 4, 4.5, 11.5, 11, 11.5)
    );
    private static VoxelShape SHAPE_E = VoxelShapes.union(
            Block.createCuboidShape(0, 4, 4.5, 4.5, 11, 11.5),
            Block.createCuboidShape(4.5, 4, 0, 11.5, 11, 11.5)
    );
    private static VoxelShape SHAPE_S = VoxelShapes.union(
            Block.createCuboidShape(4.5, 4, 0, 11.5, 11, 4.5),
            Block.createCuboidShape(4.5, 4, 4.5, 16, 11, 11.5)
    );
    private static VoxelShape SHAPE_W = VoxelShapes.union(
            Block.createCuboidShape(11.5, 4, 4.5, 16, 11, 11.5),
            Block.createCuboidShape(4.5, 4, 4.5, 11.5, 11, 16)
    );
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> SHAPE_N;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            case EAST -> SHAPE_E;
            default -> SHAPE_N;
        };
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}