package IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndPathsExample {
    public static void main(String[] args) {


        // Normalizar um Path
        Path pathWithDot = Paths.get("C:\\Users\\User\\Projects\\..\\Documents\\file.txt");
        Path pathWithDot1 = Paths.get("C:\\Users\\User\\Documents\\file.txt");
        Path normalizedPath = pathWithDot.normalize();
        Path normalizedPath2 = pathWithDot1.normalize();
        System.out.println("Path normalizado: " + normalizedPath);
        System.out.println("Path normalizado2: " + pathWithDot1);
    }
}

