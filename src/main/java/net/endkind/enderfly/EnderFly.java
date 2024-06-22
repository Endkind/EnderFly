package net.endkind.enderfly;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnderFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabling EnderFly");
        if (getCommand("enderfly") != null) {
            getCommand("enderfly").setExecutor(new CommandHandler());
        } else {
            getLogger().severe("Command 'enderfly' could not be found!");
        }
        getLogger().info("EnderFly is enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabling EnderFly");
        getLogger().info("EnderFly is disabled");
    }
}
