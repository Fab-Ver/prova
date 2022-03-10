package prova;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame {
	
	public GameView() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1920/2,1080/2);
	}
	
	public void run() {
		this.setVisible(true);
	}
	
	public void render(Model gameState) {
		
	}
	
}
