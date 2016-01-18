package me.AlvenxPlay.EQDrop.Listeners;

import me.AlvenxPlay.EQDrop.Main;
import me.AlvenxPlay.EQDrop.Utils.Items_Static;
import me.AlvenxPlay.EQDrop.Utils.Items_Vars;
import me.AlvenxPlay.EQDrop.Utils.SetDropAdvInventory;
import me.AlvenxPlay.EQDrop.Utils.SetDropInventory;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class onInvClick implements Listener {
	static Items_Static Stat_Item = new Items_Static();
	static Items_Vars Vars_Item = new Items_Vars();
	@EventHandler()
	public static void onClick(InventoryClickEvent e) {
		 if(e.getInventory().getTitle().equals("§cUstawienia dropu.")){
	     	if(e.getCurrentItem() == null){
	            return;
	        }
	        
	    	Player p = (Player) e.getWhoClicked();
	    	e.setCancelled(true);
	    	
	    	
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.CobblestoneDrop(p))){
	        	if(Main.cobblestone_drop.contains(p)){
	        		Main.cobblestone_drop.remove(p);
	        	} else {
	        		Main.cobblestone_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.DiamondDrop(p))){
	        	if(Main.diamond_drop.contains(p)){
	        		Main.diamond_drop.remove(p);
	        	} else {
	        		Main.diamond_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.GoldDrop(p))){
	        	if(Main.gold_drop.contains(p)){
	        		Main.gold_drop.remove(p);
	        	} else {
	        		Main.gold_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.EmeraldDrop(p))){
	        	if(Main.emerald_drop.contains(p)){
	        		Main.emerald_drop.remove(p);
	        	} else {
	        		Main.emerald_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.QuartzDrop(p))){
	        	if(Main.quartz_drop.contains(p)){
	        		Main.quartz_drop.remove(p);
	        	} else {
	        		Main.quartz_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.IronDrop(p))){
	        	if(Main.iron_drop.contains(p)){
	        		Main.iron_drop.remove(p);
	        	} else {
	        		Main.iron_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.LapisDrop(p))){
	        	if(Main.lapis_drop.contains(p)){
	        		Main.lapis_drop.remove(p);
	        	} else {
	        		Main.lapis_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.RedstoneDrop(p))){
	        	if(Main.redstone_drop.contains(p)){
	        		Main.redstone_drop.remove(p);
	        	} else {
	        		Main.redstone_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Vars_Item.CoalDrop(p))){
	        	if(Main.coal_drop.contains(p)){
	        		Main.coal_drop.remove(p);
	        	} else {
	        		Main.coal_drop.add(p);
	        	}
	        	p.openInventory(SetDropInventory.SetDropInv(p));
	        }
	    	//---------------------
	        if(e.getCurrentItem().isSimilar(Stat_Item.AdminPanel())){
	        	if(p.hasPermission("EQDrop.admin") || p.isOp()){
	        		p.openInventory(SetDropAdvInventory.setDropAdvInv());
	        	} else {
	        		p.sendMessage("§8[§6*§8] §cNie posiadasz uprawnien do panelu administratora.");
	        	}
	        }
	    }
		 if(e.getInventory().getTitle().equals("§cUstawienia globalne dropu.")){
	            if(e.getCurrentItem() == null){
	                return;
	            }
	    		Player p = (Player) e.getWhoClicked();
	    		e.setCancelled(true);
	    		
	    		//---------------------
	        	if(e.getCurrentItem().equals(Vars_Item.Special1())){
	        		Main.bspecial1 = !Main.bspecial1;
	        		p.openInventory(SetDropAdvInventory.setDropAdvInv());
	        	}
	        	if(e.getCurrentItem().equals(Vars_Item.Special2())){
	        		Main.bspecial2 = !Main.bspecial2;
	        		p.openInventory(SetDropAdvInventory.setDropAdvInv());
	        	}
	        	if(e.getCurrentItem().equals(Vars_Item.Special3())){
	        		Main.bspecial3 = !Main.bspecial3;
	        		p.openInventory(SetDropAdvInventory.setDropAdvInv());
	        	}
	        	if(e.getCurrentItem().equals(Vars_Item.Special4())){
	        		Main.bspecial4 = !Main.bspecial4;
	        		p.openInventory(SetDropAdvInventory.setDropAdvInv());
	        	}
	        	if(e.getCurrentItem().equals(Vars_Item.Special5())){
	        		Main.bspecial5 = !Main.bspecial5;
	        		p.openInventory(SetDropAdvInventory.setDropAdvInv());
	        	}
	        	if(e.getCurrentItem().equals(Stat_Item.PlayerPanel())){
	        		p.openInventory(SetDropInventory.SetDropInv(p));
	        	}
	        }
	}

}
