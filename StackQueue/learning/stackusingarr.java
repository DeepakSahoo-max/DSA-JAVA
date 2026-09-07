package StackQueue;

import java.util.Arrays;
import java.util.List;

public class stackusingarr {
    private int[] stackarr;
    private int capacity;
    private int topIndex;

    public stackusingarr(int size) {
        capacity = size;
        stackarr = new int[capacity];
        topIndex = -1;
    }

    public stackusingarr() {
        this(1000);
    }

    public void push(int x) {
        if (topIndex >= capacity - 1) {
            System.out.println("stack overflow");
            return;
        }
        stackarr[++topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return stackarr[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("stack empty");
            return -1;
        }
        return stackarr[topIndex--];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public static void main(String[] args) {
        stackusingarr stack = new stackusingarr();
        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10),
                Arrays.asList(), Arrays.asList(), Arrays.asList());

        for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((stack.isEmpty() ? "true" : "false") + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
