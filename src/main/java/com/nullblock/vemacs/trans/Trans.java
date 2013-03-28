package com.nullblock.vemacs.trans;

import java.util.Locale;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Trans extends JavaPlugin implements Listener {
    public void onDisable() {
    }

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        this.saveDefaultConfig();
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
    	String lang = this.getConfig().getString("lang");
    	Boolean uppercase = this.getConfig().getBoolean("uppercase");
    	Boolean bigben = false;
        String message = event.getMessage();
        
        message = TransUtil.getTranslation(message, lang);
        message.replace("nhttp", "http");
        message.replace("/ ", "/");
        message.replace(" /", "/");
        message.replace("- ", "-");
        message.replace(" -", "-");
        message.replace(" :", ":");
        if( uppercase == true ){
        message = message.toUpperCase(new Locale(lang));
        }
        event.setMessage(message);
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if(cmd.getName().equalsIgnoreCase("trans") && sender.hasPermission("trans.reload")){
    		this.reloadConfig();
    		sender.sendMessage(ChatColor.GREEN + "Trans has been reloaded.");
    		return true;
    	} 
    	return false; 
    }

}
