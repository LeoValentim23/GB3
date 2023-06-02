package teste;

public class Morango extends Alimento {
    public Morango() {
        super("Morango");
    }

    @Override
    public boolean temperaturaAdequada(int temperatura) {
        return temperatura >= 5 && temperatura <= 15;
    }
}