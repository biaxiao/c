package leetcode;

import java.util.Stack;

class MinStack {
    public static void main(String[] args) {
        MinStack minStack =new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }
    private Stack<Integer> stack ;
    private Stack<Integer> minStack;

    public MinStack() {
        stack= new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.empty()||minStack.peek()>=x){
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = stack.pop();
        int peek = minStack.peek();
        if(peek==pop){
            minStack.pop();
        }
    }

    public int top() {
      return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
