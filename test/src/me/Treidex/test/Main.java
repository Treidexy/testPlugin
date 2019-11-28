package me.Treidex.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	 // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	Player p = (Player) sender;
    	if ( sender instanceof Player) {
//    		/home
	    	if (command.getName().equalsIgnoreCase("home")) {
	    		sender.sendMessage("Bringing you home...");
	    		p.performCommand("trigger home");
	    		return true;
	    	}
//	    	/spectator
	    	if (command.getName().equalsIgnoreCase("spectator")) {
	    		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode spectator " + sender.getName());
	    		return true;
	    	}
//	    	/sethome
	    	if (command.getName().equalsIgnoreCase("sethome")) {
	    		Bukkit.getServer().dispatchCommand(p, "trigger sethome");
	    		return true;
	    	}
//	    	/back
	    	if (command.getName().equalsIgnoreCase("home")) {
	    		Bukkit.getServer().dispatchCommand(p, "trigger back");
	    		return true;
	    	}
//	    	/afk
	    	if (command.getName().equalsIgnoreCase("afk")) {
	    		sender.sendMessage("You are now AFK");
	    		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "team join hc_afk " + sender.getName());
	    		return true;
	    	}
//	    	/survival
	    	if (command.getName().equalsIgnoreCase("survival")) {
	    		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode survival " + sender.getName());
	    		return true;
	    	}
//	    	/die
	    	if (command.getName().equalsIgnoreCase("die")) {
	    		sender.sendMessage(ChatColor.DARK_RED + "You stab your chest");
	    		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "kill " + sender.getName());
	    		return true;
	    	}
    	}
        return true;
    }

}
