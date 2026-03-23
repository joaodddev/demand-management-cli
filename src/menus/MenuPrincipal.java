package menus;

import menu.Menu;

public class MenuPrincipal {

    public static Menu criar() {

        Menu principal = new Menu("SISTEMA");

        principal.adicionarSubmenu(1, "Gerenciar Demandas", MenuDemandas.criar());
        principal.adicionarSubmenu(2, "Relatórios", MenuRelatorios.criar());

        return principal;
    }
}