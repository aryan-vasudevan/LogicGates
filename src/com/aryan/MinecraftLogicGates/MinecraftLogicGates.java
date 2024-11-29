package com.aryan.MinecraftLogicGates;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftLogicGates extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[minecraftLogicGates]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[minecraftLogicGates]: Plugin is disabled!");
    }
}
