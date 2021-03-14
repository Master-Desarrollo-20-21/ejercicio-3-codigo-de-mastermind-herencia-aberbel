import java.util.Scanner;

public class ProposedCombination extends Combination{

	private static final int LENGTH_COMBINATION = 4;

	@Override
	void getCombination() {
		String input;
//		Scanner sc = ;
		do {
			System.out.print("Propose a combination: ");
			input = new Scanner(System.in).next();
			
		} while (!this.isCorrectLenght(input) 
				|| !this.isWrongColors(input));	
		this.colors = Color.getArrayColor(input);
		
	}

	@Override
	void showCombination() {
		for (int i = 0; i < colors.length; i++) {
			System.out.print(colors[i].getBeginning());		
		}
	System.out.print(" --> ");
	}

	public boolean isCorrectLenght(String input) {
		boolean isCorrectLenght = input.length() == LENGTH_COMBINATION;
		if (!isCorrectLenght) {
			System.out.println("Wrong proposed combination length");
		}
		return isCorrectLenght;
	}

	public boolean isWrongColors(String input) {
		boolean isWrongColors = Color.isWrongColors(input);
		if (!isWrongColors) {
			System.out.println("Wrong colors, they must be: "+Color.getValidColors());
		} 			
		return isWrongColors;
	}

}
