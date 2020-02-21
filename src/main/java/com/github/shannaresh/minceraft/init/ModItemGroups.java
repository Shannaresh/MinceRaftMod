package com.github.shannaresh.minceraft.init;

import com.github.shannaresh.minceraft.MinceRaft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups
{
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(MinceRaft.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM));

    public static class ModItemGroup extends ItemGroup
    {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon()
        {
            return iconSupplier.get();
        }
    }
}
