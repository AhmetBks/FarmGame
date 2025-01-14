package AhmetFarm;

import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;
//The house class has the same logic as the board.The Barreşl class is the class where the block, 
//picture or object to be placed is assigned to an object that is customized. In this class, 
//values are assigned to properties inherited from the object.This is an example of inheritance.
public class Houses extends Object{
	
	public Houses() {
		
		name = "House";
        width = 200;
        height = 200;
        solidArea = new Rectangle(0,0,150,150);		
		try {
			
			image=ImageIO.read(getClass().getResourceAsStream("/House.png"));
		
		} catch(IOException e) {
			
			e.printStackTrace();
		
		}
		collision = true;
	}

}
