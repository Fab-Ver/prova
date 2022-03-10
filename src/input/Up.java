package input;

import model.Model;
import model.Player;

public class Up implements Command {
	
	public static final double MOVEMENT_DELTA = 10;
	private final double movement;
	
	

	public Up() {
		this.movement = MOVEMENT_DELTA;
	}



	@Override
	public void execute(Model gameState) {
		final Player player = gameState.getPlayer();
		player.moveUp(this.movement);
		
	}

}
