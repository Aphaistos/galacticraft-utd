package fr.aphaistos.galacticraft.items;

import fr.aphaistos.galacticraft.util.EnumSortCategoryItem;

public interface ISortableItem {
    EnumSortCategoryItem getCategory(int meta);
}