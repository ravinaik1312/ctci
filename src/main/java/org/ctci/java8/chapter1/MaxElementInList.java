package org.ctci.java8.chapter1;

import java.util.List;

public class MaxElementInList {

	public int getMaxElementInList(List<Integer> inputList) {
		return inputList.stream().max((x,y) -> Integer.compare(x, y)).get();
	}

}
