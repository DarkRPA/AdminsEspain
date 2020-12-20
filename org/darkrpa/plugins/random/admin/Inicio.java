package org.darkrpa.plugins.random.admin;

import org.bukkit.plugin.java.JavaPlugin;

public class Inicio extends JavaPlugin {
    @Override
    public void onEnable(){
        this.getCommand("adminleave").setExecutor(new AdminLeave());
        this.getCommand("adminjoin").setExecutor(new AdminJoin());
    }
}
