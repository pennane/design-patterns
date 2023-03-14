package visitor;

import visitor.visitor.IPlayerVisitor;

public interface IPlayer {
	public void accept(IPlayerVisitor visitor);

	public void rewardBonusPoints(int amount);
}
