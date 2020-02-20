package com.ssanusi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	  var heap = new Heap(10);
	  heap.insert(10);
	  heap.insert(5);
	  heap.insert(17);
	  heap.insert(4);
	  heap.insert(22);
	  heap.remove();
	  System.out.println("Done");

      int[] numbers = { 5, 3, 10, 1, 4, 2 };
      var heap2 = new Heap(10);
      for(var number: numbers)
      	heap2.insert(number);
      for (var i = numbers.length - 1; i >= 0; i--){
          numbers[i] = heap2.remove();
      }
        System.out.println(Arrays.toString(numbers));

      //Max Heap
      MaxHeap.heapify(numbers);
      System.out.println(Arrays.toString(numbers));
      System.out.println(MaxHeap.getKthLargest(numbers, 7));
    }
}
