package fr.campus.academy.launcher;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import fr.campus.academy.game.SimpleSlickGame;

public class Launcher {

	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new SimpleSlickGame("Tetri ©"));
			appgc.setDisplayMode(500, 600, false);
			Input.disableControllers();
			appgc.setTargetFrameRate(59);
			appgc.setShowFPS(false);
			appgc.start();
			
		}
		catch (SlickException ex)
		{
			Logger.getLogger(SimpleSlickGame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
