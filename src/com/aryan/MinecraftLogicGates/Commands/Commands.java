package com.aryan.MinecraftLogicGates.Commands;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.world.World;
import com.sk89q.worldedit.bukkit.selections.Selection;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.schematic.SchematicFormat;
import com.sk89q.worldedit.world.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class SpawnCommand implements CommandExecutor {

    private final WorldEditPlugin worldEdit;

    public SpawnCommand(WorldEditPlugin worldEdit) {
        this.worldEdit = worldEdit;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            File schematicFile = new File(worldEdit.getPlugin().getDataFolder() + "/schematics/spawn.schematic");

            if (!schematicFile.exists()) {
                player.sendMessage(ChatColor.RED + "Schematic not found!");
                return false;
            }

            try {
                // Load the schematic
                com.sk89q.worldedit.schematic.Schematic schematic = SchematicFormat.MCEDIT.load(schematicFile);
                World world = BukkitAdapter.adapt(player.getWorld());

                // Get the player's position
                BlockVector3 playerPos = BlockVector3.at(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ());
                Selection selection = worldEdit.getSelection(player);

                // Paste the schematic in front of the player
                schematic.paste(world, playerPos, true);

                player.sendMessage(ChatColor.GREEN + "Schematic pasted in front of you!");
                return true;

            } catch (IOException e) {
                e.printStackTrace();
                player.sendMessage(ChatColor.RED + "Error loading the schematic.");
                return false;
            }
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
            return false;
        }
    }
}
