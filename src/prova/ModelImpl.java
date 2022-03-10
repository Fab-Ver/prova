package prova;

public class ModelImpl implements Model {
	
	private Player player;
	
	public ModelImpl() {
		//this.player = new PlayerImpl();
	}

	@Override
	public Player getPlayer() {
		return this.player;
	}

	@Override
	public boolean isGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

}
