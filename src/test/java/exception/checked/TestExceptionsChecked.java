package exception.checked;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.nio.file.FileAlreadyExistsException;
import java.text.ParseException;
import java.util.concurrent.TimeoutException;

import org.junit.jupiter.api.Test;

import utils.ExceptionCheckedUtil;

class TestExceptionsChecked {
	
	@Test
	void testMalformedURLException() {
		assertThrows(MalformedURLException.class, ExceptionCheckedUtil::throwMalformedURLException);
	}
	
	@Test
	void testParseException() {
		assertThrows(ParseException.class, ExceptionCheckedUtil::throwParseException);
	}
	
	@Test
	void testURISyntaxException() {
		assertThrows(URISyntaxException.class, ExceptionCheckedUtil::throwURISyntaxException);
	}
	
	@Test
	void testInstantiationException() {
		assertThrows(InstantiationException.class, ExceptionCheckedUtil::throwInstantiationException);
	}
	
	@Test
	void testClassNotFoundException() {
		assertThrows(ClassNotFoundException.class, ExceptionCheckedUtil::throwClassNotFoundException);
	}
	
	@Test
	void testTimeoutException() {
		assertThrows(TimeoutException.class, ExceptionCheckedUtil::throwTimeoutException);
	}
	
	@Test
	void testIOException() {
		assertThrows(IOException.class, ExceptionCheckedUtil::throwIOException);
	}
	
	@Test
	void testFileAlreadyExistsException() {
		assertThrows(FileAlreadyExistsException.class, ExceptionCheckedUtil::throwFileAlreadyExistsException);
	}
	
	@Test
	void testNoSuchFieldException() {
		assertThrows(NoSuchFieldException.class, ExceptionCheckedUtil::throwNoSuchFieldException);
	}
	
	@Test
	void testIllegalAccessException() {
		assertThrows(IllegalAccessException.class, ExceptionCheckedUtil::throwIllegalAccessException);
	}
}
