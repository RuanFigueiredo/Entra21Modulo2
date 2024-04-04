// coleções ou collections

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main (String[] args){
        //Vetor convencional
        String[] nomes = new String[2];
        String[] sobrenomes = {"jario", "Silva"};



        //declarado collection arraylist
        ArrayList<String> Nomes = new ArrayList<>();
        ArrayList<String> SobreNomes = new ArrayList<>(Arrays.asList("jario", "Silva"));

        System.out.println(sobrenomes.length);
        System.out.println(SobreNomes.size());
        System.out.println(nomes.length);
        System.out.println(Nomes.size());

        // Adicionando os Nomes na lista
        Nomes.add("Ruan");
        Nomes.add("Mayara");
        Nomes.add("Melani");

        //tamanho do arraylist
        System.out.println(Nomes.size());
        Nomes.remove(0);

        System.out.println(Nomes.size());

        //pegando o elemento que está no índice 0
        System.out.println(Nomes.get(0));

        //verificando se está na lista de nomes o nome "Ruan"
        System.out.println(Nomes.contains("Melani"));

        // Trazendo todos os nomes da lista
        System.out.println(Nomes);

        System.out.println("FOR CONVENCIONAL");
        for(int i = 0; i < Nomes.size();i++){
            System.out.println(Nomes.get(i));
        }

        System.out.println("FOR LOOP");
        for(String nome : Nomes){
            System.out.println(nomeB);
        }

        System.out.println("MÉTODO FOR EACH");
        Nomes.forEach(nome -> System.out.println(nome));

    }
}
