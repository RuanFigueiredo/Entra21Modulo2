import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class TesteArrayListString {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        //Percorrendo o ArrayList adicionando 10 nomes.
        for(int i =0; i < 10; i++){
            System.out.print("Digite um nome: ");
            lista1.add(scan.next());
        }

        //Usando Foreach para avaliar se no nome contém menos de 3 caracteres, usando método length
        lista1.forEach(nome ->{
            if (nome.length() < 3) {
                lista2.add(nome);
            }
        });

        //Excluir elementos da lista 2 que tiver na lista 1
        lista1.removeAll(lista2);

        //Exibir a lista 1
        System.out.println(" --> LISTA 1");
        System.out.println("Tamanho: "+ lista1.size());
        for(String nome: lista1){
            System.out.println(nome);
        }
        // exibir a lista 2
        System.out.println(" --> LISTA 2");
        System.out.println("Tamanho: "+ lista2.size());
        for(String nome: lista2){
            System.out.println(nome);
        }

    }
}
