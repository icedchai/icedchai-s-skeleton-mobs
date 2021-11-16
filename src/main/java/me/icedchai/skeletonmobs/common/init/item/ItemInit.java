package me.icedchai.skeletonmobs.common.init.item;

import me.icedchai.skeletonmobs.common.init.entity.EntityInit;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.icedchai.skeletonmobs.IcedchaisSkeletons.MODID;


public class ItemInit {
    public static final ItemGroup MAIN_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "skeleton_spawn_eggs"), () -> new ItemStack(Items.BONE));

    public static final Item SKNIGHT_SPAWN_EGG = new SpawnEggItem(EntityInit.SKNIGHT, 12698049, 4802870, (new FabricItemSettings()).group(MAIN_ITEM_GROUP));
    public static final Item WARCHER_SPAWN_EGG = new SpawnEggItem(EntityInit.WARCHER, 1315860, 4672810, (new FabricItemSettings()).group(MAIN_ITEM_GROUP));
    public static final Item STKNIGHT_SPAWN_EGG = new SpawnEggItem(EntityInit.STKNIGHT, 6387319, 14543540, (new Item.Settings()).group(MAIN_ITEM_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "skeleton_knight_spawn_egg"), ItemInit.SKNIGHT_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MODID, "stray_knight_spawn_egg"), ItemInit.STKNIGHT_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(MODID, "wither_archer_spawn_egg"), ItemInit.WARCHER_SPAWN_EGG);
    }
}
