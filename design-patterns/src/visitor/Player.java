package visitor;

import visitor.skilllevel.ISkillLevel;
import visitor.visitor.IPlayerVisitor;

public class Player implements IPlayer {
	private int bonusPoints;
	private ISkillLevel skillLevel;

	public Player(ISkillLevel skillLevel) {
		this.bonusPoints = 0;
		this.skillLevel = skillLevel;
	}

	@Override
	public void accept(IPlayerVisitor visitor) {
		this.skillLevel.accept(visitor);
	}

	@Override
	public void rewardBonusPoints(int amount) {
		bonusPoints += amount;
	}

	@Override
	public String toString() {
		return skillLevel + " player with " + bonusPoints + " bonus points";
	}

}
