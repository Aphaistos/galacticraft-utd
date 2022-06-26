package fr.aphaistos.galacticraft.util;

import java.util.Collections;
import java.util.Comparator;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CreativeTabGC extends CreativeModeTab {
	
    private ItemStack itemForTab;
    private Comparator<ItemStack> tabSorter;
	
	public CreativeTabGC(int index, String name, ItemStack itemForTab, Comparator<ItemStack> tabSorter) {
		super(index, name);
        this.itemForTab = itemForTab;
        this.tabSorter = tabSorter;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack makeIcon() {
		return this.itemForTab;
	}
	
    public void setItemForTab(ItemStack itemForTab) {
        this.itemForTab = itemForTab;
    }
    
    @Override
    public void fillItemList(NonNullList<ItemStack> list) {
    	super.fillItemList(list);
        if (this.tabSorter != null) {
            try {
                Collections.sort(list, tabSorter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void setTabSorter(Comparator<ItemStack> tabSorter) {
        this.tabSorter = tabSorter;
    }
	
}