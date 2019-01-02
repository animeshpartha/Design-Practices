package MathProblem;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {   //args: {}


        Stack<String> stack = new Stack<String>();
        stack.push("NY");
        stack.push("VA");
        stack.push("NJ");

        System.out.println(stack.pop());

    }
}