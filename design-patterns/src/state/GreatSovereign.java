package state;

public class GreatSovereign implements GameCharacterState {
	private GameCharacter character;

	public GreatSovereign(GameCharacter character) {
		this.character = character;
	}

	@Override
	public void reignAndConquer() {
		System.out.println("You have conquered everything. You may ottaa iisisti now.");
	}

	@Override
	public String getStatus() {
		return "You are the great sovereign. Your days of conquering are behind you.";
	}

	@Override
	public int getPromotionBoundary() {
		return 0;
	}

}
