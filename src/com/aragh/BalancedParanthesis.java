package com.aragh;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        String s = "{a{{{}dfsdf}}dsf{}sff{}asffff{{{}}}";
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{') {
                stack.push(c + "");
            } else if (c == '}') {
                if (stack.isEmpty() || !stack.pop().equals("{")) {
                    System.out.println("Incomplete paranthesis");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Incomplete paranthesis");
        } else {
            System.out.println("Complete paranthesis");
        }
    }
}
