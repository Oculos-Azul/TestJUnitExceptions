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

	public void getObjectClass(Object object) {  
	    object.getClass();
	}

	public void printValueAtIndex(int value) {
	    int[] array = {1, 2, 4, 5, 6};
	    System.out.println(array[value]);
	}

	public void calculateDivision(int divisor, int dividend) {
	    int div0 = divisor / dividend;
	}

	public int parseStringToInt(String value) {
	    return Integer.parseInt(value);
	}

	public Integer castToInteger(Object obj) {
	    return (Integer) obj;
	}

	public String getValueFromListByIndex(int value) {
	    List<String> textList = new ArrayList<>();
	    textList.add("teste");
	    textList.add("foda");
	    textList.add("Samuel");
	    return textList.get(value);
	}

	public void removeValueFromListByIndex() throws Exception {
	    final List<String> myList = Arrays.asList("Item 1", "Item 2", "Item 3");
	    myList.remove(0);
	}

	public void removeValueFromListDuringLoop(int index) {
	    List<String> textList = new ArrayList<>();
	    textList.add("test");
	    textList.add("preenchimentoTeste");
	    textList.add("Teste");
	    textList.add("testePreenchimento");
	    for (String a : textList) {
	        textList.remove(index);
	    }
	}

	public void iterateNextElementInListLoop(int value) {
	    List<String> textList = new ArrayList<>();
	    textList.add("Tes");
	    textList.add("Te");
	    Iterator<String> iterator = textList.iterator();
	    for(int count =0; value >= count; count++) {
	        iterator.next();
	    }
	}

	public int[] createIntegerArray(int value) {
	    return new int[value];
	}

	public Scanner createScannerToReadFile(String path) throws FileNotFoundException {
	    return new Scanner(new File(path));
	}

	public char getCharByIndex(int value) {
	    String text = "Hello, World!";
	    return text.charAt(value);
	}

	public void removeTopFromStack() {
	    Stack<Integer> stack = new Stack<>();
	    stack.pop();
	}

	public void makeObjectWait(Object lock) throws InterruptedException {
	    lock.wait();
	}
}
