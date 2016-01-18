package me.AlvenxPlay.EQDrop.Utils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class SetDropAdvInventory {
	public static Inventory setDropAdvInv() {
		Items_Static Stat_Item = new Items_Static();
		Items_Vars Vars_Item = new Items_Vars();
		
		Inventory SpecGUI = Bukkit.createInventory(null, 9*4, "§cUstawienia globalne dropu.");
		{
			for(int i = 0; i<=26; i++)
				SpecGUI.setItem(i, Stat_Item.DarkGlassSpace());
			//---------------------
			SpecGUI.setItem(11, Vars_Item.Special1());
			SpecGUI.setItem(12, Vars_Item.Special2());
			SpecGUI.setItem(13, Vars_Item.Special3());
			SpecGUI.setItem(14, Vars_Item.Special4());
			SpecGUI.setItem(15, Vars_Item.Special5());
			//---------------------
			//SpecGUI.setItem(27, Item.);
			//SpecGUI.setItem(28, Item.);
			//SpecGUI.setItem(29, Item.);
			SpecGUI.setItem(30, Stat_Item.PlayerPanel());
			SpecGUI.setItem(31, Stat_Item.InfoTorch());
			SpecGUI.setItem(32, Stat_Item.PlayerPanel());
			//SpecGUI.setItem(33, Item.);
			//SpecGUI.setItem(34, Item.);
			//SpecGUI.setItem(35, Item.);
		}
		return SpecGUI;
	}
}
