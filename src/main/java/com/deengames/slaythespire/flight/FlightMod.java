package com.deengames.slaythespire.flight;

import com.megacrit.cardcrawl.characters.AbstractPlayer.PlayerClass;
import com.megacrit.cardcrawl.daily.mods.Flight;
import com.megacrit.cardcrawl.helpers.ModHelper;

import basemod.BaseMod;
import basemod.interfaces.ISubscriber;
import basemod.interfaces.PostCreateStartingRelicsSubscriber;

import java.util.ArrayList;
import java.util.List;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

@SpireInitializer
public class FlightMod implements ISubscriber, PostCreateStartingRelicsSubscriber
{
	public static void initialize() {
        new FlightMod();
    }
	
	public FlightMod() {
		BaseMod.subscribe(this);
	}

	@Override
	public void receivePostCreateStartingRelics(PlayerClass arg0, ArrayList<String> arg1) {
		List<String> list = new ArrayList<String>();
		list.add(Flight.ID);
		ModHelper.setMods(list);
	}
}
