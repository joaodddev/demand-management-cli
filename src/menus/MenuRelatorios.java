package menus;

import menu.Menu;
import util.Logger;

public class MenuRelatorios {

    public static Menu criar() {

        Menu menu = new Menu("RELATÓRIOS");

        menu.adicionarOpcao(1, "Relatório geral", () -> {
            Logger.info("Gerando relatório...");
            System.out.println(">>> Relatório...");
        });

        return menu;
    }
}