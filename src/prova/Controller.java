package prova;

public interface Controller {
	
	void gameLoop();
	
	// aggiorna GUI
	void render(Model gameState);
	
	// aggiorna il model
	void update();
	
	void processInput();
	
	void run();

}
