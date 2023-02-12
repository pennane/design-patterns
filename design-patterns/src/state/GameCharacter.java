package state;

public interface GameCharacter {
	void changeState(GameCharacterState state);

	int getTimesReignedAndConquered();

	void incrementTimesReignedAndConquered();
}
