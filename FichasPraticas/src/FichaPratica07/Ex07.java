package FichaPratica07;
import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.*;
import static FichaPratica07.BibliotecaFicheiros.contarNumeroPalavras;
import static FichaPratica07.BibliotecaFicheiros.contarNumeroLinhas;

public class Ex07 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Numero de linhas: "+ contarNumeroLinhas("File/exercicio_07.txt"));
        System.out.println("Numero de palavras: "+  contarNumeroPalavras("File/exercicio_07.txt"));

    }
}

