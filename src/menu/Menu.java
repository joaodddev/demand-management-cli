package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private String titulo;
    private List<OpcaoMenu> opcoes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Menu(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarOpcao(int codigo, String descricao, Acao acao) {
        opcoes.add(new OpcaoMenu(codigo, descricao, acao));
    }

    public void adicionarSubmenu(int codigo, String descricao, Menu submenu) {
        opcoes.add(new OpcaoMenu(codigo, descricao, submenu::executar));
    }

    private void exibir() {
        System.out.println("\n=== " + titulo + " ===");

        for (OpcaoMenu opcao : opcoes) {
            System.out.println(opcao.getCodigo() + " - " + opcao.getDescricao());
        }

        System.out.println("0 - Voltar/Sair");
    }

    private int lerOpcao() {
        while (true) {
            try {
                System.out.print("Escolha: ");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número.");
            }
        }
    }

    public void executar() {
        while (true) {
            exibir();

            int escolha = lerOpcao();

            if (escolha == 0) {
                break;
            }

            boolean encontrada = false;

            for (OpcaoMenu opcao : opcoes) {
                if (opcao.getCodigo() == escolha) {
                    opcao.executar();
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                System.out.println("Opção inválida!");
            }
        }
    }
}