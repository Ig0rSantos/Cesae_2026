package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {


    /**
     * Função que imprime um ficheiro na consola
     *
     * @param caminho Caminho para o ficheiro a ser impresso (com extensão: .txt, .csv, etc)
     * @throws FileNotFoundException O ficheiro não existe
     */
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    /**
     * Função que escreve, num ficheiro, algum conteúdo
     *
     * @param caminho  Caminho para o ficheiro a ser escrito
     * @param conteudo Conteúdo que queremos escrever
     * @throws FileNotFoundException Se o ficheiro existir apaga e escreve de novo | Se o ficheiro não existir, cria um novo
     */
    public static void escreverFicheiro(String caminho, String conteudo) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        PrintWriter pw = new PrintWriter(ficheiro);

        pw.println(conteudo);

        pw.close();
    }

    /**
     * Função que copia o conteúdo de um ficheiro para outro ficheiro
     *
     * @param caminhoOriginal Caminho do ficheiro original (que contém a informação)
     * @param caminhoCopia    Caminho do ficheiro cópia (onde queremos colocar a informação)
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static void copiarFicheiro(String caminhoOriginal, String caminhoCopia) throws FileNotFoundException {

        File ficheiroOriginal = new File(caminhoOriginal);
        Scanner sc = new Scanner(ficheiroOriginal);

        File ficheiroCopia = new File(caminhoCopia);
        PrintWriter pw = new PrintWriter(ficheiroCopia);

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            pw.println(linhaAtual);
        }

        pw.close();

    }

    /**
     * @param caminho
     * @return
     * @throws FileNotFoundException
     */
    public static int somarNumerosFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int total = 0;

        while (sc.hasNextInt()) {
            int numeroAtual = sc.nextInt();
            total += numeroAtual;
        }

        return total;

    }

    /**
     * Função que lê o número de linhas de um ficheiro
     *
     * @param caminho Conteúdo que queremos ler
     * @return número de linhas de um ficheiro txt
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     */
    public static int contarNumeroLinhas(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int numeroLinhas = 0;

        while (sc.hasNextLine()) {
            numeroLinhas++;
            sc.nextLine();
        }
        return numeroLinhas;
    }

    /**
     * Função que lê o número de palavras de um ficheiro
     *
     * @param caminho Conteúdo que queremos ler
     * @return número de palavras existentes num ficheiro txt
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     */
    public static int contarNumeroPalavras(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int numeroPalavras = 0;

        while (sc.hasNext()) {
            numeroPalavras++;
            sc.next();
        }
        return numeroPalavras;
    }

    /**
     * Função que lê o conteúdo de um ficheiro para uma matriz, excluindo cabeçalho
     *
     * @param caminho Caminho para o ficheiro
     * @param s
     * @return Matriz (String) c/ o conteúdo do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarNumeroColunas(String caminho, String s) throws FileNotFoundException {


        int numeroColunas = 0;

        Scanner sc = null;
        while (sc.hasNextInt()) {
            numeroColunas++;
            sc.nextLine();
        }
        return numeroColunas;

    }


    /**
     * Função que lê valores de posições especificas num ficheiro csv
     *
     * @param caminho dados que vão ser lidos dentro do ficheiro
     * @return Valor total das vendas
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     */
    public static double lerValores(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        double totalLinha, totalVendas = 0;

        // avançar o cabeçalho
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            totalLinha = Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);
            totalVendas += totalLinha;
        }
        return totalVendas;
    }

    /**
     * Função que lê o conteudo de um ficheiro para uma matriz, excluindo o cabeçalho
     *
     * @param caminho caminho para o ficheiro
     * @return matriz string com o conteudo do ficheiro
     * @throws FileNotFoundException caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminho) throws FileNotFoundException {


        int numeroLinhasFicheiro = contarNumeroLinhas(caminho);
        int numeroColunasFicheiro = contarNumeroColunas(caminho, ",");

        String[][] matrizMusicas = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];


        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // avançar o cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {

            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            for (int i = 0; i < linhaSeparada.length; i++) {
                matrizMusicas[linhaPreencher][i] = linhaSeparada[i];
            }
            linhaPreencher++;
        }
        return matrizMusicas;
    }

    /**
     * Função que imprime uma matriz na consola
     *
     * @param matriz Matriz a ser impressa
     */
    public static void imprimirMatriz(String[][] matriz) {

        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t | ");
            }
            System.out.println();
        }
    }

    /**
     * @param matriz
     */

    public static void pesquisarMusicasGenero(String[][] matriz, String genero) {

        System.out.println("Músicas de " + genero);

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][2].equals(genero)) {
                System.out.println(matriz[linha][1] + " | " + matriz[linha][0]);
            }

        }
    }
}

