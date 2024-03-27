import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        int [][] matriz;

        matriz = new int [3][3];

        matriz[0][2] = 5;

        for (int linha = 0; linha < 3;linha++){
            for (int coluna =0; coluna < 3; coluna ++){
                matriz[linha][coluna] =  linha + coluna;
                System.out.println(matriz[linha][coluna]);
            }
        }
    }
}
