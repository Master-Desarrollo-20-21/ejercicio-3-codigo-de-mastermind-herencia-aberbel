package master.poo.exercise.mastermind.basico.last;

import java.util.ArrayList;
import java.util.List;

import master.poo.exercise.mastermind.basico.last.utils.Console;
import master.poo.exercise.mastermind.basico.last.utils.Message;

public class Game {
	
	private static final int NUMBER_MAX_ATTEMPT = 10;
	List<ProposedCombination> allProposedCombination;
	SecretCombination secretCombination;
	List<Result> allResult;
	int attempt;
	Console console;
	
	public Game() {
		allProposedCombination = new ArrayList<>();
		secretCombination = new SecretCombination();
		allResult = new ArrayList<>();
		attempt = 0;
		console = Console.instance();
	}

	public void play() {
		Result result;
		Message.MASTERMIND.writeln();
		do {
			this.showAll();
			ProposedCombination proposedCombination = new ProposedCombination();
			proposedCombination.read();
			result = secretCombination.result(proposedCombination);
			allProposedCombination.add(proposedCombination);
			allResult.add(result);
			attempt++;
		} while (!result.isWinner() && attempt < NUMBER_MAX_ATTEMPT);
		this.showAll();
		result.showWinnerOrLost();
	}

	private void showAll() {
		console.writeln();
		console.writeln(Message.ATTEMPT.replaceAttempt(attempt));
		secretCombination.show();
		this.showProposedCombinationAndResult();
	}

	private void showProposedCombinationAndResult() {
		for (int i=0;i< allProposedCombination.size();i++) {
			allProposedCombination.get(i).show();
			allResult.get(i).show();		
		}
	}

}
