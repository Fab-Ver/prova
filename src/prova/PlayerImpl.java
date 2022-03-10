package prova;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import util.Resource;

public class PlayerImpl implements Player {
	
	private final static int POSX = 1920/4;
	private final static int POSY = 1080/4;
	private final static String imagePath = "data/main-character1.pngg";
	 
	private  int posX;
	private  int posY;
	private final BufferedImage image; 
	
	public PlayerImpl() throws IOException {
		posX  = POSX;
		posY = POSY;
		image = ImageIO.read(new File(imagePath));
	}

	@Override
	public void moveUp(double movementDelta) {
		this.posY += movementDelta;
	}

	@Override
	public void moveDown(double movementDelta) {
		this.posY -= movementDelta;
	}
	
	@Override
	public int getPosX() {
		return this.posX;
	}

	@Override
	public int getPosY() {
		return this.posY;
	}
	
	
}
