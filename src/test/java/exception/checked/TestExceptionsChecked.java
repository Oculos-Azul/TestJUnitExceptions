package exception.checked;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import utils.ExceptionCheckedUtil;

public class TestExceptionsChecked {
    static final String ERROR_PATH = "ht tp://www.example.com";
    static ExceptionCheckedUtil exceptionCheckedUtil = new ExceptionCheckedUtil();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testMalformedURLException() throws MalformedURLException {
        thrown.expect(MalformedURLException.class);
        exceptionCheckedUtil.createURL(ERROR_PATH);
    }

    @Test
    public void testParseException() throws ParseException {
        thrown.expect(ParseException.class);
        exceptionCheckedUtil.createDate("2024-21-21");
    }

    @Test
    public void testURISyntaxException() throws URISyntaxException {
        thrown.expect(URISyntaxException.class);
        exceptionCheckedUtil.createURI(ERROR_PATH);
    }

    @Test
    public void testInstantiationException() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        thrown.expect(InstantiationException.class);
        exceptionCheckedUtil.instantiateClass();
    }

    @Test
    public void testClassNotFoundException() throws ClassNotFoundException {
        thrown.expect(ClassNotFoundException.class);
        exceptionCheckedUtil.getClassName("com.Class");
    }

    @Test
    public void testTimeoutException() throws InterruptedException, ExecutionException, TimeoutException {
        thrown.expect(TimeoutException.class);
        exceptionCheckedUtil.setThreadTimeout(30);
    }

    @Test
    public void testIOException() throws IOException {
        thrown.expect(IOException.class);
        exceptionCheckedUtil.printFileContent();
    }

    @Test
    public void testFileAlreadyExistsException() throws IOException {
        thrown.expect(IOException.class);
        exceptionCheckedUtil.createFile("/home/almaviva-linux/eu.txt");
    }

    @Test
    public void testNoSuchFieldException() throws NoSuchFieldException, SecurityException {
        thrown.expect(NoSuchFieldException.class);
        exceptionCheckedUtil.accessClassField();
    }
}
