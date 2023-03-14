package visitor.skilllevel;

import visitor.IPlayer;
import visitor.visitor.IPlayerVisitor;

public class Intermediate implements ISkillLevel {
	private IPlayer player;

	@Override
	public void accept(IPlayerVisitor visitor) {
		visitor.visitIntermediatePlayer(this.getPlayer());
	}

	@Override
	public String toString() {
		return "intermediate";
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
