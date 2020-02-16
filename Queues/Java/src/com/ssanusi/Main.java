package com.ssanusi;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Built in Queue Class in Java
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);

        // Built in Priority Queue in Java
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(5);
        pqueue.add(1);
        pqueue.add(3);
        pqueue.add(2);
        while (!pqueue.isEmpty()){
            System.out.println(pqueue.remove());
        }


        //Custom implementation
        ArrayQueue arrqueue = new ArrayQueue(5);
        arrqueue.enqueue(10);
        arrqueue.enqueue(20);
        arrqueue.enqueue(30);
        System.out.println(arrqueue);
        var front = arrqueue.dequeue();
        arrqueue.enqueue(40);
        arrqueue.enqueue(50);
        arrqueue.enqueue(60);
        System.out.println(front);
        System.out.println(arrqueue);

        //Custom Implementation with Two stack
        QueueWithTwoStack qwts = new QueueWithTwoStack();
        qwts.enqueue(10);
        qwts.enqueue(20);
        qwts.enqueue(30);
        var first = qwts.dequeue();
        System.out.println(first);
        System.out.println(qwts);

        //Custom Priority Queue
        com.ssanusi.PriorityQueue cpqueue = new com.ssanusi.PriorityQueue(5);
        cpqueue.insert(5);
        cpqueue.insert(3);
        cpqueue.insert(6);
        cpqueue.insert(1);
        cpqueue.insert(4);
        System.out.println(cpqueue);

        while(!cpqueue.isEmpty()){
            System.out.println(cpqueue.remove());
        }

    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
