package stream;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {

        File file = new File("files\\testFile.txt");

        if( !file.exists()) {

            boolean fileCreated = file.createNewFile();
            System.out.println("Wynik utworzenia pliku" +  fileCreated);
        }else{ System.out.println("plik już istnieje");

        System.out.println();}}}
