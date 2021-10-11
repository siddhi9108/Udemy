package com.siddhi.Generics;

import java.util.ArrayList;

public class MyList<S> {
	ArrayList<S> list = new ArrayList<>();

	public void addElement(S element) {
		list.add(element);
	}

	public void removeElement(S element) {
		list.remove(element);
	}
	public String toString() {
		return list.toString();
	}

	public S get(int i) {
		return list.get(i);
	}
}
