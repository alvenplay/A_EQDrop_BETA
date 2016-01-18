package me.AlvenxPlay.EQDrop.Listeners;

import me.AlvenxPlay.EQDrop.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onQuit_DB_Reset implements Listener{
	@EventHandler()
	public void onQuit(PlayerQuitEvent e) {
		Player p = (Player) e.getPlayer();
		
		Main.cobblestone_drop.remove(p);
		Main.diamond_drop.remove(p);
		Main.gold_drop.remove(p);
		Main.emerald_drop.remove(p);
		Main.quartz_drop.remove(p);
		Main.iron_drop.remove(p);
		Main.lapis_drop.remove(p);
		Main.redstone_drop.remove(p);
		Main.coal_drop.remove(p);	
	}
}
