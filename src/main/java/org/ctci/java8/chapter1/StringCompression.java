package org.ctci.java8.chapter1;

public class StringCompression {

	public String compressString(String string) {
		StringBuilder builder = new StringBuilder();
		int counter = 1;
		int i=1;
		for(i = 1; i < string.length(); i++) {
			if(string.charAt(i) == string.charAt(i-1)) {
				counter++;
			}
			else {
				builder.append(string.charAt(i-1));
				builder.append(counter);
				counter = 1;
			}
		}
		builder.append(string.charAt(i-1));
		builder.append(counter);
		
		if(string.length() < builder.length()) {
			return string;
		}
		else {
			return builder.toString();
		}
	}

}
