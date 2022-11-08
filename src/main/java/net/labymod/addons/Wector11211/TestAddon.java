package net.labymod.addons.Wector11211;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.settings.elements.StringElement;
import net.labymod.utils.Consumer;
import net.labymod.utils.Material;
import net.labymod.addons.Wector11211.Settings.CustomStringElement;

import java.util.List;

public class TestAddon extends LabyModAddon {

    @Override
    public void onEnable() {  }
    @Override
    public void loadConfig() { }

    @Override
    protected void fillSettings(List<SettingsElement> options) {

        StringElement stringElement = new StringElement("Default string", new ControlElement.IconData(Material.PAPER), "", new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });

        CustomStringElement customStringElement = new CustomStringElement("Uncolored string", new ControlElement.IconData(Material.PAPER), "", new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });

        options.add( stringElement );
        options.add( customStringElement );
    }
}
