package de.wap.heal.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if(p.hasPermission("heal.use")) {
				if(args.length == 0) {
					p.setHealth(20);
					p.setFoodLevel(20);
					p.sendMessage("§aDu wurdest geheilt!");
				} else if(args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null) {
						target.setHealth(20);
						target.setFoodLevel(20);
						target.sendMessage("§aDu wurdest von " + sender.getName() + "§a geheilt!");
						p.sendMessage("§aDu hast " + target.getName() + " §ageheilt!");
					} else 
						p.sendMessage("§cDer Spieler " + args[0] + " §cwurde nicht gefunden!");
				} else 
					p.sendMessage("§cSyntax: /heal [Player]");
					
			} else
				p.sendMessage("§cDu hast kein Recht!");
		} else 
		   sender.sendMessage("Die Console kann sich schlecht Heilen, oder?");
		return false;
	}
	
}
