package com.ssanusi;

import java.util.Stack;

public class QueueWithTwoStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    public Boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.add(stack1.pop());
        }
    }

    @Override
    public String toString() {
        return "QueueWithTwoStack{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
