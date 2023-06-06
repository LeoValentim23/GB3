package doaçao;

public class DEmpresa extends Doaçao {
    private String nomeEmpresa;

    public DEmpresa(String nomeEmpresa, double quantidade) {
        super(quantidade);
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }


}
