package net.endkind.enderfly;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class CommandHandler implements CommandExecutor {

    private final Set<Player> flyingPlayers = new HashSet<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§5EnderFly§8 >>§4 This command can only be executed by a player");
            return true;
        }

        Player player = (Player) sender;

        if (flyingPlayers.contains(player)) {
            player.setAllowFlight(false);
            flyingPlayers.remove(player);
            sender.sendMessage("§5EnderFly§8 >>§2 Flying has been disabled.");
        } else {
            player.setAllowFlight(true);
            flyingPlayers.add(player);
            sender.sendMessage("§5EnderFly§8 >>§6 Flying has been enabled.");
        }

        return true;
    }
}
