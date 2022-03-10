package input;

import model.Model;

public interface Command {
	
	void execute(Model gameState);

}
