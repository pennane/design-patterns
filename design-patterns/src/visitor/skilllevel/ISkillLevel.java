package visitor.skilllevel;

import visitor.IPlayer;
import visitor.visitor.IPlayerVisitor;

/**
 * State pattern
 */
public interface ISkillLevel {
	public void accept(IPlayerVisitor visitor);

	public void setPlayer(IPlayer player);

	public IPlayer getPlayer();
}
