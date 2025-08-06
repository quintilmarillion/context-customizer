package com.custommenu;

import com.google.inject.Provides;

import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.MenuEntry;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.config.ConfigManager;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@PluginDescriptor(
        name = "Custom Menu Text",
        description = "Rename common right-click menu options like Dismiss, Attack, Walk here, etc.",
        tags = {"menu", "custom", "right-click"}
)
public class CustomMenuPlugin extends Plugin
{
    @Inject
    private CustomMenuConfig config;

    @Provides
    CustomMenuConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(CustomMenuConfig.class);
    }

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event)
    {
        MenuEntry entry = event.getMenuEntry();
        String option = entry.getOption().toLowerCase();

        Map<String, String> replacements = new HashMap<>();
        replacements.put("dismiss", config.dismissText());
        replacements.put("attack", config.attackText());
        replacements.put("walk here", config.walkHereText());
        replacements.put("talk-to", config.talkToText());
        replacements.put("use", config.useText());
        replacements.put("open", config.openText());
        replacements.put("pick-up", config.pickUpText());
        replacements.put("take", config.takeText());
        replacements.put("eat", config.eatText());
        replacements.put("drink", config.drinkText());
        replacements.put("chop down", config.chopDownText());
        replacements.put("wield", config.wieldText());
        replacements.put("wear", config.wearText());
        replacements.put("trade with", config.tradeText());

        for (Map.Entry<String, String> repl : replacements.entrySet())
        {
            if (option.equals(repl.getKey()) && !repl.getValue().isEmpty())
            {
                entry.setOption(repl.getValue());
                break;
            }
        }
    }
}
