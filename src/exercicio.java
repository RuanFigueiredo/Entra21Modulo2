import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        /* Escreva um algoritmo  que leia  um número não determinado de valores e
        calcule a média aritmética dos valores lidos, a quantidade de valores positivos
        e a quantidade de valores negativos. mostre os resultados.
         */

        Scanner scan = new Scanner(System.in);

        int valor  = 1, soma = 0, qtdPos = 0, qtdNeg = 0;

        do{
            System.out.println("Digite um número:");
            valor  = scan.nextInt();

            soma += valor;

            if (valor >=0)
                qtdPos++;

            if(valor<=0)
                qtdNeg++;

        } while(valor !=0);

        System.out.printf("Média %d \nQuantidade Positivo %d\n Quantidade negativo %d", soma/(qtdPos+qtdNeg),
                qtdPos, qtdNeg);

    }
}