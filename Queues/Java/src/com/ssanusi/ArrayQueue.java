package com.ssanusi;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int length){
        items = new int[length];
    }

    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", rear=" + rear +
                ", count=" + count +
                '}';
    }

    public int dequeue(){
        var item = items[front];
        items[front++] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

}
