package de.redstonecloud;

import de.redstonecloud.cloud.events.defaults.ServerStartEvent;
import de.redstonecloud.cloud.plugin.Plugin;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        System.out.println("ExamplePlugin enabled!");

        getCloud().getEventManager().subscribe(ServerStartEvent.class, (e) -> {
            System.out.println("Server started: " + e.getServerName());
        });
    }

    @Override
    public void onLoad() {
        System.out.println("ExamplePlugin loaded!");
    }

    @Override
    public void onDisable() {
        System.out.println("ExamplePlugin disabled!");
    }
}