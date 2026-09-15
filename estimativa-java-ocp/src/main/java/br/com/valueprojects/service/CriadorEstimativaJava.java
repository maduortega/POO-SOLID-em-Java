package br.com.valueprojects.service;

import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;

public class CriadorEstimativaJava {
    private final CalculadoraProdutividade calculadoraProdutividade;
    private final NotificadorEstimativa notificadorEstimativa;
    private final EstimativaRepository estimativaRepository;

    public CriadorEstimativaJava(CalculadoraProdutividade calculadoraProdutividade,
                                 NotificadorEstimativa notificadorEstimativa,
                                 EstimativaRepository estimativaRepository) {
        this.calculadoraProdutividade = calculadoraProdutividade;
        this.notificadorEstimativa = notificadorEstimativa;
        this.estimativaRepository = estimativaRepository;
    }

    public EstimativaJava cria(Tarefa tarefa) {
        double metrica = tarefa.metricaTarefa();
        double produtividade = calculadoraProdutividade.calcular(metrica);

        EstimativaJava estimativaJava = new EstimativaJava(metrica, produtividade);

        notificadorEstimativa.notificar(estimativaJava);
        estimativaRepository.salvar(estimativaJava);

        return estimativaJava;
    }
}
