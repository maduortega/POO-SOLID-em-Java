package br.com.valueprojects.dominio;

import br.com.valueprojects.dao.EstimativaJavaDao;
import br.com.valueprojects.infra.EmissorDeSms;

public class CriadorEstimativaJava {
    private final EmissorDeSms sms;
    private final EstimativaJavaDao dao;

    public CriadorEstimativaJava(EmissorDeSms sms, EstimativaJavaDao dao) {
        this.sms = sms;
        this.dao = dao;
    }

    public EstimativaJava cria(Tarefa tarefa) {
        double metrica = tarefa.getMetricaTarefa();

        EstimativaJava estJava = new EstimativaJava(
                metrica,
                produtividadeDesenvolvedorJunior(metrica)
        );

        sms.emitirSms(estJava);
        dao.insere(estJava);

        return estJava;
    }

    private double produtividadeDesenvolvedorJunior(double metrica) {
        return metrica * 0.04;
    }
}
