import java.sql.SQLOutput;

public class Corrente extends Conta{
    private double limiteChequeEspecial;

    public Corrente(Cliente cliente,double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void depositarCheque(Cheque cheque){
        if(cheque.getValor()>0){
            setSaldo(getSaldo()+cheque.getValor());
            System.out.printf("Seu cheque do Banco %s no valor de R$%.2f do dia:%s foi depositado com sucesso!\n",cheque.getBanco(),cheque.getValor(),cheque.getData());
            //System.out.println("Seu cheque do Banco "+banco+" no valor de R$"+valor+" no dia "+dataPag);
        }else {
            System.out.println("Valor do cheque insuficiente para realizar deposito!Tente novamente com um valor" +
                    " maior que R$0.00");
        }
    }

    @Override
    public void sacar(double valor) {
        double saldo = getSaldo();
        if (saldo>=valor){
            setSaldo(saldo-valor);
            System.out.println("Saque realizado com sucesso!");
        }else if(saldo+this.limiteChequeEspecial>=valor){
            double diferenca = valor-saldo;
            this.limiteChequeEspecial-=(diferenca);
            System.out.printf("Saque realizado com sucesso!Porem foi utilizado R$%.2f do seu Cheque Especial\n",diferenca);
            /*
             System.out.println("Saque realizado com sucesso!Porem foi utilizado R$"+(valor-saldo)+" do seu" +
                    " Cheque Especial");
            */
            setSaldo(-diferenca);
        }else {
            System.out.println("Saldo conjunto da Conta Corrente + Cheque Especial insuficente para realizar saque," +
                    "tente novamente com um valor menor ou faca um deposito para aumentar seu saldo");
        }
    }
}