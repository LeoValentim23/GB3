package teste;

public class Alface extends Alimento {
    public Alface() {
        super("Alface");
    }

    @Override
    public boolean temperaturaAdequada(int temperatura) {
        return temperatura >= 2 && temperatura <= 8;
    }
}
