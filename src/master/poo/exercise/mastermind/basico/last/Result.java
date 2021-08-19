package master.poo.exercise.mastermind.basico.last;

import master.poo.exercise.mastermind.basico.last.utils.Console;
import master.poo.exercise.mastermind.basico.last.utils.Message;

public class Result {
	
	private int black;
	private int white;

	public Result(int black, int white) {
		this.black = black;
		this.white = white;
	}

	public boolean isWinner() {
		return black == Combination.LENGTH_COMBINATION;
	}

	public void showWinnerOrLost() {
		if (this.isWinner()) {
			Message.WIN.writeln();
		} else {
			Message.LOST.writeln();
		}	
	}

	public void show() {
		Console.instance()
		.writeln(Message.BLANKS_WHITES.
				replaceBlacksAndWhites(black, white));
	}

}
