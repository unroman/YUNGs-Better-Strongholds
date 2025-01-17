package com.yungnickyoung.minecraft.betterstrongholds.world;

import com.yungnickyoung.minecraft.yungsapi.world.ItemRandomizer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Random;

/**
 * Singleton class holding ItemRandomizers for armor pieces on armor stands.
 * The class is a singleton so that it may be synchronized with the JSON file as a single source of truth.
 * If no JSON exists, this class will be populated with the default values shown below
 * (and a JSON with the default values created)
 */
public class ArmorStandChances {
    /** Singleton stuff **/

    public static ArmorStandChances instance; // This technically shouldn't be public, but it is necessary for loading data from JSON
    public static ArmorStandChances get() {
        if (instance == null) {
            instance = new ArmorStandChances();
        }
        return instance;
    }

    private ArmorStandChances() {
        commonHelmets = new ItemRandomizer(Items.AIR)
            .addItem(Items.CHAINMAIL_HELMET, .3f)
            .addItem(Items.LEATHER_HELMET, .1f)
            .addItem(Items.IRON_HELMET, .3f)
            .addItem(Items.CARVED_PUMPKIN, .01f);

        rareHelmets = new ItemRandomizer(Items.AIR)
            .addItem(Items.DIAMOND_HELMET, .3f)
            .addItem(Items.CARVED_PUMPKIN, .2f);

        commonChestplates = new ItemRandomizer(Items.AIR)
            .addItem(Items.CHAINMAIL_CHESTPLATE, .3f)
            .addItem(Items.LEATHER_CHESTPLATE, .1f)
            .addItem(Items.IRON_CHESTPLATE, .3f);

        rareChestplates = new ItemRandomizer(Items.AIR)
            .addItem(Items.DIAMOND_CHESTPLATE, .3f);

        commonLeggings = new ItemRandomizer(Items.AIR)
            .addItem(Items.CHAINMAIL_LEGGINGS, .3f)
            .addItem(Items.LEATHER_LEGGINGS, .1f)
            .addItem(Items.IRON_LEGGINGS, .3f);

        rareLeggings = new ItemRandomizer(Items.AIR)
            .addItem(Items.DIAMOND_LEGGINGS, .3f);

        commonBoots = new ItemRandomizer(Items.AIR)
            .addItem(Items.CHAINMAIL_BOOTS, .3f)
            .addItem(Items.LEATHER_BOOTS, .1f)
            .addItem(Items.IRON_BOOTS, .3f);

        rareBoots = new ItemRandomizer(Items.AIR)
            .addItem(Items.DIAMOND_BOOTS, .3f);
    }

    /** Instance variables and methods **/

    // Helmets
    private ItemRandomizer commonHelmets;
    private ItemRandomizer rareHelmets;

    // Chestplates
    private ItemRandomizer commonChestplates;
    private ItemRandomizer rareChestplates;

    // Leggings
    private ItemRandomizer commonLeggings;
    private ItemRandomizer rareLeggings;

    // Boots
    private ItemRandomizer commonBoots;
    private ItemRandomizer rareBoots;

    public Item getCommonHelmet(Random random) {
        return commonHelmets.get(random);
    }

    public Item getRareHelmet(Random random) {
         return rareHelmets.get(random);
    }

    public Item getCommonChestplate(Random random) {
        return commonChestplates.get(random);
    }

    public Item getRareChestplate(Random random) {
        return rareChestplates.get(random);
    }

    public Item getCommonLeggings(Random random) {
        return commonLeggings.get(random);
    }

    public Item getRareLeggings(Random random) {
        return rareLeggings.get(random);
    }

    public Item getCommonBoots(Random random) {
        return commonBoots.get(random);
    }

    public Item getRareBoots(Random random) {
        return rareBoots.get(random);
    }
}
