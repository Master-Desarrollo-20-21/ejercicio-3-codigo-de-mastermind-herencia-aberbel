package master.poo.exercise.mastermind.basico.last;

import master.poo.exercise.mastermind.basico.last.utils.Console;
import master.poo.exercise.mastermind.basico.last.utils.Message;

public class MasterMind {
	
	public Game game;

	public static void main(String[] args) {
		new MasterMind().play();
	}

	private void play() {
		do {
			game = new Game();
			game.play();		
		} while (this.isResumed());		
	}

	private boolean isResumed() {
		char respuesta = Console.instance().readChar(Message.RESUME.toString());
		return "y".equalsIgnoreCase(String.valueOf(respuesta));
	}

}
