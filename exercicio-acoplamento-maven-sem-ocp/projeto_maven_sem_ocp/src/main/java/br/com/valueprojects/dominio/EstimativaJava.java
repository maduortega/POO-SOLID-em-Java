package br.com.valueprojects.dominio;

// As finals se tornam apenas atributos no construtor record
// Se eu só tenho uma responsabilidade, eu posso utilizar record
public record EstimativaJava(double metrica, double produtividadeDesenvolvedorJunior) {

    @Override
    public String toString() {
        return "EstimativaJava{" +
                "metrica=" + metrica +
                ", produtividadeDesenvolvedorJunior=" + produtividadeDesenvolvedorJunior +
                '}';
    }
}
