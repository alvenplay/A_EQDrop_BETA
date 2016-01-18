package me.AlvenxPlay.EQDrop.Listeners;

import java.util.Collection;

import me.AlvenxPlay.EQDrop.Utils.Calc_Unbreaking;
import me.AlvenxPlay.EQDrop.Utils.isMultiResolver;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class onBlockBreak implements Listener {
	@EventHandler()
	public void onBreak(BlockBreakEvent e) {
		Player p = (Player) e.getPlayer();
		if(p.getGameMode().equals(GameMode.SURVIVAL)) {
			Material mat = e.getBlock().getType();
			ItemStack in = p.getItemInHand();
			boolean silk = in.containsEnchantment(Enchantment.SILK_TOUCH);
			boolean dura = in.containsEnchantment(Enchantment.DURABILITY);
			boolean fort = in.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS);
			int damage = 1;

			if(dura) {
				damage = Calc_Unbreaking.Calc(in.getEnchantmentLevel(Enchantment.DURABILITY));
			}
			//-----------------------------------------------
			if(mat == Material.STONE) {
				
			}
			//---------------
			else if(mat == Material.DIAMOND_ORE || mat == Material.GOLD_ORE || mat == Material.EMERALD_ORE || mat == Material.QUARTZ_ORE || mat == Material.IRON_ORE 
					   || mat == Material.LAPIS_ORE || mat == Material.GLOWING_REDSTONE_ORE || mat == Material.COAL_ORE) {}
			//---------------
			else if(mat == Material.PISTON_MOVING_PIECE || mat == Material.PISTON_EXTENSION) {
				Location l = isMultiResolver.getPiston(e.getBlock().getLocation());
				p.getInventory().addItem(new ItemStack(l.getBlock().getType(), 1));
				l.getBlock().setType(Material.AIR);
			}
			//---------------
			else if(mat == Material.IRON_DOOR_BLOCK || mat == Material.WOODEN_DOOR) {
			}
			//---------------
			else {
				Collection<ItemStack> IS = e.getBlock().getDrops(in);
				for(ItemStack i : IS)
					p.getInventory().addItem(i);
			}
			//-----------------------------------------------
			in.setDurability((short) (in.getDurability() + damage));
			p.giveExp(e.getExpToDrop());
			e.setCancelled(true);
			e.getBlock().setType(Material.AIR);
		}
	}
}
