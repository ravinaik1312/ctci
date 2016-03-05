package org.ctci.java8.chapter1;

public class StringRotation {

	public Boolean isStringRotation(String string1, String string2) {
		if(string1.length()!=string2.length()){
			return false;
		}
		
		if(string1.concat(string1).contains(string2)){
			return true;
		}
		return false;
	}

}
