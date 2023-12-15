package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {

    public static void main(String[] args) throws IOException {

        Path p = Path.of("test.txt");
        Files.writeString(p, "Hello World");
        Files.writeString(p, "Goodbye World");
        System.out.println(Files.readString(p));

    }

}
