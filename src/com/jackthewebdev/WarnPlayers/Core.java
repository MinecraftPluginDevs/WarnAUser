package com.jackthewebdev.WarnPlayers;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("Enabled");
    }
    @Override
    public void onDisable(){
        getLogger().info("Disable");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("warn")){
            Player p = this.getServer().getPlayer(args[0]);
            StringBuilder builder = new StringBuilder();
            String message;
            for(int i = 1; i < args.length; i++){
                builder.append(" "+args[i]);
            }
            p.sendMessage(ChatColor.RED + "===="+ChatColor.YELLOW+"Warning"+ChatColor.RED+"====");
            p.sendMessage(ChatColor.YELLOW + builder.toString());
            p.sendMessage(ChatColor.RED+"====");
            return true;
        }

        return false;
    }
}
