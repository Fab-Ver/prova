package prova;

import controller.Controller;
import controller.ControllerImpl;
import model.ModelImpl;
import view.GameView;

public class Main {

	public static void main(String[] args) {
		Controller controller = new ControllerImpl(new ModelImpl(), new GameView());
		
		controller.run();
	}

}
