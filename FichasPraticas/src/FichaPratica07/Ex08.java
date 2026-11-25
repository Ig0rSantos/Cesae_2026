package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.lerValores;

public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(" total de vendas é de: " + lerValores("File/exercicio_08.csv") + "€" );

    }

}
