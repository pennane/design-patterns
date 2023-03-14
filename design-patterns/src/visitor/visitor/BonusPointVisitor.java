package visitor.visitor;

import visitor.IPlayer;

public class BonusPointVisitor implements IPlayerVisitor {

	@Override
	public void visitNovicePlayer(IPlayer player) {
		player.rewardBonusPoints(5);
	}

	@Override
	public void visitIntermediatePlayer(IPlayer player) {
		player.rewardBonusPoints(10);
	}

	@Override
	public void visitExpertPlayer(IPlayer player) {
		player.rewardBonusPoints(15);
	}

}
