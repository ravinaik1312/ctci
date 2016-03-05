package org.ctci.java8.chapter1;

public class UniqueCharactersString {
	
	public UniqueCharactersString(){
		
	}

	public Boolean areAllCharactersUnique(String string) {
		int[] check = new int[128];
		for(int i=0; i < string.length(); i++){
			int charValue = string.charAt(i);
			if(check[charValue] > 0){
				return false;
			}
			check[charValue] = 1;
		}
		
		return true;
	}

}
