package com.zahid;

import java.util.Stack;

public class BracketChecker
{
    public boolean isBalanced(String expression) {
        char[] charSet = expression.toCharArray();
        Stack<Character> charStack = new Stack<Character>();

        for(char ch: charSet) {
            if(ch == ' ') {
                continue;
            }
            else if(charStack.isEmpty()) {
                charStack.push(ch);
            }
            else {
                char topChar = charStack.peek();
                if(topChar == '(' && ch == ')') {
                    charStack.pop();
                }
                else if(topChar == '{' && ch == '}') {
                        charStack.pop();
                }
                else if(topChar == '[' && ch == ']') {
                        charStack.pop();
                }
                else {
                    charStack.push(ch);
                }
            }
        }

        return charStack.empty();
    }
}
