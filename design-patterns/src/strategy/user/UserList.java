package strategy.user;

import java.util.ArrayList;
import java.util.List;

import strategy.sort.ISorter;

public class UserList {
	ISorter sorter;
	List<User> list;

	public UserList(ISorter s) {
		list = new ArrayList<>();
		sorter = s;
	}

	public void add(User u) {
		list.add(u);
	}

	public int size() {
		return list.size();
	}

	public List<User> sort() {
		return sorter.sort(list);
	}

}
