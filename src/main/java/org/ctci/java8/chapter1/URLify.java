package org.ctci.java8.chapter1;

public class URLify {

	public String urlifyString(String string) { 
		StringBuilder str = new StringBuilder("");
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == 32){
				str.append("%20");
			}
			else{
				str.append(string.charAt(i));
			}
		}
		return str.toString();
	}

}
