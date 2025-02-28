package net.shimonsolo.LatamLand.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class Table extends Block {
    // Definimos las dos hitboxes
    private static final VoxelShape HITBOX1 = VoxelShapes.cuboid(0f, 0.87f, 0.0f, 1f, 1f, 1f);
    private static final VoxelShape HITBOX2 = VoxelShapes.cuboid(0.131f, 0f, 0.131f, 0.87f, 0.87f, 0.87f);


    public Table(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        // Combinamos las dos hitboxes
        return VoxelShapes.union(HITBOX1, HITBOX2);
    }
}
