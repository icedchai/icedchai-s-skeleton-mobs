package me.icedchai.skeletonmobs.common.item;

import me.icedchai.skeletonmobs.common.Init;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public  static final Item SKNIGHT_SPAWN_EGG = new SpawnEggItem(Init.SKNIGHT, 12698049, 4802870, (new FabricItemSettings()).group(Init.MAIN_ITEM_GROUP));
    public  static final Item WARCHER_SPAWN_EGG = new SpawnEggItem(Init.WARCHER, 1315860, 4672810, (new FabricItemSettings()).group(Init.MAIN_ITEM_GROUP));
    public static final  Item STKNIGHT_SPAWN_EGG = new SpawnEggItem(Init.STKNIGHT,6387319, 14543540, (new Item.Settings()).group(Init.MAIN_ITEM_GROUP));
    public static void register(){
        Registry.register(Registry.ITEM, new Identifier(Init.MODID, "skeleton_knight_spawn_egg"), ModItems.SKNIGHT_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Init.MODID, "stray_knight_spawn_egg"), ModItems.STKNIGHT_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(Init.MODID, "wither_archer_spawn_egg"), ModItems.WARCHER_SPAWN_EGG);
    }
}
