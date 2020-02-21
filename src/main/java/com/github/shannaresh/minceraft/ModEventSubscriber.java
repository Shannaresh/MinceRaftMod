package com.github.shannaresh.minceraft;

import com.github.shannaresh.minceraft.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = MinceRaft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber
{
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                setup(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "example_ore")
        );
    }

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_item")
        );
    }

    // This method was copy-pasted verbatim under direction from https://cadiboo.github.io/tutorials/1.15.1/forge/1.5-first-item/
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name)
    {
        return setup(entry, new ResourceLocation(MinceRaft.MODID, name));
    }

    // This method was copy-pasted verbatim under direction from https://cadiboo.github.io/tutorials/1.15.1/forge/1.5-first-item/
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName)
    {
        entry.setRegistryName(registryName);
        return entry;
    }

}
