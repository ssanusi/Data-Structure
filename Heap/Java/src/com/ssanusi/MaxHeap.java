package com.ssanusi;

public class MaxHeap {
    public static void heapify(int[] array) {
        var parentIndex = array.length/2 - 1;
        for (var i = parentIndex; i >= 0; i--)
            heapify(array, i);
    }

    public static int getKthLargest(int[] array, int K){
        if(K < 1 || K > array.length)
            throw new IllegalArgumentException();

      var heap = new Heap(array.length);
      for (var number : array)
          heap.insert(number);

      for (var i = 0; i < K - 1; i++)
          heap.remove();

      return heap.max();
    }

    private static void heapify(int[] array, int index) {
        var largerIndex = index;

        var leftIndex = index * 2 + 1;
        if (leftIndex < array.length && array[leftIndex] > array[largerIndex])
            largerIndex = leftIndex;

        var rightIndex = index * 2 + 2;
        if (rightIndex < array.length && array[rightIndex] > array[largerIndex])
            largerIndex = rightIndex;

        if (index == largerIndex)
            return;

        swap(array, index, largerIndex);
        heapify(array, largerIndex);
    }

    private static void swap(int[] array, int first, int second){
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;

    }
}

