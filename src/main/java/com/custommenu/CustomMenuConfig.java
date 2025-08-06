package com.custommenu;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("custommenu")
public interface CustomMenuConfig extends Config
{
    @ConfigItem(keyName = "dismissText", name = "Dismiss Text", description = "Rename the Dismiss option")
    default String dismissText() { return ""; }

    @ConfigItem(keyName = "attackText", name = "Attack Text", description = "Rename the Attack option")
    default String attackText() { return ""; }

    @ConfigItem(keyName = "walkHereText", name = "Walk Here Text", description = "Rename the Walk here option")
    default String walkHereText() { return ""; }

    @ConfigItem(keyName = "talkToText", name = "Talk-to Text", description = "Rename the Talk-to option")
    default String talkToText() { return ""; }

    @ConfigItem(keyName = "useText", name = "Use Text", description = "Rename the Use option")
    default String useText() { return ""; }

    @ConfigItem(keyName = "openText", name = "Open Text", description = "Rename the Open option")
    default String openText() { return ""; }

    @ConfigItem(keyName = "pickUpText", name = "Pick Up Text", description = "Rename the Pick-up option")
    default String pickUpText() { return ""; }

    @ConfigItem(keyName = "takeText", name = "Take Text", description = "Rename the Take option")
    default String takeText() { return ""; }

    @ConfigItem(keyName = "eatText", name = "Eat Text", description = "Rename the Eat option")
    default String eatText() { return ""; }

    @ConfigItem(keyName = "drinkText", name = "Drink Text", description = "Rename the Drink option")
    default String drinkText() { return ""; }

    @ConfigItem(keyName = "chopDownText", name = "Chop Down Text", description = "Rename the Chop down option")
    default String chopDownText() { return ""; }

    @ConfigItem(keyName = "wieldText", name = "Wield Text", description = "Rename the Wield option")
    default String wieldText() { return ""; }

    @ConfigItem(keyName = "wearText", name = "Wear Text", description = "Rename the Wear option")
    default String wearText() { return ""; }

    @ConfigItem(keyName = "tradeText", name = "Trade Text", description = "Rename the Trade option")
    default String tradeText() { return ""; }
}
