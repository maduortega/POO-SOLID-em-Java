package br.com.valueprojects.dominio;

public record EstimativaJava(double metrica, double produtividadeDesenvolvedorJunior) {

    @Override
    public String toString() {
        return "EstimativaJava{" +
                "metrica=" + metrica +
                ", produtividadeDesenvolvedorJunior=" + produtividadeDesenvolvedorJunior +
                '}';
    }
}
