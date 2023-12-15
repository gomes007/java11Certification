package IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileDemo {

    public static void main(String[] args) {
        String directoryName = "myTestDirectory";
        String nestedDirectoryName = "myTestDirectory/nestedDirectory";
        String fileName = "myTestFile.txt";
        String copyFileName = "myTestFileCopy.txt";
        Path sourcePath = Paths.get("C:\\Users\\Paulo\\Desktop\\java 11 cert\\calculador", "myTestFile.txt");
        Path targetPath = Paths.get(directoryName, "myTestFileCopy.txt");

        moveFile(sourcePath.toString(), targetPath.toString());


        // Criar diretórios
        createDirectory(directoryName);
        createDirectory(nestedDirectoryName);

        // Escrever em um arquivo
        writeToFile(fileName, "Olá, Java 11 I/O!");

        // Ler de um arquivo
        readFile(fileName);

        // Copiar arquivo usando Streams com buffer
        copyFileUsingStreams(fileName, copyFileName);

        // Listar arquivos em um diretório
        listFilesInDirectory(directoryName);
    }

    private static void createDirectory(String dirName) {
        try {
            Files.createDirectories(Paths.get(dirName));
            System.out.println("Diretório criado: " + dirName);
        } catch (IOException e) {
            System.err.println("Erro ao criar diretório: " + e.getMessage());
        }
    }

    private static void writeToFile(String fileName, String content) {
        try {
            Files.writeString(Paths.get(fileName), content);
            System.out.println("Escrito no arquivo: " + fileName);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    private static void readFile(String fileName) {
        try {
            String content = Files.readString(Paths.get(fileName));
            System.out.println("Conteúdo do arquivo " + fileName + ":\n" + content);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static void copyFileUsingStreams(String sourceFileName, String destFileName) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFileName));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFileName))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Arquivo copiado para: " + destFileName);
        } catch (IOException e) {
            System.err.println("Erro ao copiar arquivo: " + e.getMessage());
        }
    }

    private static void listFilesInDirectory(String dirName) {
        try {
            List<Path> files = Files.list(Paths.get(dirName))
                    .collect(Collectors.toList());
            System.out.println("Arquivos em " + dirName + ":");
            files.forEach(file -> System.out.println(file.getFileName()));
        } catch (IOException e) {
            System.err.println("Erro ao listar arquivos: " + e.getMessage());
        }
    }

    private static void moveFile(String sourceFileName, String destFileName) {
        try {
            Files.move(Paths.get(sourceFileName), Paths.get(destFileName));
            System.out.println("Arquivo movido de " + sourceFileName + " para " + destFileName);
        } catch (IOException e) {
            System.err.println("Erro ao mover arquivo: " + e.getMessage());
        }
    }



}
