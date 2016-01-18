package me.AlvenxPlay.EQDrop.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SetDropInventory {
	public static Inventory SetDropInv(Player p) {
		Items_Static Stat_Item = new Items_Static();
		Items_Vars Vars_Item = new Items_Vars();
		Inventory SetDropInv = Bukkit.createInventory(null, 9*6, "§cUstawienia dropu.");
		{
			for(int i = 0; i<=8; i++)
				SetDropInv.setItem(i, Stat_Item.LightGlassSpace());
			//---------------------
			SetDropInv.setItem(9, Vars_Item.CobblestoneDrop(p));
			SetDropInv.setItem(10, Vars_Item.DiamondDrop(p));
			SetDropInv.setItem(11, Vars_Item.GoldDrop(p));
			SetDropInv.setItem(12, Vars_Item.EmeraldDrop(p));
			SetDropInv.setItem(13, Vars_Item.QuartzDrop(p));
			SetDropInv.setItem(14, Vars_Item.IronDrop(p));
			SetDropInv.setItem(15, Vars_Item.LapisDrop(p));
			SetDropInv.setItem(16, Vars_Item.RedstoneDrop(p));
			SetDropInv.setItem(17, Vars_Item.CoalDrop(p));
			//---------------------
			SetDropInv.setItem(18, Stat_Item.LightGlassSpace());
			SetDropInv.setItem(19, Stat_Item.LightGlassSpace());
			SetDropInv.setItem(20, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(21, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(22, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(23, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(24, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(25, Stat_Item.LightGlassSpace());
			SetDropInv.setItem(26, Stat_Item.LightGlassSpace());
			//---------------------
			SetDropInv.setItem(27, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(28, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(29, Vars_Item.Special1());
			SetDropInv.setItem(30, Vars_Item.Special2());
			SetDropInv.setItem(31, Vars_Item.Special3());
			SetDropInv.setItem(32, Vars_Item.Special4());
			SetDropInv.setItem(33, Vars_Item.Special5());
			SetDropInv.setItem(34, Stat_Item.DarkGlassSpace());
			SetDropInv.setItem(35, Stat_Item.DarkGlassSpace());
			//---------------------
			for(int i = 36; i<=44; i++)
				SetDropInv.setItem(i, Stat_Item.DarkGlassSpace());
			//---------------------
			//SetDropInv.setItem(45, Item.);
			//SetDropInv.setItem(46, Item.);
			//SetDropInv.setItem(47, Item.);
			SetDropInv.setItem(48, Stat_Item.AdminPanel());
			SetDropInv.setItem(49, Stat_Item.InfoTorch());
			SetDropInv.setItem(50, Stat_Item.AdminPanel());
			//SetDropInv.setItem(51, Item.);
			//SetDropInv.setItem(52, Item.);
			//SetDropInv.setItem(53, Item.);
		}
		return SetDropInv;
	}
}
