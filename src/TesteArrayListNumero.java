import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            numeros.add(scan.nextInt());
        }

        if(numeros.contains(10) || numeros.contains(100) || numeros.contains(1000)){
            System.out.println("Você ganhou um voucher de R$ 50,00!!");
        }
    }
}
