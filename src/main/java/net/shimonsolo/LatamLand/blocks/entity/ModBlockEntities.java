package net.shimonsolo.LatamLand.blocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shimonsolo.LatamLand.Latamland;
import net.shimonsolo.LatamLand.blocks.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<AnimatedBlockEntity> ANIMATED_BLOCK_ENTITY;

    public static void registerAllBlockEntities() {
        ANIMATED_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(Latamland.MODID, "animated_block_entity"),
                FabricBlockEntityTypeBuilder.create(AnimatedBlockEntity::new,
                        ModBlocks.ANIMATED_BLOCK).build());
    }
}
