package prova;

public class Main {

	public static void main(String[] args) {
		Controller controller = new ControllerImpl(new ModelImpl(), new GameView());
		
		controller.run();
	}

}
