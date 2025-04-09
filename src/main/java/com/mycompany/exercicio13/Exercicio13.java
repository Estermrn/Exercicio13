package com.mycompany.exercicio13;

import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {

        double calculo;
        double salariob = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário: "));
        double valorp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));

        calculo = salariob * 0.3;

        if (valorp <= calculo) {
            JOptionPane.showMessageDialog(null, "Empréstimo concedido! ");

        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo não concedido! ");
        }

    }
}
