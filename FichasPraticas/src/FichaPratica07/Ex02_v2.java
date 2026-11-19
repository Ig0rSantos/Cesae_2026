package FichaPratica07;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex02_v2 {

        public static void usingScanner() throws IOException {
            File file = new File("File/abc04.txt");

            // Garante que a pasta "File" existe
            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs();
            }

            // Cria o ficheiro vazio se ainda não existir
            if (file.createNewFile()) {
                System.out.println("Ficheiro criado em: " + file.getAbsolutePath());
            }

            try (Scanner sc = new Scanner(file)) {
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            }
        }

        public static void main(String[] args) throws IOException {
            usingScanner();
        }
    }
