/*
 * Author: 598Johnn897
 * 
 * Date: Jan 8, 2015
 * Package: org.teammoose.lobby
 */
package org.teammoose.lobby;

import org.bukkit.plugin.java.JavaPlugin;

import com.samczsun.serverpinger.ServerPinger;
import com.samczsun.serverpinger.StatusResponse;

/**
 * 
 * @author 598Johnn897
 * @since
 */
public class TMLobbyMain extends JavaPlugin
{
	@Override public void onLoad()
	{
		
	}
	
	@Override public void onEnable()
	{
		StatusResponse resp = ServerPinger.POST_NETTY_REWRITE.fetchData("localhost", 25565);
		int online = resp.players.online;
	}
	
	@Override public void onDisable()
	{
		
	}
}
