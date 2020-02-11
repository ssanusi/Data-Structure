package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
         //Implemented Array
         Array numbers = new Array(3);
         numbers.insert(10);
         numbers.insert(20);
         numbers.insert(30);
         numbers.insert(40);
         numbers.removeAt(1);
         numbers.print();
         System.out.println(numbers.indexOf(10));

         //Builtin Array
         ArrayList<Integer> list = new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(300);
         list.remove(0);
         System.out.println(list);
    }
}