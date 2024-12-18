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

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNullPointerException() {
        thrown.expect(NullPointerException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.getObjectClass(null);
    }

    @Test
    public void testArrayIndexOutOfBoundsException() {
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.printValueAtIndex(6);
    }

    @Test
    public void testArithmeticException() {
        thrown.expect(ArithmeticException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.calculateDivision(1, 0);
    }

    @Test
    public void testNumberFormatException() {
        thrown.expect(NumberFormatException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.parseStringToInt("ABC");
    }

    @Test
    public void testClassCastException() {
        thrown.expect(ClassCastException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.castToInteger("Hello World");
    }

    @Test
    public void testIndexDoesNotExist() {
        thrown.expect(IndexOutOfBoundsException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.getValueFromListByIndex(8);
    }

    @Test
    public void testUnsupportedOperationException() throws Exception {
        thrown.expect(UnsupportedOperationException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.removeValueFromListByIndex();
    }

    @Test
    public void testConcurrentModificationException() {
        thrown.expect(ConcurrentModificationException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.removeValueFromListDuringLoop(1);
    }

    @Test
    public void testNoSuchElementException() {
        thrown.expect(NoSuchElementException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.iterateNextElementInListLoop(3);
    }

    @Test
    public void testNegativeArraySizeException() {
        thrown.expect(NegativeArraySizeException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.createIntegerArray(-1);
    }

    @Test
    public void testFileNotFoundException() throws FileNotFoundException {
        thrown.expect(FileNotFoundException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.createScannerToReadFile("/invalid/path/to/file.txt");
    }

    @Test
    public void testStringIndexOutOfBoundsException() {
        thrown.expect(StringIndexOutOfBoundsException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.getCharByIndex(20);
    }

    @Test
    public void testEmptyStackException() {
        thrown.expect(EmptyStackException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.removeTopFromStack();
    }

    @Test
    public void testIllegalMonitorStateException() throws InterruptedException {
        thrown.expect(IllegalMonitorStateException.class);
        ExceptionUncheckedUtil uncheckedUtil = new ExceptionUncheckedUtil();
        uncheckedUtil.makeObjectWait(new Object());
    }
}
