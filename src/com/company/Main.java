package com.company;

import javax.swing.JOptionPane;

import static com.company.Panel.*;

public class Main {
    public static void main(String[] args) {
        int x1;
        int y1;
        String str;
        boolean foodError = false;
        verificar=true;
          String cor = JOptionPane.showInputDialog("Qual a cor do robô?");

        Robo r1 = new Robo(cor);
        color = cor;

        do {
            str = JOptionPane.showInputDialog("Qual a posição do alimento no eixo x?");
            x1 = Integer.parseInt(str);
            try {
                if (x1 > 4)
                    throw new ValorInvalidoException();

                else
                    foodError = true;

            } catch (ValorInvalidoException v) {
                v.printStackTrace();
            }
        }while (foodError != true);
        foodError = false;
        do {
            str = JOptionPane.showInputDialog("e no eixo y?");
            y1 = Integer.parseInt(str);
            try {
                if (y1 > 4)
                    throw new ValorInvalidoException();
                else
                    foodError = true;
            } catch (ValorInvalidoException v) {
                v.printStackTrace();
            }
        }

        while (foodError != true);
        Cenario cen = new Cenario(x1, y1);

        while (r1.getX() != x1 || r1.getY() != y1) {
            str = JOptionPane.showInputDialog("Movimento do robô (up, down, left, right ou 1, 2, 3, 4 respectivamente)");
            if (str.matches("[0-9]*")) {
                int i = Integer.parseInt(str);
                r1.mover(i);
                impia = i;
                cen.fazFuncionar();

            } else {

                r1.mover(str);
                impiastr = str;
                cen.fazFuncionarstr();
            }
        }
        r1.encontrado();
        System.exit(0);

    }
}