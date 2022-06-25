package fr.aphaistos.galacticraft.items;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface IClickableItem {
	ItemStack onItemRightClick(ItemStack itemStack, Level level, Player player);
}