package util;

import java.time.LocalDateTime;

public class Logger {

    public static void info(String mensagem) {
        System.out.println(
            Cores.AZUL + "[INFO] " +
            LocalDateTime.now() + " - " +
            mensagem + Cores.RESET
        );
    }

    public static void sucesso(String mensagem) {
        System.out.println(Cores.VERDE + "[OK] " + mensagem + Cores.RESET);
    }

    public static void erro(String mensagem) {
        System.out.println(Cores.VERMELHO + "[ERRO] " + mensagem + Cores.RESET);
    }
}