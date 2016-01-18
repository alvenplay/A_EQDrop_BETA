package me.AlvenxPlay.EQDrop.Commands;

import me.AlvenxPlay.EQDrop.Utils.SetDropInventory;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetDropCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lab, String[] args) {
		Player p = (Player) s;
		p.openInventory(SetDropInventory.SetDropInv(p));
		return true;
	}

}
