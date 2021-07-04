package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.PriorityProcessSimulation;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1200;
		config.height = 700;
		config.resizable = false;
		config.title = "Symulacja dzia�ania wybranego algorytmu planowania priorytetowego z wykorzystaniem postarzania proces�w";
		new LwjglApplication(new PriorityProcessSimulation(), config);
	}
}
