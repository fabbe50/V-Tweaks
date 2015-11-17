package com.oitsjustjose.VTweaks.Achievement;

import com.oitsjustjose.VTweaks.Util.ConfigHandler;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class Achievements
{
	public static Achievement rebirth;

	public static void initialize()
	{
		if (ConfigHandler.rebirth)
			rebirth = new Achievement("achievement.rebirth", "rebirth", 7, 15, Items.experience_bottle,
					AchievementList.field_150964_J).setSpecial().registerStat();
	}
}