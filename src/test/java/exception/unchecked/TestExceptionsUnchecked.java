package exception.unchecked;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import utils.ExceptionUncheckedUtil;

class TestExceptionsUnchecked {

    @Test
    void testNullPointException() {
        assertThrows(NullPointerException.class, ExceptionUncheckedUtil::throwNullPointerException);
    }

    @Test
    void testArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, ExceptionUncheckedUtil::throwArrayIndexOutOfBoundsException);
    }

    @Test
    void testArithmeticException() {
        assertThrows(ArithmeticException.class, ExceptionUncheckedUtil::throwArithmeticException);
    }

    @Test
    void testNumberFormatException() {
        assertThrows(NumberFormatException.class, ExceptionUncheckedUtil::throwNumberFormatException);
    }

    @Test
    void testClassCastException() {
        assertThrows(ClassCastException.class, ExceptionUncheckedUtil::throwClassCastException);
    }

    @Test
    void testIndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, ExceptionUncheckedUtil::throwIndexOutOfBoundsException);
    }

    @Test
    void testUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, ExceptionUncheckedUtil::throwUnsupportedOperationException);
    }

    @Test
    void testConcurrentModificationException() {
        assertThrows(ConcurrentModificationException.class, ExceptionUncheckedUtil::throwConcurrentModificationException);
    }

    @Test
    void testNoSuchElementException() {
        assertThrows(NoSuchElementException.class, ExceptionUncheckedUtil::throwNoSuchElementException);
    }

    @Test
    void testNegativeArraySizeException() {
        assertThrows(NegativeArraySizeException.class, ExceptionUncheckedUtil::throwNegativeArraySizeException);
    }

    @Test
    void testFileNotFoundException() {
        assertThrows(FileNotFoundException.class, ExceptionUncheckedUtil::throwFileNotFoundException);
    }

    @Test
    void testStringIndexOutOfBoundsException() {
        assertThrows(StringIndexOutOfBoundsException.class, ExceptionUncheckedUtil::throwStringIndexOutOfBoundsException);
    }

    @Test
    void testEmptyStackException() {
        assertThrows(EmptyStackException.class, ExceptionUncheckedUtil::throwEmptyStackException);
    }

    @Test
    void testIllegalMonitorStateException() {
        assertThrows(IllegalMonitorStateException.class, ExceptionUncheckedUtil::throwIllegalMonitorStateException);
    }
}
