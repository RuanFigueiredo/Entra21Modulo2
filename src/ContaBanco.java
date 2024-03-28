public class ContaBanco {
    public static void main (String[] args){

        Conta c1 = new Conta();
        Conta c2 = new Conta();


        c1.nome = "Ruan";
        c1.numConta = 1;

        c2.nome = "Arnold Shwaznegar";
        c2.numConta = 3;

        System.out.println("o nome do cliente é: " + c2.nome + "e o número da conta é: "+ c2.numConta);

    }
}

class Conta {
    public String nome;
    public int numConta;
    private double saldo;
}
