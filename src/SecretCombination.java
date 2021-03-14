
public class SecretCombination extends Combination{

	private static final int NUMBER_COLORS_COMBINATION = 4;
	private static final int NUMBER_POSSIBLE_COLOR = Color.values().length;

	public boolean isWinner(Combination proposedCombination) {
		boolean isWinner=true;
		for (int i = 0; i < proposedCombination.colors.length; i++) {
			isWinner &= proposedCombination.getColors()[i] == colors[i];
		}
		return isWinner;
	}

	@Override
	void getCombination() {
		int numberColors=0;
		Color color;
		Color[] colors = new Color[4];
		boolean equalColor;
		do {
			int random = (int) Math.floor(Math.random()*NUMBER_POSSIBLE_COLOR);
			color = Color.values()[random];
			equalColor = false;
			numberColors = this.diferentColor(numberColors, color, colors, equalColor);
		} while (numberColors < NUMBER_COLORS_COMBINATION);

		this.colors = colors;

	}

	private int diferentColor(int numberColors, Color color, Color[] colors, boolean equalColor) {
		if (!isEqualsColor(color, colors, equalColor)) {
			colors[numberColors] = color;
			numberColors++;
		}
		return numberColors;
	}

	private boolean isEqualsColor(Color color, Color[] colors, boolean equalColor) {
		for (int i = 0; i < colors.length; i++) {
			if (color.equals(colors[i])) {
				equalColor = true;
			}
		}
		return equalColor;
	}

	@Override
	void showCombination() {
				System.out.println("xxxx");

	}

	public String result(ProposedCombination proposedCombination) {
		int blackNumber=0;
		int whiteNumber=0;
		for (int i = 0; i < proposedCombination.getColors().length; i++) {
			if (proposedCombination.getColors()[i] == this.getColors()[i]) {
				blackNumber++;
			} else {
				for (int j = 0; j < proposedCombination.getColors().length; j++) {
					if (proposedCombination.getColors()[i] == this.getColors()[j]) {
						whiteNumber++;
					}
				}
			}
		}
		return blackNumber+" blacks and "+whiteNumber+" whites";
	}

}
