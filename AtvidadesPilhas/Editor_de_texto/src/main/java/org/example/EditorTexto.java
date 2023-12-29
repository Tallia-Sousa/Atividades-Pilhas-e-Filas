package org.example;

import java.util.Scanner;

public class EditorTexto {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite comandos (usar # para backspace, @ para apagar tudo): ");
        String comando = scanner.nextLine();

        String resultadoF = editorTexto(comando);
        System.out.println("Resultado Final: " + resultadoF);
        scanner.close();
}
public static String editorTexto(String cmd) {
    StringBuilder resultado = new StringBuilder();

    for (char comando : cmd.toCharArray()) {
        if (comando == '#') {
            if (resultado.length() > 0) {
                resultado.deleteCharAt(resultado.length() - 1);
            }
        } else if (comando == '@') {
            resultado = new StringBuilder();
        } else {
            resultado.append(comando);
        }
    }
    return resultado.toString();
}
}

