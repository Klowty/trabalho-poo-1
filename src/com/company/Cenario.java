package com.company;

import javax.swing.*;
import java.awt.*;

public class Cenario extends JFrame {

    Panel painel;

    public Cenario(int x1, int y1) {
        setSize(715, 715);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);

        painel = new Panel();
        painel.setxAlimento(x1);
        painel.setyAlimento(y1);
        add(painel);

        painel.setBackground(Color.LIGHT_GRAY);
        painel.setVisible(true);
    }

    public void fazFuncionar() {
        painel.mudarPosicaoRobo();
    }

    public void fazFuncionarstr() {
        painel.mudarPosicaoRoboStr();
    }

    public void fazFuncionar2() {
        painel.mudarPosicaoRobo2();
    }
}