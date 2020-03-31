package com.company;

import java.util.Scanner;

import static com.company.Panel.*;

public class Main {
    public static void main(String[] args) {
        int x1;
        int y1;
        String str;
        boolean foodError = false;
        verificar=true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cor do robo: ");
        String cor = teclado.next();

        Robo r1 = new Robo(cor);
        color = cor;

        do {
            System.out.println("Posição do alimento no eixo x: ");
            x1 = teclado.nextInt();
            try {
                if (x1 > 4)
                    throw new ValorInvalidoException();

                else
                    foodError = true;

            } catch (ValorInvalidoException v) {
                v.printStackTrace();
            }
        }

        while (foodError != true);
        foodError = false;
        do {
            System.out.println("Posição do alimento no eixo y: ");
            y1 = teclado.nextInt();
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
        System.out.println("Movimento do robô: ");


        while (r1.getX() != x1 || r1.getY() != y1) {
            str = teclado.next();
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