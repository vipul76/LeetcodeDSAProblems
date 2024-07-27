package com.dsa.striver.recursions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    static List<String> result = new ArrayList<>();
    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) {
        int n=3;
        result = generateParenthesis(n);
        assert result != null;
        result.forEach(s->System.out.print(s+" "));
    }

    private static List<String> generateParenthesis(int n) {
        backtrack(n,n,0,0);
        return result;
    }

    private static void backtrack(int openN, int closedN, int openCount, int closedCount) {
        if(openN==openCount && closedN==closedCount){
            result.add(String.join("",stack));
        }

        if(openCount<openN){
            stack.push("(");
            backtrack(openN,closedN,openCount+1,closedCount);
            stack.pop();
        }

        if(closedCount<openCount){
            stack.push(")");
            backtrack(openN,closedN,openCount,closedCount+1);
            stack.pop();
        }
    }
}
/*
public class GenerateParentheses {
    static Stack<String> stack = new Stack<>();
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        result.forEach(s->System.out.print(s+" "));
    }

    private static List<String> generateParenthesis(int n) {
        backtrack(n, n,0,0);
        return result;
    }

    private static void backtrack(int openN, int closedN, int openCount, int closedCount) {
        if(openCount==openN && closedCount==closedN) {
            result.add(String.join("",stack));
            return;
        }
        if(openCount<openN){
            stack.push("(");
            backtrack(openN,closedN,openCount+1,closedCount);
            stack.pop();
        }
        if(closedCount<openCount){
            stack.push(")");
            backtrack(openN,closedN,openCount,closedCount+1);
            stack.pop();
        }
    }
}

 */