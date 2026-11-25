package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex01 {

    public static void usingScanner() throws FileNotFoundException{

        String fileContent = "Hello! Estou a estudar Java!";

            // Define o caminho e o nome do ficheiro (ex: "abc01.txt" na pasta do projeto)
            File file = new File("File/Ex01.txt");
            PrintWriter printWriter = new PrintWriter(file); //nome do ficheiro que foi aberto na linha 15 com o nome file


        printWriter.println(fileContent);
        printWriter.println("Este é o meu primeiro ficheiro!");

        printWriter.close();

        }

        // chamar a função escrita acima
        public static void main(String[] args) throws FileNotFoundException{
            usingScanner();
            System.out.println("Ficheiro criado com sucesso!");
        }
    }

