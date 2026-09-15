package br.com.valueprojects.dominio;

public record Tarefa(int idTarefa, String descricaoTarefa, double metricaTarefa) {

    @Override
    public String toString() {
        return "Tarefa{" +
                "idTarefa=" + idTarefa +
                ", descricaoTarefa='" + descricaoTarefa + '\'' +
                ", metricaTarefa=" + metricaTarefa +
                '}';
    }
}
