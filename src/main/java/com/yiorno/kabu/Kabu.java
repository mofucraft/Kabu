package com.yiorno.kabu;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kabu extends JavaPlugin {

    @Override
    public void onEnable() {
        //saveDefaultConfig();
        //Config config = new Config(this);
        //config.load();

        getLogger().info("カブが起動しました");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("カブが停止しました");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        if(cmd.getName().equalsIgnoreCase("kabu")){

            Player player = (Player)sender;

            if (args.length != 0) {

                if (args[0].equalsIgnoreCase("price")){
                PlayerCommand command = new PlayerCommand();
                command.price(player);
                return true;

                } else if (args[0].equalsIgnoreCase("own")) {

                    PlayerCommand command = new PlayerCommand();
                    command.own(player);
                    return true;

                } else if (args[0].equalsIgnoreCase("buy")) {

                    Integer num = Integer.valueOf(args[1]);
                    PlayerCommand command = new PlayerCommand();
                    command.buy(player, num);
                    return true;

                } else if (args[0].equalsIgnoreCase("sell")){

                    Integer num = Integer.valueOf(args[1]);
                    PlayerCommand command = new PlayerCommand();
                    command.sell(player, num);
                    return true;

                } else if (args[0].equalsIgnoreCase("check")){

                    PlayerCommand command = new PlayerCommand();
                    command.check(player);
                    return true;

                }

            }
        }

        return false;
    }
}
