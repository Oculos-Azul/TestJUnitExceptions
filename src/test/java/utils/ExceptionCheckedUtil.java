package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class AbstractExample {}

class NonCloneableExample {
    private String honor = "O Honrado";
}

public class ExceptionCheckedUtil {

    static final Path FILE_PATH = Paths.get("/home/almaviva-linux/eu.txt");

    public static void throwMalformedURLException() throws MalformedURLException {
        URL invalidUrl = new URL("htp://www.exemplo.com");
    }

    public static void throwParseException() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        Date date = dateFormat.parse("2024-21-21");
    }

    public static void throwURISyntaxException() throws URISyntaxException {
        URI invalidUri = new URI("ht tp://example.com");
    }

    public static void throwInstantiationException() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        AbstractExample instanceError = AbstractExample.class.getDeclaredConstructor().newInstance();
    }

    public static void throwClassNotFoundException() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.Class");
    }

    public static void throwTimeoutException() throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            Thread.sleep(5000);
            return "Tarefa concluída";
        });
        future.get(30, TimeUnit.MILLISECONDS);
    }

    public static void throwIOException() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH.toString()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void throwFileAlreadyExistsException() throws IOException {
        Files.createFile(FILE_PATH);
    }

    public static void throwNoSuchFieldException() throws NoSuchFieldException, SecurityException {
        NonCloneableExample example = new NonCloneableExample();
        Class<?> clazz = example.getClass();
        Field field = clazz.getDeclaredField("age");
    }

    public static void throwIllegalAccessException() throws NoSuchFieldException, SecurityException, IllegalAccessException {
        NonCloneableExample example = new NonCloneableExample();
        Class<?> clazz = example.getClass();
        Field field = clazz.getDeclaredField("honor");
        field.setAccessible(false);
    }
}
