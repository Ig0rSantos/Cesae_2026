package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.escreverFicheiro;

public class Ex02 {
    public static void main(String[] args) throws FileNotFoundException {

        escreverFicheiro("File/exercicio_02.txt","Será que isto funciona?");

    }
}