public class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(Cliente cliente,double taxaJuros){
        super(cliente);
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
        setSaldo(getSaldo()+(getSaldo() * (taxaJuros / 100)));
    }
}