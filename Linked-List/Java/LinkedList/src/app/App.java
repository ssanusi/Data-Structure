package app;


public class App {
    public static void main(String[] args) throws Exception {

        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.reverse();
        System.out.println(list);

    }
}