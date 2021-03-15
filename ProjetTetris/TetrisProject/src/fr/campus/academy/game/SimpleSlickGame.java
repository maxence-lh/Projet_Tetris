package fr.campus.academy.game;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import fr.campus.academy.model.Board;
import fr.campus.academy.model.Subblock;

public class SimpleSlickGame extends BasicGame
{
	
	int squareposition = 0;
	int left = 0;
	int right = 0;
	int down = 0;
	int up = 0;
	int a = 0;
	int b = 0;
	int z = 0;
	
	Board board= new Board();
	
	//
	
	
	public SimpleSlickGame(String gamename)
	{
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		
		
		Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_LEFT) && squareposition + down < 600 - b) {
        	left-=5;
        } else {
        	left-=0;
        }
        if (input.isKeyDown(Input.KEY_RIGHT) && squareposition + down < 600 - b) {
        	right+=5;
        }else {
        	right+=0;
        }
        if (input.isKeyDown(Input.KEY_DOWN)) {
        	down+=5;
        }
        if (input.isKeyDown(Input.KEY_UP)) {
        	down-=8;
        }
        
        
        
        if (z < 0) {
			z = 0;
			left += 5;
		}
        
        if (z+a > 500) {
			z = 500 - a ;
			right -= 5;
		}
        
        
        if (squareposition + down < 600 - b) {
			squareposition ++ ;
		} else {
			squareposition = 600 - b;
			down = 0;
			left+=5;
			right-=5;
		}
        
        
	}
		
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		
		 g.setBackground(new Color(150,150,150));
		 
		 /*
		 * g.setColor(new Color(210,210,210)); g.fillRect(z = (500/2 - a/2 + right +
		 * left), squareposition + down + up, a = 100 , b = 100);
		 * 
		 */
		
		for (int i = 0;i < board.getBlocks().length; i++) {
			for (int j = 0;j < board.getBlocks()[0].length; j++) {
				
				
				
				
				
				Subblock subblock = board.getBlocks()[i][j];
				
				if (subblock.isFree()) {
					
				}
				
			}
			
		}
		
}
}