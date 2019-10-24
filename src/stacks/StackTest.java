package stacks;

import stacks.stack.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(1);
        stack.push(4);

        System.out.println("stack.isEmpty()=" + stack.isEmpty());
        System.out.println("stack.peek()=" + stack.peek());
        System.out.println("stack.pop()=" + stack.pop());
        System.out.println("stack.pop()=" + stack.pop());
        System.out.println("stack.pop()=" + stack.pop());
    }
}
