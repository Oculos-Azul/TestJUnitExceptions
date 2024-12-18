package exception.checked;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.FileAlreadyExistsException;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import utils.ExceptionCheckedUtil;

public class TestExceptionsChecked {
	ExceptionCheckedUtil exceptionCheckedUtil = new ExceptionCheckedUtil();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testMalformedURLException() throws MalformedURLException {
        thrown.expect(MalformedURLException.class);
        exceptionCheckedUtil.throwMalformedURLException();
    }

    @Test
    public void testParseException() throws ParseException {
        thrown.expect(ParseException.class);
        exceptionCheckedUtil.throwParseException();
    }

    @Test
    public void testURISyntaxException() throws URISyntaxException {
        thrown.expect(URISyntaxException.class);
        exceptionCheckedUtil.throwURISyntaxException();
    }

    @Test
    public void testInstantiationException() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        thrown.expect(InstantiationException.class);
        exceptionCheckedUtil.throwInstantiationException();
    }

    @Test
    public void testClassNotFoundException() throws ClassNotFoundException {
        thrown.expect(ClassNotFoundException.class);
        exceptionCheckedUtil.throwClassNotFoundException();
    }

    @Test
    public void testTimeoutException() throws InterruptedException, ExecutionException, TimeoutException {
        thrown.expect(TimeoutException.class);
        exceptionCheckedUtil.throwTimeoutException();
    }

    @Test
    public void testIOException() throws IOException {
        thrown.expect(IOException.class);
        exceptionCheckedUtil.throwIOException();
    }

    @Test
    public void testFileAlreadyExistsException() throws IOException {
        thrown.expect(FileAlreadyExistsException.class);
        exceptionCheckedUtil.throwFileAlreadyExistsException();
    }

    @Test
    public void testNoSuchFieldException() throws NoSuchFieldException, SecurityException {
        thrown.expect(NoSuchFieldException.class);
        exceptionCheckedUtil.throwNoSuchFieldException();
    }

    @Test
    public void testIllegalAccessException() throws NoSuchFieldException, SecurityException, IllegalAccessException {
        thrown.expect(IllegalAccessException.class);
        exceptionCheckedUtil.throwIllegalAccessException();
    }
}
