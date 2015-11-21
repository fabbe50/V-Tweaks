package com.oitsjustjose.VTweaks.Util.Client;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.oitsjustjose.VTweaks.VTweaks;
import com.oitsjustjose.VTweaks.Util.Config;

import cpw.mods.fml.client.config.GuiConfig;

public class ModGUIConfig extends GuiConfig
{
	public ModGUIConfig(GuiScreen guiScreen)
	{
		super(guiScreen, new ConfigElement(Config.config.getCategory(Configuration.CATEGORY_GENERAL))
				.getChildElements(), VTweaks.modid, false, true, GuiConfig.getAbridgedConfigPath(Config.config
						.toString()));
	}
}