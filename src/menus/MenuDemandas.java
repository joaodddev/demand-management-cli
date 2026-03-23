package menus;

import menu.Menu;
import model.Demanda;
import repository.DemandaRepository;
import util.InputHelper;
import util.Logger;

import java.time.LocalDate;

public class MenuDemandas {

    public static Menu criar() {

        Menu menu = new Menu("DEMANDAS");
        DemandaRepository repo = new DemandaRepository();

        menu.adicionarOpcao(1, "Criar demanda", () -> {
            Logger.info("Usuário acessou: Criar demanda");

            String titulo = InputHelper.lerString("Título: ");
            String resp = InputHelper.lerString("Responsável: ");
            String prioridade = InputHelper.lerString("Prioridade: ");
            String data = InputHelper.lerString("Data fim (YYYY-MM-DD): ");

            Demanda d = new Demanda(
                titulo,
                resp,
                prioridade,
                LocalDate.parse(data)
            );

            repo.salvar(d);
            Logger.sucesso("Demanda salva!");
        });

        menu.adicionarOpcao(2, "Listar demandas", () -> {
            Logger.info("Usuário acessou: Listar demandas");

            repo.listar().forEach(System.out::println);
        });

        return menu;
    }
}