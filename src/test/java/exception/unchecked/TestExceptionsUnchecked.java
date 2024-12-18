package exception.unchecked;

import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import utils.ExceptionUncheckedUtil;

public class TestExceptionsUnchecked {

    ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testPassNullObject() {
        thrown.expect(NullPointerException.class);
        uncheckedUtil.getObjectClass(null);
    }

    @Test
    public void testNonExistentIndex() {
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        uncheckedUtil.printValueAtIndex(6);
    }

    @Test
    public void testDivisionByZero() {
        thrown.expect(ArithmeticException.class);
        uncheckedUtil.calculateDivision(1, 0);
    }

    @Test
    public void testConvertLetterToInteger() {
        thrown.expect(NumberFormatException.class);
        uncheckedUtil.parseStringToInt("ABC");
    }

    @Test
    public void testObjectCastingToInteger() {
        thrown.expect(ClassCastException.class);
        uncheckedUtil.castToInteger("Hello World");
    }

    @Test
    public void testIndexDoesNotExist() {
        thrown.expect(IndexOutOfBoundsException.class);
        uncheckedUtil.getValueFromListByIndex(8);
    }

    @Test
    public void testModifyFinalList() throws Exception {
        thrown.expect(UnsupportedOperationException.class);
        uncheckedUtil.removeValueFromListByIndex();
    }

    @Test
    public void testRemoveItemFromListDuringLoop() {
        thrown.expect(ConcurrentModificationException.class);
        uncheckedUtil.removeValueFromListDuringLoop(1);
    }

    @Test
    public void testIterateNextNonExistentElement() {
        thrown.expect(NoSuchElementException.class);
        uncheckedUtil.iterateNextElementInListLoop(3);
    }

    @Test
    public void testNegativeArraySize() {
        thrown.expect(NegativeArraySizeException.class);
        uncheckedUtil.createIntegerArray(-1);
    }

    @Test
    public void testPassingNonExistentFile() throws FileNotFoundException {
        thrown.expect(FileNotFoundException.class);
        uncheckedUtil.createScannerToReadFile("/euqui.txt");
    }

    @Test
    public void testAccessingNonExistentStringIndex() {
        thrown.expect(StringIndexOutOfBoundsException.class);
        uncheckedUtil.getCharByIndex(20);
    }

    @Test
    public void testRemoveItemFromEmptyStack() {
        thrown.expect(EmptyStackException.class);
        uncheckedUtil.removeTopFromStack();
    }

    @Test
    public void testMakeObjectWait() throws InterruptedException {
        thrown.expect(IllegalMonitorStateException.class);
        uncheckedUtil.makeObjectWait(new Object());
    }
}
