package prova;

public class ControllerImpl implements Controller {
	
	private Model model;
	private GameView view;
	

	public ControllerImpl(Model model, GameView view) {
		super();
		this.model = model;
		this.view = view;
	}

	@Override
	public void gameLoop() {
		while(!this.model.isGameOver()) {
			processInput();
			update();
			render();
		}
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		this.view.run();
	}

}
