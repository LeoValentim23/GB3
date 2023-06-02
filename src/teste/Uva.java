package teste;

public class Uva extends Alimento {
    public Uva() {
        super("Uva");
    }

    @Override
    public boolean temperaturaAdequada(int temperatura) {
        return temperatura >= 10 && temperatura <= 20;
    }
}