
public class Game {

	private static final int MAX_ATTEMPTS = 10;
	Attempt [] attempts;
	SecretCombination secret;
	int numAttemps;

	Game() {
		attempts = new Attempt[MAX_ATTEMPTS+1];
		secret = new SecretCombination();
		secret.getCombination();
		numAttemps=0;
	}

	public void play() {
		do {
			attempts[numAttemps] = new Attempt();
			this.showAll();
			this.proposeACombination(); 
			numAttemps++;
		} while (this.isThereAttemptsAndNotIsWinner());
		if (numAttemps < MAX_ATTEMPTS && this.isWinner()) {
			numAttemps--;
			this.showAll();
			System.out.println("You've won!!! :-)");
		} else {
			System.out.println("You've lost!!! :-(");
		}
	}

	private boolean isThereAttemptsAndNotIsWinner() {
		return numAttemps <= MAX_ATTEMPTS  && !this.isWinner();
	}

	private void proposeACombination() {
		if (numAttemps != MAX_ATTEMPTS) {
			attempts[numAttemps].proposeACombination();
		}
	}

	private void showAll() {
		attempts[numAttemps].showAttempt(numAttemps);
		attempts[numAttemps].showSecretCombination(secret);
		for (int i = 0; i < attempts.length; i++) {
			if (attempts[i] !=null) {
				attempts[i].showCombination(secret);
			}
		}
	}

	private boolean isWinner() {
		int numAttemps = this.numAttemps-1;
		boolean isWinner = secret.isWinner(attempts[numAttemps].getProposedCombination());
		return isWinner;
	}

}
