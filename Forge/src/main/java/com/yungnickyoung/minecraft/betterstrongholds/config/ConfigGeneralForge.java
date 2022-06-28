package com.yungnickyoung.minecraft.betterstrongholds.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigGeneralForge {
    public final ForgeConfigSpec.ConfigValue<Double> cobwebReplacementChanceNormal;
    public final ForgeConfigSpec.ConfigValue<Double> cobwebReplacementChanceSpawner;
    public final ForgeConfigSpec.ConfigValue<Double> torchSpawnRate;
    public final ForgeConfigSpec.ConfigValue<Double> lanternSpawnRate;

    public ConfigGeneralForge(final ForgeConfigSpec.Builder BUILDER) {
        BUILDER
                .comment(
                        """
                                ##########################################################################################################
                                # General settings.
                                ##########################################################################################################""")
                .push("General");

        cobwebReplacementChanceNormal = BUILDER
                .comment(
                        " The rate at which cobwebs will spawn in various parts of the stronghold.\n" +
                        " Default: 0.1")
                .worldRestart()
                .define("Cobweb Spawn Rate (NORMAL)", 0.1);

        cobwebReplacementChanceSpawner = BUILDER
                .comment(
                        " The rate at which cobwebs will spawn around spider spawners in libraries.\n" +
                        " Default: 0.3")
                .worldRestart()
                .define("Cobweb Spawn Rate (SPAWNER)", 0.3);

        torchSpawnRate = BUILDER
                .comment(
                        " The rate at which torches spawn throughout the stronghold.\n" +
                        " Default: 0.1")
                .worldRestart()
                .define("Torch Spawn Rate", 0.1);

        lanternSpawnRate = BUILDER
                .comment(
                        " The rate at which lanterns spawn throughout the stronghold.\n" +
                        " Default: 0.2")
                .worldRestart()
                .define("Lantern Spawn Rate", 0.2);

        BUILDER.pop();
    }
}
