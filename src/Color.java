
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

	static Color[] getArrayColor(String input) {
		Color[]  colors = new Color[4];
		for (int i = 0; i < input.length(); i++) {
			colors[i] = Color.beginning(input.charAt(i));
		}
		return colors;
	}
	static String getValidColors() {
		StringBuilder colors = new StringBuilder();
		for (int i = 0; i < Color.values().length; i++) {
			colors.append(Color.values()[i].getBeginning());			
		}
		return colors.toString();
		
	}
	static boolean isWrongColors(String input) {
		Color[]  colors = new Color[4];
		Color color;
		for (int i = 0; i < input.length(); i++) {
			color = Color.beginning(input.charAt(i));
			for (int j = 0; j < colors.length; j++) {
				if (color == colors[j]) {
					return false;
				}
			}
			colors[i] = color;
		}
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] == null) {
				return false;
			}		
		}	
		
		return true;
	}
	static Color beginning(char beginning) {
		for (int i = 0; i < Color.values().length; i++) {
			if (Color.values()[i].beginning == beginning) {
				return Color.values()[i];
			}
		}
		return null;
		
	}
}
