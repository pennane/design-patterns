package visitor.skilllevel;

import visitor.IPlayer;
import visitor.visitor.IPlayerVisitor;

public class Expert implements ISkillLevel {
	private IPlayer player;

	@Override
	public void accept(IPlayerVisitor visitor) {
		visitor.visitExpertPlayer(this.getPlayer());
	}

	@Override
	public String toString() {
		return "expert";
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
