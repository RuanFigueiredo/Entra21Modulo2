public class ContaBanco {
    public static void main (String[] args){

        //polimorfismo
        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaPagamentos();


        c1.nome = "Ruan";
        c1.numConta = 1;

        c2.nome = "Arnold Shwaznegar";
        c2.numConta = 3;

        c1.depositar(50);
        c2.depositar(50);

        System.out.println("saldo c1 é: R$"+ c1.getSaldo());
        System.out.println("saldo c2 é: R$"+ c2.getSaldo());

        // Aqui vai implementar o método sacar da classe filha
        c1.sacar(20);
        c2.sacar(20);
        System.out.println("valor atualizado, saldo: R$ "+ c1.getSaldo());
        System.out.println("valor atualizado, saldo: R$ "+ c2.getSaldo());






    }
}

class Conta {
    public String nome;
    public int numConta;
    private double saldo;
    protected double taxaSaque = 1.0;


    public boolean depositar(double valor){
        this.saldo += valor;
        return true;
    }

    public boolean sacar (double valor){
        if(valor + this.taxaSaque <= this.saldo ){
            //permite saque
            this.saldo  = this.saldo -valor - this.taxaSaque;
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


//herança
class ContaPagamentos extends Conta {
    public boolean sacar(double valor){
        super.taxaSaque=2.0;
        return super.sacar(valor);
    }
}

class ContaPoupanca extends Conta {
    public boolean sacar(double valor){
        super.taxaSaque=0.50;
        return super.sacar(valor);
    }

// Parabéns! VOCÊ VIU UM EXEMPLO PRÁTICO DE ABSTRAÇÃO.
}

