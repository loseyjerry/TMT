package me.turkey2349.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners  implements Listener
{
	TMT plugin;
	TMT JoinedPlayers;
	TMT InnocentPlayers;
	TMT TraitorPlayers;
	TMT DeadPlayers;
	
	public Listeners(TMT p)
	{
		plugin = p;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		String name = player.getName();
		
		if(plugin.getConfig().getBoolean("Force Join on Player Join") == true)
		{
		plugin.Jadd(name);
		}
	}
	public void PlayerQuitEvent(org.bukkit.event.player.PlayerQuitEvent event)
	{
		Player player = event.getPlayer();
		String name = player.getName();
		
		plugin.Jremove(name);
	}

	/*public void EntityDamageByEntityEvent(EntityDamageEvent DamageEvent)
	{
		if(DamageEvent.getEntity() instanceof Player)
		{
			String Entity = DamageEvent.getEntity().toString();
			if(JoinedPlayers.Jcontains(Entity)
			{
			    DamageEvent.isCancelled();
			}
		}
	}*/
	
}
//	@EventHandler
//	public void PlayerDeathEvent(org.bukkit.event.entity.PlayerDeathEvent event1)
//	{
//		Player player = event1.getEntity();
//		
//		event1.getEntity().getLocation().getBlock().setType(Material.SIGN_POST);
//		TMT.setLine(0, player);
//		if(InnocentPlayers.Icontains(player))
//		{
//			TMT.setLine(1, "Innocent");
//		}
//		else if(TraitorPlayers.Tcontains(player))
//		{
//			TMT.setLine(1, "Traitor");
//		}
//		
//		DeadPlayers.Dadd(player);
//		TraitorPlayers.Tremove(player);
//		InnocentPlayers.Iremove(player);
//
//		
//	}

