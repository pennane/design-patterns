package visitor.skilllevel;

import visitor.IPlayer;
import visitor.visitor.IPlayerVisitor;

public class Novice implements ISkillLevel {
	private IPlayer player;

	@Override
	public void accept(IPlayerVisitor visitor) {
		visitor.visitNovicePlayer(this.getPlayer());
	}

	@Override
	public String toString() {
		return "novice";
	}

	@Override
	public void setPlayer(IPlayer player) {
		this.player = player;

	}

	@Override
	public IPlayer getPlayer() {
		return player;
	}
}
