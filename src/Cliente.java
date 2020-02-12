public class Cliente {
    private int nCliente;
    private String sobrenome;
    private String rg;
    private String cpf;

    public Cliente(){

    }

    public Cliente(int nCliente, String sobrenome, String rg, String cpf) {
        this.nCliente = nCliente;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getnCliente() {
        return nCliente;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}