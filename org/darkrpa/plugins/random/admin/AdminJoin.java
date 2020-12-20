package org.darkrpa.plugins.random.admin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminJoin implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
        if(arg0 instanceof Player && ((Player)arg0).hasPermission("adminjoin")){
            Player jugador = (Player)arg0;
            for(Player juga : Bukkit.getOnlinePlayers()){
                juga.showPlayer(Bukkit.getPluginManager().getPlugin("AdminsEspain"), jugador);
            }
            Bukkit.broadcastMessage(ChatColor.YELLOW+arg0.getName()+" has joined the game");
            jugador.setGameMode(GameMode.SURVIVAL);
            jugador.sendMessage(ChatColor.BLUE+"Ahora estas visible!");
        }else{
            Bukkit.getLogger().warning("No puedes usar esto en la consola");
            return false;
        }
        return true;
    }
    
}
