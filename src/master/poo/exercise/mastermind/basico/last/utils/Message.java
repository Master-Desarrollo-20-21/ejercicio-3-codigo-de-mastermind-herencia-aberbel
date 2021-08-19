package master.poo.exercise.mastermind.basico.last.utils;

public enum Message {

	MASTERMIND ("----- MASTERMIND -----"),
	ATTEMPT("#attemps attempt(s):"), 
	SECRET_COMBINATION("xxxx"),
	PROPOSED_COMBINATION("Propose a combination: "),
	WRONG_LENGHT("Wrong proposed combination length"),
	WRONG_COLORS("Wrong colors, they must be: "),
	REPEAT_COLORS("Wrong colors, they musn´t be repeated"),
	BLANKS_WHITES(" --> #blacks blacks and #whites whites"),
	WIN("You've won!!! :-)"),
	LOST("You've lost!!! :-("),
	RESUME("RESUME? (y/n):");

	private String message;

	private Message(String message) {
		this.message = message;
	}

	public void write() {
		Console.instance().write(this.message);
	}

	public void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
	}
	
	public String replaceAttempt(int attempt) {
		return Message.ATTEMPT.toString()
				.replaceFirst("#attemps", 
						String.valueOf(attempt));		
	}
	
	public String replaceBlacksAndWhites(int black,int white) {
		return Message.BLANKS_WHITES.toString()
				.replaceFirst("#blacks", 
						String.valueOf(black))
				.replaceFirst("#whites", 
						String.valueOf(white));		
	}

}
