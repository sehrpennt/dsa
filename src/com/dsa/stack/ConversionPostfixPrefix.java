package com.dsa.stack;

import java.util.Stack;

public class ConversionPostfixPrefix {
	public static boolean higherPrecedencePostfix(Character a, Character b) {
		
		if(a == '*' || a == '/') {
			a=2;
		}
		else {
			a=1;
		}
		if(b == '*' || b == '/') {
			b=2;
		}
		else {
			b=1;
		}
		return a>b;
	}
	
public static boolean higherPrecedencePrefix(Character a, Character b) {
		
		if(a == '*' || a == '/') {
			a=2;
		}
		else {
			a=1;
		}
		if(b == '*' || b == '/') {
			b=2;
		}
		else {
			b=1;
		}
		return a>=b;
	}
	
	public static StringBuffer toPrefix(String exp) {
		StringBuffer out=new StringBuffer("");
		Stack<Character> stack=new Stack<>();
		for(int i=exp.length()-1; i>=0; i--) {
			if(exp.charAt(i) == ')') {
				stack.push(exp.charAt(i));
			}
			
			else if(exp.charAt(i) == '(') {
				while(!stack.isEmpty()) {
					if(stack.peek() != ')') {
						char ch=stack.pop();
						if(ch != '(') {
							out.append(ch);
						}
					}
					else {
						stack.pop();
						break;
					}
					
				}
			}
			
			else if(exp.charAt(i) == '*'||exp.charAt(i) == '+'||exp.charAt(i) == '-'||exp.charAt(i) == '/') {
				if(stack.isEmpty()) {
					stack.push(exp.charAt(i));
				}
				
				else if(!stack.isEmpty() && higherPrecedencePrefix(exp.charAt(i), stack.peek())) {
					stack.push(exp.charAt(i));
				}
			
				else {
					while(!stack.isEmpty() && stack.peek()!=')' && !higherPrecedencePrefix(exp.charAt(i), stack.peek())) {
						out.append(stack.pop());
					}
					stack.push(exp.charAt(i));
				}
			}
			else {
				out.append(exp.charAt(i));
			}
		}
		while(!stack.isEmpty()) {
			out.append(stack.pop());
		}
		return out.reverse();
	}
	
	public static StringBuffer toPostfix(String exp) {
		StringBuffer out=new StringBuffer("");
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<exp.length(); i++) {
			if(exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));
			}
			
			else if(exp.charAt(i) == ')') {
				while(!stack.isEmpty()) {
					if(stack.peek() != '(') {
						char ch=stack.pop();
						if(ch != ')') {
							out.append(ch);
						}
					}
					else {
						stack.pop();
						break;
					}
					
				}
			}
			
			else if(exp.charAt(i) == '*'||exp.charAt(i) == '+'||exp.charAt(i) == '-'||exp.charAt(i) == '/') {
				if(stack.isEmpty()) {
					stack.push(exp.charAt(i));
				}
				
				else if(!stack.isEmpty() && higherPrecedencePostfix(exp.charAt(i), stack.peek())) {
					stack.push(exp.charAt(i));
				}
			
				else {
					while(!stack.isEmpty() && stack.peek()!='(' && !higherPrecedencePostfix(exp.charAt(i), stack.peek())) {
						out.append(stack.pop());
					}
					stack.push(exp.charAt(i));
				}
			}
			else {
				out.append(exp.charAt(i));
			}
		}
		while(!stack.isEmpty()) {
			out.append(stack.pop());
		}
		return out;
	}

	public static void main(String[] args) {
		System.out.println(toPostfix("2*(3+4)"));
		System.out.println(toPrefix("2+(3*4)-5"));

	}

}
