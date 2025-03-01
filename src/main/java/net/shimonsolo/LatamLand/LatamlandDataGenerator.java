package net.shimonsolo.LatamLand;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.shimonsolo.LatamLand.datagen.DatagenBlockTagProvider;
import net.shimonsolo.LatamLand.datagen.DatagenLootTableProvider;
import net.shimonsolo.LatamLand.datagen.DatagenModelProvider;

public class LatamlandDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(DatagenBlockTagProvider::new);
        pack.addProvider(DatagenLootTableProvider::new);
        pack.addProvider(DatagenModelProvider::new);
    }
}
