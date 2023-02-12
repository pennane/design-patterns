package state;

public class Protagonist implements GameCharacter, GameCharacterState {
	private GameCharacterState state;
	private int timesReignedAndConquered;

	public Protagonist() {
		state = new Peasant(this);
		timesReignedAndConquered = 0;
	}

	public void changeState(GameCharacterState newState) {
		state = newState;
	}

	public int getTimesReignedAndConquered() {
		return timesReignedAndConquered;
	}

	public void incrementTimesReignedAndConquered() {
		timesReignedAndConquered += 1;
	}

	public void reignAndConquer() {
		state.reignAndConquer();
	}

	public String getStatus() {
		return state.getStatus();
	}

	public int getPromotionBoundary() {
		return state.getPromotionBoundary();
	}

}
