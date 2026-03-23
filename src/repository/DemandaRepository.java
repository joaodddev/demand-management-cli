package repository;

import model.Demanda;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemandaRepository {

    private final String FILE = "demandas.csv";

    public void salvar(Demanda demanda) {
        try (FileWriter fw = new FileWriter(FILE, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(demanda.toCSV());
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Erro ao salvar!");
        }
    }

    public List<Demanda> listar() {
        List<Demanda> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(Demanda.fromCSV(linha));
            }

        } catch (IOException e) {
            // arquivo pode não existir ainda
        }

        return lista;
    }
}