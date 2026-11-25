package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.copiarFicheiro;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        copiarFicheiro("File/exercicio_03.txt","File/exercicio_03_copia.txt");

    }
}
