package com.company;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class Panel extends JPanel {

    private int xAlimento;
    private int yAlimento;
    public int xRobo = 100, yRobo = 530, i = impia, i2 = impia2, xRobo2 = 100, yRobo2 = 530;
    public static int impia, impia2;
    public String istr = impiastr;
    public static String impiastr;
    public static String color, color2,colorT,colorT2;
    public static boolean verificar = false;

    public void setxAlimento(int xAlimento) {
        if (xAlimento == 0) {
            this.xAlimento = 115;
        }
        if (xAlimento == 1) {
            this.xAlimento = 215;
        }
        if (xAlimento == 2) {
            this.xAlimento = 315;
        }
        if (xAlimento == 3) {
            this.xAlimento = 415;
        }
        if (xAlimento == 4) {
            this.xAlimento = 515;
        }

    }

    public void setyAlimento(int yAlimento) {
        if (yAlimento == 0) {
            this.yAlimento = 515;
        }
        if (yAlimento == 1) {
            this.yAlimento = 415;
        }
        if (yAlimento == 2) {
            this.yAlimento = 315;
        }
        if (yAlimento == 3) {
            this.yAlimento = 215;
        }
        if (yAlimento == 4) {
            this.yAlimento = 115;
        }
    }


    public void mudarPosicaoRobo() {
        i = impia;
        if (i == 1) {
            if (yRobo != 130)

                yRobo = yRobo - 100;
        }
        if (i == 2) {
            if (yRobo != 530)
                yRobo = yRobo + 100;
        }
        if (i == 3) {
            if (xRobo != 500)
                xRobo = xRobo + 100;
        }
        if (i == 4) {
            if (xRobo != 100)
                xRobo = xRobo - 100;
        }

        repaint();

    }

    public void mudarPosicaoRobo2() {
        i2 = impia2;
        if (i2 == 1) {
            if (yRobo2 != 130)

                yRobo2 = yRobo2 - 100;
        }
        if (i2 == 2) {
            if (yRobo2 != 530)
                yRobo2 = yRobo2 + 100;
        }
        if (i2 == 3) {
            if (xRobo2 != 500)
                xRobo2 = xRobo2 + 100;
        }
        if (i2 == 4) {
            if (xRobo2 != 100)
                xRobo2 = xRobo2 - 100;
        }

        repaint();

    }

    public void mudarPosicaoRoboStr() {
        istr = impiastr;
        if (istr.equalsIgnoreCase("up")) {
            if (yRobo != 130)

                yRobo = yRobo - 100;
        }
        if (istr.equalsIgnoreCase("down")) {
            if (yRobo != 530)
                yRobo = yRobo + 100;
        }
        if (istr.equalsIgnoreCase("right")) {
            if (xRobo != 500)
                xRobo = xRobo + 100;
        }
        if (istr.equalsIgnoreCase("left")) {
            if (xRobo != 100)
                xRobo = xRobo - 100;
        }

        repaint();

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(75, 75, 75, 575);
        g2d.drawLine(175, 75, 175, 575);
        g2d.drawLine(275, 75, 275, 575);
        g2d.drawLine(375, 75, 375, 575);
        g2d.drawLine(475, 75, 475, 575);
        g2d.drawLine(575, 75, 575, 575);
        g2d.drawLine(75, 75, 575, 75);
        g2d.drawLine(75, 175, 575, 175);
        g2d.drawLine(75, 275, 575, 275);
        g2d.drawLine(75, 375, 575, 375);
        g2d.drawLine(75, 475, 575, 475);
        g2d.drawLine(75, 575, 575, 575);
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 20));

        if (color.equalsIgnoreCase("rosa")) {
            g2d.setColor(Color.pink);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "#FF1493";
        }
        if (color.equalsIgnoreCase("vermelho")) {
            g2d.setColor(Color.red);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "red";
        }
        if (color.equalsIgnoreCase("cinza")) {
            g2d.setColor(Color.gray);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "gray";
        }
        if (color.equalsIgnoreCase("amarelo")) {
            g2d.setColor(Color.yellow);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "yellow";
        }
        if (color.equalsIgnoreCase("laranja")) {
            g2d.setColor(Color.orange);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "orange";
        }
        if (color.equalsIgnoreCase("verde")) {
            g2d.setColor(Color.green);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "green";
        }
        if (color.equalsIgnoreCase("azul")) {
            g2d.setColor(Color.blue);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "blue";
        }
        if (color.equalsIgnoreCase("branco")) {
            g2d.setColor(Color.white);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "white";
        }
        if (color.equalsIgnoreCase("preto")) {
            g2d.setColor(Color.black);
            g2d.drawString("Robo", xRobo, yRobo);
            colorT = "black";
        }

        if (verificar == false) {
            if (color2.equalsIgnoreCase("rosa")) {
                g2d.setColor(Color.pink);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "#FF1493";
            }
            if (color2.equalsIgnoreCase("vermelho")) {
                g2d.setColor(Color.red);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "red";
            }
            if (color2.equalsIgnoreCase("cinza")) {
                g2d.setColor(Color.gray);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "gray";
            }
            if (color2.equalsIgnoreCase("amarelo")) {
                g2d.setColor(Color.yellow);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "yellow";
            }
            if (color2.equalsIgnoreCase("laranja")) {
                g2d.setColor(Color.orange);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "orange";
            }
            if (color2.equalsIgnoreCase("verde")) {
                g2d.setColor(Color.green);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "green";
            }
            if (color2.equalsIgnoreCase("azul")) {
                g2d.setColor(Color.blue);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "blue";
            }
            if (color2.equalsIgnoreCase("branco")) {
                g2d.setColor(Color.white);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "white";
            }
            if (color2.equalsIgnoreCase("preto")) {
                g2d.setColor(Color.black);
                g2d.drawString("Robo", xRobo2, yRobo2);
                colorT2 = "black";
            }
        }
        Ellipse2D.Double circle = new Ellipse2D.Double(xAlimento, yAlimento, 20, 20);
        g2d.setColor(Color.magenta);
        g2d.fill(circle);

    }


}