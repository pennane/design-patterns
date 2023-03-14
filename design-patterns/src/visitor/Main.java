package visitor;

import java.util.ArrayList;
import java.util.List;

import visitor.skilllevel.Expert;
import visitor.skilllevel.Intermediate;
import visitor.skilllevel.Novice;
import visitor.visitor.BonusPointVisitor;
import visitor.visitor.IPlayerVisitor;

public class Main {

	public static void main(String[] args) {
		PlayerBuilder builder = new PlayerBuilder();

		List<IPlayer> players = new ArrayList<>();

		players.add(builder.setSkillLevel(new Novice()).build());
		players.add(builder.setSkillLevel(new Intermediate()).build());
		players.add(builder.setSkillLevel(new Expert()).build());

		IPlayerVisitor bonusPointVisitor = new BonusPointVisitor();

		for (var player : players) {
			player.accept(bonusPointVisitor);
		}

		for (var player : players) {
			System.out.println(player);
		}

		/**
		 * novice player with 5 bonus points
		 * 
		 * intermediate player with 10 bonus points
		 * 
		 * expert player with 15 bonus points
		 */

	}

}
