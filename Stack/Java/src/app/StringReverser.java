package app;

import java.lang.reflect.Constructor;
import java.util.Stack;

/**
 * StringReverser
 */
public class StringReverser {

    public String reverse(String input) {
        if(input == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();

    }
}