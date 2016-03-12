package org.ctci.java8.chapter1;

import java.util.Stack;

public class StringValidation {

	public Boolean isStringValid(String string) {
		if(string==null){
			return true;
		}
		Stack<Character> stack = new Stack<Character>();
		int i=0;
		while(i < string.length()) {
			if(string.charAt(i) == ')'){
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(string.charAt(i) == '('){
				stack.push(string.charAt(i));
			}
			i++;
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
