import java.util.Scanner;

public class MasterMind {
	
	public Game game;
	
	MasterMind() {
		game = new Game();
	}

	public static void main(String[] args) {
		new MasterMind().play();
	}

	private void play() {
		do {
			game.play();
			game = new Game();
		} while (this.isResumed());
		
	}

	private boolean isResumed() {
		System.out.println("RESUME? (y/n):");
		char gender = new Scanner(System.in).next().charAt(0);
		return "y".equalsIgnoreCase(String.valueOf(gender));
	}

}
