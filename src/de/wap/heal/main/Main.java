package de.wap.heal.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.wap.heal.commands.HealCommand;

public class Main extends JavaPlugin {

	public void onEnable() {
		
		System.out.println("[Heal] Das Plugin Heal wurde erfolgreich aktiviert");
		System.out.println("[Heal] Version: 1.0.0");
		System.out.println("[Heal] Entwickler: DoktorPrank");
		System.out.println("[Heal] Bei Problemen: https://discord.gg/rgMwKAU");
		System.out.println("[Heal] Dieses Plugin ist mein erstes Plugin was ich veroeffentlicht habe.");
		System.out.println("[Heal] Viel Spaﬂ");
		
		getCommand("heal").setExecutor(new HealCommand());		
		
	}
	
}
