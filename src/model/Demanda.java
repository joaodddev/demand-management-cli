package model;

import java.time.LocalDate;

public class Demanda {

    private String titulo;
    private String responsavel;
    private String prioridade;
    private LocalDate dataFim;

    public Demanda(String titulo, String responsavel, String prioridade, LocalDate dataFim) {
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.dataFim = dataFim;
    }

    public String toCSV() {
        return titulo + ";" + responsavel + ";" + prioridade + ";" + dataFim;
    }

    public static Demanda fromCSV(String linha) {
        String[] partes = linha.split(";");
        return new Demanda(
            partes[0],
            partes[1],
            partes[2],
            LocalDate.parse(partes[3])
        );
    }

    @Override
    public String toString() {
        return titulo + " | " + responsavel + " | " + prioridade + " | " + dataFim;
    }
}