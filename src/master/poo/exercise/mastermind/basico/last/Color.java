package master.poo.exercise.mastermind.basico.last;

import master.poo.exercise.mastermind.basico.last.utils.Console;

public enum Color {
	RED('r'),
	BLUE('b'),
	YELLOW('y'),
	GREEN('g'),
	ORANGE('o'),
	PINK('p');

	private char beginning;
	
	Color(char beginning) {
		this.beginning = beginning;
	}

	public char getBeginning() {
		return beginning;
	}

	static String getValidColors() {
		StringBuilder colors = new StringBuilder();
		for (int i = 0; i < Color.values().length; i++) {
			colors.append(Color.values()[i].getBeginning());			
		}
		return colors.toString();		
	}
	
	static boolean isWrongColors(String input) {
		Color[]  colors = new Color[input.length()];
		for (int i = 0; i < input.length(); i++) {
			colors[i] = Color.getColor(input.charAt(i));
		}
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] == null) {
				return true;
			}		
		}			
		return false;
	}
	
	static Color getColor(char beginning) {
		for (int i = 0; i < Color.values().length; i++) {
			if (Color.values()[i].beginning == beginning) {
				return Color.values()[i];
			}
		}
		return null;		
	}

	static boolean isRepeatColors(String input) {
		Color[]  colors = new Color[input.length()];
		Color color;
		for (int i = 0; i < input.length(); i++) {
			color = Color.getColor(input.charAt(i));
			for (int j = 0; j < colors.length; j++) {
				if (color == colors[j]) {
					return true;
				}
			}
			colors[i] = color;
		}
		return false;
	}

	void show() {
		Console.instance().write(beginning);		
	}
}
