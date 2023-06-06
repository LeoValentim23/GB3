package teste;

public abstract class Alimento {
    private String nome;

    public Alimento(String nome) {
        this.nome = nome;
    }

    public abstract boolean temperaturaAdequada(int temperatura);


}

