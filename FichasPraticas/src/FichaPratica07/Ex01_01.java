package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01_01 {
    public static void usingScanner(String caminho) throws FileNotFoundException {

        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

 public static void main(String [] args) throws FileNotFoundException{
        usingScanner("File/exercicio_01.txt");
        System.out.println();

     usingScanner("File/exercicio_01_Alternativa01.txt");
     System.out.println();

     usingScanner("File/exercicio_01_Alternativa02.txt");
     System.out.println();

    }
}

