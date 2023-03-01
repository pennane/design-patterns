package strategy.user;

import strategy.compare.IComparer;

public class UserBuilder {
	int age;
	String firstName;
	String lastName;
	IComparer<User> comparer;

	public UserBuilder setAge(int a) {
		age = a;
		return this;
	}

	public UserBuilder setFirstName(String n) {
		firstName = n;
		return this;
	}

	public UserBuilder setLastName(String n) {
		lastName = n;
		return this;
	}

	public UserBuilder setComparer(IComparer<User> c) {
		comparer = c;
		return this;
	}

	public User build() {
		return new User(this);
	}
}
