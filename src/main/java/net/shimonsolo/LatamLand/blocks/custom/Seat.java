package net.shimonsolo.LatamLand.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class Seat extends HorizontalFacingBlock {

    public Seat(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(Properties.HORIZONTAL_FACING);
        VoxelShape base1 = VoxelShapes.cuboid(0.09, 0f, 0.09, 1.0, 0.5, 1.0);
        VoxelShape backrest;

        switch (dir) {
            case NORTH:
                backrest = VoxelShapes.cuboid(0f, 0.5f, 0.8f, 0.99f, 1.5f, 1f); // Respaldo hacia el norte
                break;
            case SOUTH:
                backrest = VoxelShapes.cuboid(0.0f, 0.4f, 0.3, 0f, 1.0f, 1.0f); // Respaldo hacia el sur
                break;
            case EAST:
                backrest = VoxelShapes.cuboid(0.3f, 0.4f, 0.0f, 1.0f, 1.0f, 0.3f); // Respaldo hacia el este
                break;
            case WEST:
                backrest = VoxelShapes.cuboid(0.0f, 0.4f, 0.0f, 0.3f, 1.0f, 1.0f); // Respaldo hacia el oeste
                break;
            default:
                return VoxelShapes.fullCube();
        }

        // Combina la base y el respaldo
        return VoxelShapes.union(base1, backrest);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

}