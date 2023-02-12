package state;

public class RespectedIndividual implements GameCharacterState {
	private GameCharacter character;
	private static final int PROMOTION_BOUNDARY = 10;

	public RespectedIndividual(GameCharacter character) {
		this.character = character;
	}

	public void reignAndConquer() {
		character.incrementTimesReignedAndConquered();
		if (character.getTimesReignedAndConquered() > PROMOTION_BOUNDARY) {
			character.changeState(new Noble(character));
		}
	}

	public String getStatus() {
		return "Ready to reign and conquer as a respected individual.";
	}

	public int getPromotionBoundary() {
		return 10;
	}

}
