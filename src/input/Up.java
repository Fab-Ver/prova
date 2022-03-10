package input;

import prova.Model;
import prova.Player;

public class Up implements Command {
	
	public static final double MOVEMENT_DELTA = 10;
	private final double movement;
	
	

	public Up() {
		this.movement = this.MOVEMENT_DELTA;
	}



	@Override
	public void execute(Model gameState) {
		final Player player = gameState.getPlayer();
		player.moveUp(this.movement);
		
	}

}
