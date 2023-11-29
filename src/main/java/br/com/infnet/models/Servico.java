package br.com.infnet.models;
import java.time.LocalDateTime;

public class Servico {
    private String local;
    private double valor;
    private LocalDateTime dataHoraCotacao;
    private LocalDateTime dataHoraExecucao;
    private String avaliacao;

    public Servico(String local, double valor, LocalDateTime dataHoraCotacao, LocalDateTime dataHoraExecucao, String avaliacao) {
        this.local = local;
        this.valor = valor;
        this.dataHoraCotacao = dataHoraCotacao;
        this.dataHoraExecucao = dataHoraExecucao;
        this.avaliacao = avaliacao;
    }

    public void avaliar(){

    }

    public void informarObservacos(String info){

    }
}
