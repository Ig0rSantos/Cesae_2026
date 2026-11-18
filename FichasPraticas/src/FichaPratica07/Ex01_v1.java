package FichaPratica07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Ex01_v1 {


        public static void main(String[] args) {
            Path caminho = Path.of("/File/abc02.txt");

            try {
                Files.createFile(caminho);
                System.out.println("Ficheiro criado com sucesso!");
            } catch (IOException e) {
                System.out.println("O ficheiro já existe ou ocorreu um erro.");
            }
        }
}

