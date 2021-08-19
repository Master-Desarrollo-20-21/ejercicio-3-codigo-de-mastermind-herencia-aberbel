package master.poo.exercise.mastermind.basico.last;

import master.poo.exercise.mastermind.basico.last.utils.Message;

public class ProposedCombination extends Combination{

	public void show() {
		for(Color color: colors) {
			color.show();
		}
	}
	
	public void read() {
		String input;
		do {
			input = this.console
					.readString(Message.PROPOSED_COMBINATION.toString());
		} while (!this.isCorrectLenght(input)
				|| this.isWrongColors(input)
				|| this.isRepeatColors(input));
		for(int i=0;i<LENGTH_COMBINATION;i++) {
			colors.add(Color.getColor(input.charAt(i)));
		}
		
	}

	private boolean isCorrectLenght(String input) {
		boolean isCorrectLenght = input.length() == LENGTH_COMBINATION;
		if (!isCorrectLenght) {
			Message.WRONG_LENGHT.writeln();
		}
		return isCorrectLenght;
	}
	
	private boolean isWrongColors(String input) {
		boolean isWrongColors = Color.isWrongColors(input);
		if (isWrongColors) {
			Message.WRONG_COLORS.write();
			this.console.writeln(Color.getValidColors());
		}
		return isWrongColors;
	}
	
	private boolean isRepeatColors(String input) {
		boolean isRepeatColors = Color.isRepeatColors(input);
		if (isRepeatColors) {
			Message.REPEAT_COLORS.writeln();
		}
		return isRepeatColors;
	}

	public String getString() {
		String cadena="";
		for (int i=0; i<LENGTH_COMBINATION;i++) {
			cadena += colors.get(i).getBeginning();
		}
		return cadena;
	}
}
