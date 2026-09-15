package br.com.valueprojects.infra;

import br.com.valueprojects.dominio.EstimativaJava;

public class EmissorDeSms {

    public void emitirSms(EstimativaJava estJava) {
        System.out.println("SMS enviado com a estimativa: " + estJava);
    }
}
