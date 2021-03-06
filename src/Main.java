public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente(1,"Tavares","50050","505051");
        Cliente pedro = new Cliente(2,"Silva","9182873","904922");
        Poupanca poupancaJoao = new Poupanca(joao,10);
        Corrente correntePedro = new Corrente(pedro,1000);
        Cheque cheque = new Cheque(500,"Santader","12/02/2020");

        poupancaJoao.depositar(100);
        poupancaJoao.recolherJuros();
        poupancaJoao.sacar(1000);
        poupancaJoao.consultarSaldo();

        System.out.printf("\n\n");

        correntePedro.depositar(200);
        correntePedro.depositarCheque(cheque);
        correntePedro.sacar(700);
        correntePedro.sacar(2000);
        correntePedro.consultarSaldo();
        System.out.printf("R$%.2f\n",correntePedro.getLimiteChequeEspecial());
    }
}