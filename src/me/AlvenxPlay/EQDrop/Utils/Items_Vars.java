package me.AlvenxPlay.EQDrop.Utils;

import java.util.Arrays;
import java.util.List;

import me.AlvenxPlay.EQDrop.Main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items_Vars {
	List<String> loreon = Arrays.asList("§7---------------------", "§6          Drop: §aON", "§7---------------------");
	List<String> loreoff = Arrays.asList("§7---------------------", "§6         Drop: §cOFF", "§7---------------------");
	//---------
	public ItemStack CobblestoneDrop(Player p) {
		ItemStack Item = new ItemStack(Material.COBBLESTONE, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Cobblestone");
		if(Main.cobblestone_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack DiamondDrop(Player p) {
		ItemStack Item = new ItemStack(Material.DIAMOND_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Diamentu");
		if(Main.diamond_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack GoldDrop(Player p) {
		ItemStack Item = new ItemStack(Material.GOLD_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Zlota");
		if(Main.gold_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack EmeraldDrop(Player p) {
		ItemStack Item = new ItemStack(Material.EMERALD_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Szmaragdu");
		if(Main.emerald_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack QuartzDrop(Player p) {
		ItemStack Item = new ItemStack(Material.QUARTZ_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Kwarcu");
		if(Main.quartz_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack IronDrop(Player p) {
		ItemStack Item = new ItemStack(Material.IRON_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Zelaza");
		if(Main.iron_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack LapisDrop(Player p) {
		ItemStack Item = new ItemStack(Material.LAPIS_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Lapisu");
		if(Main.lapis_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack RedstoneDrop(Player p) {
		ItemStack Item = new ItemStack(Material.REDSTONE_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok RedStone");
		if(Main.redstone_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack CoalDrop(Player p) {
		ItemStack Item = new ItemStack(Material.COAL_BLOCK, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Blok Wegla");
		if(Main.coal_drop.contains(p)){
			im.setLore(loreoff);
		} else {
			im.setLore(loreon);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack Special1() {
		ItemStack Item = new ItemStack(Material.DRAGON_EGG, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9ENDER BOOST");
		if(Main.bspecial1){
			im.setLore(loreon);
		} else {
			im.setLore(loreoff);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack Special2() {
		ItemStack Item = new ItemStack(Material.GOLD_NUGGET, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Money BOOST");
		if(Main.bspecial2){
			im.setLore(loreon);
		} else {
			im.setLore(loreoff);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack Special3() {
		ItemStack Item = new ItemStack(Material.HOPPER, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Items BOOST");
		if(Main.bspecial3){
			im.setLore(loreon);
		} else {
			im.setLore(loreoff);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack Special4() {
		ItemStack Item = new ItemStack(Material.POTION, 1, (short) 16422);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Potion DROP");
		if(Main.bspecial4){
			im.setLore(loreon);
		} else {
			im.setLore(loreoff);	
		}
		Item.setItemMeta(im);
		return Item;
	}
	//---------
	public ItemStack Special5() {
		ItemStack Item = new ItemStack(Material.COBBLESTONE, 1, (short) 0);
		ItemMeta im = Item.getItemMeta();
		im.setDisplayName("§9Cobble BOOST");
		if(Main.bspecial5){
			im.setLore(loreon);
		} else {
			im.setLore(loreoff);	
		}
		Item.setItemMeta(im);
		return Item;
	}
}
