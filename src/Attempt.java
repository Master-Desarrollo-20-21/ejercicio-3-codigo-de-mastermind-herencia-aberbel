
public class Attempt {
	
	ProposedCombination proposedCombination;
	
	Attempt(){
		proposedCombination = new ProposedCombination();
	}
	public void proposeACombination() {
		proposedCombination.getCombination();
	}

	public void showAttempt(int numAttemp) {
		System.out.println("");
		System.out.println(String.valueOf(numAttemp)+" attempt(s):");
		
	}

	public Combination getProposedCombination() {
		return proposedCombination;
	}
	public void showSecretCombination(SecretCombination secret) {
		secret.showCombination();
		
	}
	public void showCombination(SecretCombination secret) {
		if (proposedCombination.getColors() !=null) {
			proposedCombination.showCombination();
			System.out.println(secret.result(proposedCombination));
		}	
		
	}

}
