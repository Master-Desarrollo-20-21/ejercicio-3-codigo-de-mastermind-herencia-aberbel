package master.poo.exercise.mastermind.basico.last;

import java.util.Collections;

import master.poo.exercise.mastermind.basico.last.utils.Message;

public class SecretCombination extends Combination{

	public SecretCombination() {
		super();
		for(Color color: Color.values()) {
			this.colors.add(color);
		}
		int random;
		for (int i = 0; i < Color.values().length-LENGTH_COMBINATION; i++) {
			random = (int) Math.floor(Math.random() * (colors.size()-1));
			colors.remove(random);
		}
		Collections.shuffle(colors);
		assert colors.size() == LENGTH_COMBINATION;		
	}
	public void show() {
		Message.SECRET_COMBINATION.writeln();		
	}

	public Result result(ProposedCombination proposedCombination) {
		int black = this.getNumberBlack(proposedCombination);
		int white = this.getNumberWhite(proposedCombination);
		return new Result(black, white);
		
	}
	
	private int getNumberBlack(ProposedCombination proposedCombination) {
		int total=0;
		for (int i=0;i<LENGTH_COMBINATION;i++) {
			if (colors.get(i) == proposedCombination.colors.get(i)) {
				total++;
			}
		}
		return total;
	}
	
	private int getNumberWhite(ProposedCombination proposedCombination) {
		int total = - this.getNumberBlack(proposedCombination);
		String proposed = proposedCombination.getString();
		for (int i=0;i<LENGTH_COMBINATION;i++) {
			if (proposed.contains(
					String.valueOf(colors.get(i).getBeginning())
					)) {
				total++;
			}
		}
		return total;
	}


}
