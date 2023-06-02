package teste;

public class Alimento {
    private Temperatura temperatura;

    public boolean temperaturaAdequada(int celsiuspro) {
        return temperatura.estaDentro (celsiuspro);
    }
}
