package menus;

import menu.Menu;
import util.Logger;

public class MenuDemandas {

    public static Menu criar() {

        Menu menu = new Menu("DEMANDAS");

        menu.adicionarOpcao(1, "Criar demanda", () -> {
            Logger.info("Usuário acessou: Criar demanda");
            System.out.println(">>> Criando demanda...");
        });

        menu.adicionarOpcao(2, "Listar demandas", () -> {
            Logger.info("Usuário acessou: Listar demandas");
            System.out.println(">>> Listando demandas...");
        });

        return menu;
    }
}