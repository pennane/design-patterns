package strategy.compare;

import strategy.user.User;

public class UserByAgeAsc implements IComparer<User> {

	@Override
	public int compare(User a, User b) {
		return a.getAge() - b.getAge();
	}

}
