package me.AlvenxPlay.EQDrop.Utils;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items_Static {
	ItemStack LightGlassSpace() {
		ItemStack Item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 8);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName(" ");
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack DarkGlassSpace() {
		ItemStack Item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName(" ");
		Item.setItemMeta(im);
		return Item;
	}
	ItemStack InfoTorch() {
		ItemStack Item = new ItemStack(Material.REDSTONE_TORCH_ON, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cUstawienia dropu");
		List<String> lore = Arrays.asList("§7-----------------------", "§6     W tym oknie mozesz", 
										"§6zmieniac drop przedmiotow.", "§7-----------------------");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	public ItemStack AdminPanel() {
		ItemStack Item = new ItemStack(Material.PRISMARINE_SHARD, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cUstawienia administratora");
		List<String> lore = Arrays.asList("§7------------------------------", "§6 Ustawienia zaawansowanego dropu", "§7------------------------------");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
	public ItemStack PlayerPanel() {
		ItemStack Item = new ItemStack(Material.PRISMARINE_SHARD, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§cUstawienia gracza");
		List<String> lore = Arrays.asList("§7-------------------------", "§6        Ustawienia dropu", "§7-------------------------");
		im.setLore(lore);
		Item.setItemMeta(im);
		return Item;
	}
}
