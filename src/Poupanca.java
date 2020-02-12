public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(double saldo,Cliente cliente,double taxaJuros){
        super(saldo,cliente);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void recolherJuros(){
        System.out.printf("Voce recolheu este mes R$%.2f em juros\n",(getSaldo()*(taxaJuros/100)));

    }
}