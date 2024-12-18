package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    private String honor = "The Honored";
}

public class ExceptionCheckedUtil {
    static final Path FILE_PATH = Paths.get("/home/almaviva-linux/eu.txt");


    public URL createURL(String path) throws MalformedURLException {
    	return new URL(path);
    }

    public Date createDate(String date) throws ParseException {
    	//"2024-21-21"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        return dateFormat.parse(date);
    }

    public URI createURI(String path) throws URISyntaxException {
        return new URI(path);
        
    }

    public static void instantiateClass() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        AbstractExample instanceError = AbstractExample.class.getDeclaredConstructor().newInstance();
    }

    public <T> String getClassName(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        return clazz.getName();
    }

    public void setThreadTimeout(int value) throws InterruptedException, ExecutionException, TimeoutException {
        //30
    	ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            Thread.sleep(5000);
            return "Task completed";
        });
        future.get(value, TimeUnit.MILLISECONDS);
    }

    public void printFileContent() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH.toString()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
    }

    public void createFile(String path) throws IOException {
        Files.createFile(FILE_PATH);
    }

    public String accessClassField() throws NoSuchFieldException, SecurityException {
        NonCloneableExample example = new NonCloneableExample();
        Class<?> clazz = example.getClass();
        return clazz.getDeclaredField("age").toString();
    }
}
