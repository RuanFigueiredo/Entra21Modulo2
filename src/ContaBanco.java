public class ContaBanco {
    public static void main (String[] args){

        Conta c1 = new Conta();
        Conta c2 = new Conta();


        c1.nome = "Ruan";
        c1.numConta = 1;

        c2.nome = "Arnold Shwaznegar";
        c2.numConta = 3;

        System.out.println("o nome do cliente é: " + c1.nome + " e o nº da sua conta é: "+ c1.numConta);
        System.out.println(c1.getSaldo());

        c1.depositar(50);
        System.out.println(c1.getSaldo());

        c1.sacar(20);
        System.out.println("após saque: "+c1.getSaldo());


        System.out.println(c2.nome);
        System.out.println(c2.getSaldo());
        c2.depositar(50);
        System.out.println(c2.getSaldo());

        if(c2.transferir(c1,100)==true){
            System.out.println("transferência realizada");
        }else {
            System.out.println("saldo insuficiente para depósito");
        }

        System.out.println("saldo de c2 após transferência: "+ c2.getSaldo());
        System.out.println("saldo de c1 após a transferência: " + c1.getSaldo());

    }
}

class Conta {
    public String nome;
    public int numConta;
    private double saldo;

    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    public boolean sacar (double valor){
        if(valor <= this.saldo ){
            //permite saque
            this.saldo  = this.saldo -valor;
            return true;
        } else {
            // não permite saque
            return false;
        }
    }

    public double getSaldo(){

        return this.saldo;
    }

    public boolean transferir(Conta contaDestino, double  valor){
        if(this.sacar(valor)== true){
            contaDestino.depositar(valor);
            return true;
        }else {
            return false;
        }
    }
}
