package me.AlvenxPlay.EQDrop;

import java.util.ArrayList;
import java.util.List;

import me.AlvenxPlay.EQDrop.Commands.SetDropCommand;
import me.AlvenxPlay.EQDrop.Listeners.onBlockBreak;
import me.AlvenxPlay.EQDrop.Listeners.onInvClick;
import me.AlvenxPlay.EQDrop.Listeners.onQuit_DB_Reset;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Main instance;
	
	public void onEnable() {
		instance = this;
		saveDefaultConfig();
		
		getCommand("setdrop").setExecutor(new SetDropCommand());
		getServer().getPluginManager().registerEvents(new onQuit_DB_Reset(), this);
		getServer().getPluginManager().registerEvents(new onInvClick(), this);
		getServer().getPluginManager().registerEvents(new onBlockBreak(), this);
	}

	public static List<Player> cobblestone_drop = new ArrayList<Player>();
	public static List<Player> diamond_drop = new ArrayList<Player>();
	public static List<Player> gold_drop = new ArrayList<Player>();
	public static List<Player> emerald_drop = new ArrayList<Player>();
	public static List<Player> quartz_drop = new ArrayList<Player>();
	public static List<Player> iron_drop = new ArrayList<Player>();
	public static List<Player> lapis_drop = new ArrayList<Player>();
	public static List<Player> redstone_drop = new ArrayList<Player>();
	public static List<Player> coal_drop = new ArrayList<Player>();
	
	public static boolean bspecial1 = false;
	public static boolean bspecial2 = false;
	public static boolean bspecial3 = false;
	public static boolean bspecial4 = false;
	public static boolean bspecial5 = false;
	
	public static Main getIns() {
		return instance;
	}
}
