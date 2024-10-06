package main.java;

import java.util.Stack;

public class StackReverseString {
	
	public static void main(String[] args) {
		
		String str = "123456789";
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		String reverseStr = "";
		while(!stack.isEmpty()) {
			reverseStr+=stack.pop();
		}
		System.out.println("the string is "+str+" and the reverse of it is "+reverseStr);
	}

}
