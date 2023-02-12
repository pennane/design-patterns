package state;

public class Noble implements GameCharacterState {
	private GameCharacter character;
	private static final int PROMOTION_BOUNDARY = 25;

	public Noble(GameCharacter character) {
		this.character = character;
	}

	public void reignAndConquer() {
		character.incrementTimesReignedAndConquered();
		if (character.getTimesReignedAndConquered() > PROMOTION_BOUNDARY) {
			character.changeState(new GreatSovereign(character));
		}

	}

	public String getStatus() {
		return "Ready to reign and conquer as a well established noble man";
	}

	public int getPromotionBoundary() {
		return PROMOTION_BOUNDARY;
	}

}
