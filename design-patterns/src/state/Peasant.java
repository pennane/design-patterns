package state;

public class Peasant implements GameCharacterState {
	private GameCharacter character;
	private static final int PROMOTION_BOUNDARY = 3;

	public Peasant(GameCharacter character) {
		this.character = character;
	}

	public void reignAndConquer() {
		character.incrementTimesReignedAndConquered();
		if (character.getTimesReignedAndConquered() > PROMOTION_BOUNDARY) {
			character.changeState(new RespectedIndividual(character));
		}
	}

	public String getStatus() {
		return "Ready to reign and conquer as a measly peasant";
	}

	public int getPromotionBoundary() {
		return PROMOTION_BOUNDARY;
	}

}
