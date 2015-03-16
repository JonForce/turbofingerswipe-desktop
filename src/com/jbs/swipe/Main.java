package com.jbs.swipe;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	
	private static final int
		WINDOW_WIDTH = 800, WINDOW_HEIGHT = 600,
		VIRTUAL_WIDTH = 1024, VIRTUAL_HEIGHT = 768;
	
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Turbo Finger Swipe";
		cfg.useGL20 = false;
		cfg.width = WINDOW_WIDTH;
		cfg.height = WINDOW_HEIGHT;
		
		new LwjglApplication(new Game(VIRTUAL_WIDTH, VIRTUAL_HEIGHT), cfg);
	}
}