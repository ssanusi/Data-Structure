package app;


public class App {
    public static void main(String[] args) throws Exception {
        String str = "abcd";

        StringReverser reverser = new StringReverser();
        String result = reverser.reverse(str);
        System.out.println(result);

        String strExp = "(1 + 2)";
        Expression exp = new Expression();
        var resultExp = exp.isBalance(strExp);
        System.out.println(resultExp);


        Stack stack =  new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());



    }
}