package com.dsa.stack;

import java.util.Stack;

public class PrefixPostfix {
	
	public static int postfixEvaluate(String exp) {
		Stack<Integer> stack=new Stack<>();
		for(int i=0; i<exp.length(); i++) {
			if(exp.charAt(i) == '*'||exp.charAt(i) == '+'||exp.charAt(i) == '-'||exp.charAt(i) == '/') {
				int x=stack.pop();
				int y=stack.pop();
				int result;
				if(exp.charAt(i) == '*') {
					result=y*x;
					stack.push(result);
					
				}
				else if(exp.charAt(i) == '/') {
					result=y/x;
					stack.push(result);
				}
				else if(exp.charAt(i) == '+') {
					result=y+x;
					stack.push(result);
				}
				else {
					result=y-x;
					stack.push(result);
				}
			}
			else {
				stack.push(Character.getNumericValue(exp.charAt(i)));
			}
		}
		return stack.pop();
	}
	
	public static int prefixEvaluate(String exp) {
		Stack<Integer> stack=new Stack<>();
		for(int i=exp.length()-1; i>=0; i--) {
			if(exp.charAt(i) == '*'||exp.charAt(i) == '+'||exp.charAt(i) == '-'||exp.charAt(i) == '/') {
				int x=stack.pop();
				int y=stack.pop();
				int result;
				if(exp.charAt(i) == '*') {
					result=x*y;
					stack.push(result);
					
				}
				else if(exp.charAt(i) == '/') {
					result=x/y;
					stack.push(result);
				}
				else if(exp.charAt(i) == '+') {
					result=x+y;
					stack.push(result);
				}
				else {
					result=x-y;
					stack.push(result);
				}
			}
			else {
				stack.push(Character.getNumericValue(exp.charAt(i)));
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
			System.out.println(postfixEvaluate("23*45*+6-"));
			System.out.println(prefixEvaluate("-+*23*456"));
	}

}
