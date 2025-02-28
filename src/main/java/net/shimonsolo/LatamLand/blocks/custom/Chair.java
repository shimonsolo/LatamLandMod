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

public class Chair extends HorizontalFacingBlock {

    public Chair(Settings settings) {
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
        VoxelShape base = VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.4, 1.0); // Base de la silla
        VoxelShape backrest;

        switch (dir) {
            case NORTH:
                backrest = VoxelShapes.cuboid(0.7, 0.4, 0.0, 1.0, 1.0, 0.7); // Respaldo hacia el norte
                break;
            case SOUTH:
                backrest = VoxelShapes.cuboid(0.0, 0.4, 0.3, 0.3, 1.0, 1.0); // Respaldo hacia el sur
                break;
            case EAST:
                backrest = VoxelShapes.cuboid(0.3, 0.4, 0.0, 1.0, 1.0, 0.3); // Respaldo hacia el este
                break;
            case WEST:
                backrest = VoxelShapes.cuboid(0.0, 0.4, 0.0, 0.3, 1.0, 1.0); // Respaldo hacia el oeste
                break;
            default:
                return VoxelShapes.fullCube();
        }

        // Combina la base y el respaldo
        return VoxelShapes.union(base, backrest);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

}