import java.sql.SQLOutput;

public class Corrente extends Conta{
    private double limiteChequeEspecial;

    public Corrente(double saldo,Cliente cliente,double limiteChequeEspecial) {
        super(saldo,cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void depositarCheque(double valor,String banco,String dataPag){
        if(valor>0){
            setSaldo(getSaldo()+valor);
            System.out.printf("Seu cheque do Banco %s no valor de R$%.2f no dia:%s\n",banco,valor,dataPag);
            //System.out.println("Seu cheque do Banco "+banco+" no valor de R$"+valor+" no dia "+dataPag);
        }else {
            System.out.println("Valor do cheque insuficiente para realizar deposito!Tente novamente com um valor" +
                    " maior que R$0.00");
        }
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo()>valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque realizado com sucesso!");
        }else if(getSaldo()+this.limiteChequeEspecial>valor){
            this.limiteChequeEspecial-=(valor-getSaldo());
            System.out.printf("Saque realizado com sucesso!Porem foi utilizado R$%.2f do seu Cheque Especial\n",(valor-getSaldo()));
            /*
             System.out.println("Saque realizado com sucesso!Porem foi utilizado R$"+(valor-getSaldo())+" do seu" +
                    " Cheque Especial");
            */
            setSaldo(0);
        }else {
            System.out.println("Saldo conjunto da Conta Corrente + Cheque Especial insuficente para realizar saque," +
                    "tente novamente com um valor menor ou faca um deposito aumentar seu saldo");
        }
    }
}
