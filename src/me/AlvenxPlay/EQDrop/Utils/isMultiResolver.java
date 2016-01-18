package me.AlvenxPlay.EQDrop.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class isMultiResolver {
	public static Location getPiston(Location l) {
		Location returnV = checkForPiston(l, Material.PISTON_BASE);
		if(returnV == null) {
			returnV = checkForPiston(l, Material.PISTON_STICKY_BASE);
			return returnV;
		} else {
			return returnV;
		}
    }
	
	
	
	
	
	
	
	
	public static Location checkForMaterial(Location l, Material mat) {
        Location returnV = null;
        List<Location> locs = new ArrayList<Location>();
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY(), l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY(), l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY(), l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY(), l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY(), l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY(), l.getZ() -1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY(), l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY(), l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() + 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() + 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() + 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() + 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() + 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() + 1, l.getZ() -1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() + 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() + 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() - 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() - 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() - 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() - 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() - 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() - 1, l.getZ() -1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() - 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() - 1, l.getZ() + 1));
        for(Location ll : locs) {
            Block b = ll.getBlock();
            if(b.getType() == mat) {
                returnV = ll;
                break;
            }
        }
        return returnV;
    }
	public static Location checkForPiston(Location l, Material mat) {
        Location returnV = null;
        List<Location> locs = new ArrayList<Location>();
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY(), l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY(), l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY(), l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY(), l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY(), l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY(), l.getZ() -1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY(), l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY(), l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() + 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() + 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() + 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() + 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() + 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() + 1, l.getZ() -1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() + 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() + 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() - 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() - 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() - 1, l.getZ() + 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() - 1, l.getZ()));
        locs.add(new Location(l.getWorld(), l.getX(), l.getY() - 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() - 1, l.getZ() -1));
        locs.add(new Location(l.getWorld(), l.getX() + 1, l.getY() - 1, l.getZ() - 1));
        locs.add(new Location(l.getWorld(), l.getX() - 1, l.getY() - 1, l.getZ() + 1));
        for(Location ll : locs) {
            if(ll.getBlock().isBlockPowered()) {
                returnV = ll;
                break;
            }
        }
        return returnV;
    }
}
