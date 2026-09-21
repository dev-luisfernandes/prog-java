package br.com.fiap.main;

import br.com.fiap.entities.MediaSemestral;

import javax.swing.*;

public class TesteMediaSemestral {

    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        MediaSemestral ms = new MediaSemestral();

        ms.setCp1(real("CP1"));
        ms.setCp2(real("CP2"));
        ms.setSprint1(real("Sprint1"));
        ms.setSprint2(real("Sprint2"));
        ms.setGs(real("Global Solution"));

        System.out.println(ms);
    }
}
