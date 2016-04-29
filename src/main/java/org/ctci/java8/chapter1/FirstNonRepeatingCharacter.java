package org.ctci.java8.chapter1;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public Character getFirstNonRepeatingCharacter(final String string) {
		final Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) != null) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			}
			else
			{
				map.put(string.charAt(i), 1);
			}

		}
		for (int i = 0; i < string.length(); i++) {
			if (map.get(string.charAt(i)) == 1) {
				return string.charAt(i);
			}
		}

		return null;
	}

}
