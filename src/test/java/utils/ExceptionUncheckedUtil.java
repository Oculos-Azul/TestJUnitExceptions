package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ExceptionUncheckedUtil {

    public static void throwNullPointerException() {
        Object text = null;
        text.getClass();
    }

    public static void throwArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 4, 5, 6};
        System.out.println(array[6]);
    }

    public static void throwArithmeticException() {
        int div0 = 1 / 0;
    }

    public static void throwNumberFormatException() {
        int div0 = Integer.parseInt("ABC");
    }

    public static void throwClassCastException() {
        Object obj = "Hello World";
        Integer inte = (Integer) obj;
    }

    public static void throwIndexOutOfBoundsException() {
        List<String> textList = new ArrayList<>();
        textList.add("teste");
        textList.get(2);
    }

    public static void throwUnsupportedOperationException() {
        final List<String> myList = Arrays.asList("Item 1", "Item 2", "Item 3");
        myList.remove(0);
    }

    public static void throwConcurrentModificationException() {
        List<String> textList = new ArrayList<>();
        textList.add("test");
        textList.add("preenchimentoTeste");
        textList.add("Teste");
        textList.add("testePreenchimento");
        for (String a : textList) {
            textList.remove(1);
        }
    }

    public static void throwNoSuchElementException() {
        List<String> textList = new ArrayList<>();
        textList.add("Tes");
        textList.add("Te");
        Iterator<String> iterator = textList.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
    }

    public static void throwNegativeArraySizeException() {
        int[] array = new int[-1];
    }

    public static void throwFileNotFoundException() throws FileNotFoundException {
        new Scanner(new File("/euaqui.txt"));
    }

    public static void throwStringIndexOutOfBoundsException() {
        String text = "Hello, World!";
        text.charAt(20);
    }

    public static void throwEmptyStackException() {
        Stack<Integer> stack = new Stack<>();
        stack.pop();
    }

    public static void throwIllegalMonitorStateException() throws InterruptedException {
        Object lock = new Object();
        lock.wait();
    }
}
