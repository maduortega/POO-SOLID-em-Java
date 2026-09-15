package br.com.valueprojects.app;

import br.com.valueprojects.dao.EstimativaJavaDao;
import br.com.valueprojects.dominio.CriadorEstimativaJava;
import br.com.valueprojects.dominio.EstimativaJava;
import br.com.valueprojects.dominio.Tarefa;
import br.com.valueprojects.infra.EmissorDeSms;

public class Main {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        tarefa.setIdTarefa(1);
        tarefa.setDescricaoTarefa("Criar API de cadastro de clientes");
        tarefa.setMetricaTarefa(120.0);

        EmissorDeSms sms = new EmissorDeSms();
        EstimativaJavaDao dao = new EstimativaJavaDao();
        CriadorEstimativaJava criador = new CriadorEstimativaJava(sms, dao);

        EstimativaJava estimativa = criador.cria(tarefa);

        System.out.println("Resultado final da estimativa: " + estimativa);
    }
}
