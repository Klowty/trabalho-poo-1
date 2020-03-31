package com.company;

import java.util.Random;
import java.util.Scanner;

import static com.company.Panel.*;

public class Main3 {

    public static void main(String[] args) {

        int x1;
        int y1;
        int passos1 = 0;
        int passos2 = 0;
        String str;
        boolean foodError = false;
        Random generator = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cor do robo: ");
        String cor = teclado.next();
        Robo r1 = new Robo(cor);
        color = cor;

        System.out.println("Cor do robo inteligente: ");
        String cor2 = teclado.next();
        Robo r2 = new ReboInteligente(cor2);
        color2 = cor2;

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
        }while (foodError != true);

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

        while ((r1.getX() != x1 || r1.getY() != y1) || (r2.getX() != x1 || r2.getY() != y1)) {
            int aux1, aux2;
            aux1 = generator.nextInt(4);
            impia = aux1 + 1;
            cen.fazFuncionar();
            aux2 = generator.nextInt(4);
            impia2 = aux2 + 1;
            cen.fazFuncionar2();
            r1.mover(aux1 + 1);
            passos1++;
            r2.mover(aux2 + 1);
            passos2++;
            if ((r1.getX() == x1 && r1.getY() == y1)) {
                System.out.println("|=-=-{ Robô " + r1.getCor() + " }-=-=| encontrou com " + passos1 + " passos.");
                System.out.println("|=-=-{ Robô " + r2.getCor() + " }-=-=| deu " + passos2 + " passos e não encontrou o alimento.");
                break;
            }
            if (r2.getX() == x1 && r2.getY() == y1) {
                System.out.println("|=-=-{ Robô " + r2.getCor() + " }-=-=| encontrou com " + passos2 + " passos.");
                System.out.println("|=-=-{ Robô " + r1.getCor() + " }-=-=| deu " + passos1 + " passos e não encontrou o alimento.");
                break;
            }


        }


    }
}