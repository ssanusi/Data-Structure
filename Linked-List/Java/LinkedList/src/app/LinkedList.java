package app;

import java.util.NoSuchElementException;

/**
 * LinkedList
 */
public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty() {
        return first == null;
    }

    // addFirst
    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;

        else {
            node.next = first;
            first = node;
        }

        size++;

    }

    // addLast
    public void addLast(int item) {
        Node node = new Node(item);
        node.value = item;

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    // deleteFirst
    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        } else {

            Node second = first.next;
            first.next = null;
            first = second;
        }

        size--;

    }

    // deleteLast
    public void deleteLast() {

        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        } else {

            Node previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;

    }

    // contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        if (isEmpty())
            return;
        // [1 => 2 => 3]
        Node previous = first;
        Node current = first.next;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;

        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if(isEmpty())
            throw new IllegalStateException();
        // [1 => 2 => 3 => 4 => 5]

        Node a = first;
        Node b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();

        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;

    }
}