package strategy.compare;

import strategy.user.User;

public class UserByFullNameAsc implements IComparer<User> {

	@Override
	public int compare(User a, User b) {
		return (a.getFirstName() + a.getLastName()).compareTo(b.getFirstName() + b.getLastName());
	}

}
