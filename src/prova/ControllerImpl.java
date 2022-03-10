package prova;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import input.Command;
import input.InputController;

public class ControllerImpl implements Controller, InputController {
	
	private static final int QUEUE_CAPACITY = 70;
	private Model model;
	private GameView view;
	private final BlockingQueue<Command> cmdQueue;

	

	public ControllerImpl(Model model, GameView view) {
		this.model = model;
		this.view = view;
		this.cmdQueue = new ArrayBlockingQueue<>(QUEUE_CAPACITY);
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
		this.view.render();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processInput() {
		final Command cmd = this.cmdQueue.poll();
		if (cmd != null) {
			cmd.execute(this.model);
		}
	}

	@Override
	public void notifyCommand(Command cmd) {
		this.cmdQueue.add(cmd);
	}
	
	@Override
	public void run() {
		this.view.run();
	}

}
