package doaçao;

public class DPessoa extends Doaçao {
    private String nome;

    public DPessoa(String nome, double quantidade) {
        super(quantidade);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}