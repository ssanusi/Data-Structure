package com.ssanusi;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int length) {
        items = new int[length];
    }

    public void insert(int item){
        if(isFull())
            throw new IllegalStateException();
        int i = shiftItemToInsert(item);
        items[i + 1] = item;
            count++;
    }

    public boolean isFull() {
        return items.length == count;
    }

    public int shiftItemToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if(items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
