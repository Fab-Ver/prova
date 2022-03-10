package input;

import prova.Model;
import prova.Player;

public class Down implements Command {
	
	public static final double MOVEMENT_DELTA = 10;
	private final double movement;
	
	

	public Down() {
		this.movement = this.MOVEMENT_DELTA;
	}



	@Override
	public void execute(Model gameState) {
		final Player player = gameState.getPlayer();
		player.moveDown(this.movement);
		
	}

}
