package br.com.fiap.main;

import javax.swing.*;

public class TesteExcecao {

    // inteiro
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // real
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        try {
            int dividendo = inteiro("Informe o numero do dividendo");
            int divisor = inteiro("Informe o numero do divisor");

            int resultado = dividendo / divisor;

            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro com numeros inteiros, dividendo dividido por 0");
        }
    }
}
