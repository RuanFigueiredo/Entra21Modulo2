import java.util.Scanner;

public class Array {
    public static void main (String[] args){
        Scanner scan  = new Scanner(System.in);

        //vetores
        int[] notas = new int [3]; // vetor notas com 3 posições
        int tamNotas = notas.length;
        /*
        notas[0] = 10; // 1ª posição
        notas[1] = 8; // 2ª posição
        notas[2] = 9; // 3ª posição

        //visualisação de dados
        System.out.println("1ª nota: " + notas[0]);
        System.out.println("2ª nota: " + notas[1]);
        System.out.println("3ª nota: " + notas[2]);*/

        //inserção com FOR
        for(int i =0; i < tamNotas; i++){
            System.out.println((i+1)+"ª Nota: ");
            notas[i] = scan.nextInt();
        }




    }
}
