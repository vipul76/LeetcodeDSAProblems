package com.dsa.striver.string;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String str = "(()())(()(()))";
        String output = removeOuterParentheses(str);
        System.out.printf(output);
    }

    //Intitutions
    /*
    This is a solution to the problem of removing outermost parentheses from a string containing only parentheses.

The approach used is to keep track of the parentheses using a stack. Whenever an opening parenthesis is encountered, it is pushed onto the stack. Whenever a closing parenthesis is encountered, the last opening parenthesis is popped from the stack.

If the stack size is greater than zero after pushing or popping, it means that the parenthesis is not an outer parenthesis, and it is added to the result string. If the stack size is zero, it means that the parenthesis is an outer parenthesis and it is not added to the result string.

Complexity
Time complexity:
The time complexity of this solution is O(n), where n is the length of the input string. This is because each character in the string is processed once and the push and pop operations on the stack take O(1) time each.

Space complexity:
The space complexity of this solution is O(n), where n is the length of the input string. This is because the maximum size of the stack is n/2 (if all the parentheses are opening parentheses), and in the worst case, the result string can also have a size of n/2.
     */
    private static String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                //or we can write as bracket.size()>0
                if(!bracket.isEmpty()){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }
            else{
                bracket.pop();
                //or we can write as bracket.size()>0
                if(!bracket.isEmpty()){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
