package de.redstonecloud;

import de.redstonecloud.cloud.plugin.Plugin;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        System.out.println("ExamplePlugin enabled!");
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