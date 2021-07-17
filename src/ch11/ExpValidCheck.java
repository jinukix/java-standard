package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String expression = "(())(())(()()()()(()())";

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch=='(') {
                    stack.push(ch);
                } else if (ch==')') {
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
