public class Conta {
    private double saldo=0;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double valor){
        if(valor>0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        }else {
            System.out.println("Valor invalido!Para depositar,informe um valor maior que R$0.00");
        }
    }

    public void sacar(double valor){
        if(this.saldo>valor){
            this.saldo-=valor;
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficente para realizar saque! Tente novamente com um valor menor ou faça um " +
                    "deposito para aumentar seu saldo");
        }
    }

    public void consultarSaldo(){
        System.out.printf("Seu saldo atual é de:R$%.2f\n",getSaldo());
    }
}