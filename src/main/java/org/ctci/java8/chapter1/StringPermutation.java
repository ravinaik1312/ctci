package org.ctci.java8.chapter1;

import java.util.Arrays;

public class StringPermutation {

	public Boolean isStringPermutation(String string, String string2) {
		if(string.length()!=string2.length()){
			return false;
		}
		
		int[] count = new int[128];
		for(int i=0; i < string.length(); i++){
			int charValue = string.charAt(i);
			count[charValue]++;
		}
		
		for(int i=0; i < string2.length(); i++){
			int charValue = string2.charAt(i);
			count[charValue]--;
			if(count[charValue]<0){
				return false;
			}
		}
		
		return true;
	}
	
	public Boolean isStringPermutationUsingSort(String string1, String string2){
		if(string1.length()!=string2.length()){
			return false;
		}
		
		char[] arr1 = string1.toCharArray();
		char[] arr2 = string2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(new String(arr1).equals(new String(arr2))){
			return true;
		}
		return false;
		
		
	}

}
