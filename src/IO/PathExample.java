package IO;

import java.io.IOException;
import java.nio.file.Path;

public class PathExample {

    public static void main(String[] args) throws IOException {

        var path1 = Path.of("a.txt");
        var path2 = Path.of("b/c.txt");


        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));


        Path p = Path.of("mango");
        p.resolve("apple");
        Path p2 = p.resolve("guava");

        System.out.println(p2 + " " + p);


        // Create a path with redundant elements
        Path pathWithRedundancies = Path.of("folder1", ".", "folder2", "..", "folder3", "file.txt");

        // Print the original path
        System.out.println("Original Path: " + pathWithRedundancies);

        // Normalize the path
        Path normalizedPath = pathWithRedundancies.normalize();

        // Print the normalized path
        System.out.println("Normalized Path: " + normalizedPath);

        var pp1 = Path.of("/a/../b.txt");
        System.out.println("Normalized Path pp: " + pp1.normalize());


        /*
        Path root = Path.of("root");
        Path b = Path.of("root/a/b");
        Path c = Path.of("root/c");
        Files.createDirectories(b);
        Files.createDirectory(c);
        Files.walk(root).forEach(System.out::println);

         */

        Path ppp1 = Path.of("/a/b");
        Path ppp2 = Path.of("/a/c");

        System.out.println(ppp1.resolve(ppp2));




    }

}
