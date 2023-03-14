package visitor;

import visitor.skilllevel.ISkillLevel;

/**
 * Only reason to use this builder is to abstract the two way dependency
 * initiation between player / skill level
 */
public class PlayerBuilder {
	private ISkillLevel skillLevel;

	public PlayerBuilder setSkillLevel(ISkillLevel skillLevel) {
		this.skillLevel = skillLevel;
		return this;
	}

	public IPlayer build() {
		IPlayer player = new Player(skillLevel);
		skillLevel.setPlayer(player);
		return player;
	}
}
