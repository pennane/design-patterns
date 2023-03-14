package visitor.visitor;

import visitor.IPlayer;

/**
 * Visitor pattern
 */
public interface IPlayerVisitor {
	void visitNovicePlayer(IPlayer player);

	void visitIntermediatePlayer(IPlayer player);

	void visitExpertPlayer(IPlayer player);
}
