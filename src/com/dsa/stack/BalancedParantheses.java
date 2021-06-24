package com.dsa.stack;

/*
 * Given a string A consisting only of '(' and ')'.
 * You need to find whether parantheses in A is balanced or not.
 * if it is balanced then return 1 else return 0.
 * 
 */


/*
 * -- A slightly better solution --
 * public int solve(String A) {

    Stack<Character> stack = new Stack<>();
    
    if(A.charAt(0) == ')' || A.charAt(A.length()-1) == '('){
        return 0;
    }
    for(int i=0; i<A.length(); i++){
        if(A.charAt(i)=='('){
            stack.push(A.charAt(i));
        }
        else{
            if(stack.isEmpty()){
                return 0;
            }
           stack.pop();
        }
    }
    return stack.isEmpty()?1:0;


}
 */

import java.util.Stack;

class BalancedParanthesesSolution{
	public static int solve(String A) {
		int flag=0;
		Stack <Character> stack = new Stack<>();
		for(int i=0; i<A.length(); i++) {
			stack.push(A.charAt(i));
		}
		if(A.charAt(A.length()-1) == '(' || A.charAt(0) == ')') {
			return 0;
		}
		
		while(stack.isEmpty() == false) {
			if(stack.pop() == ')') {
				flag--;
			}
			else {
				flag++;
			}
		}
		return flag==0?1:0;
		
	}
	
	
}

public class BalancedParantheses {

	public static void main(String[] args) {
		
		System.out.println(BalancedParanthesesSolution.solve("((()))"));
	}

}
