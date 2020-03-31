package com.company;

import java.util.Random;

public class Robo {
    protected int x;
    protected int y;
    protected boolean encontrou;
    private String cor;

    Random gerador = new Random();

    public Robo(String cor) {
        this.cor = cor;
        this.x = 0;
        this.y = 0;
        this.encontrou = false;
    }

    public boolean encontrado() {
        this.encontrou = true;
        System.out.println("|=-=-=-{ Achei! }-=-=-=|");
        return this.encontrou;

    }

    public void mover(String mov) {
        try {
            if (mov.equalsIgnoreCase("up")) {
                if (y >= 4) {
                    throw new MovimentoInvalidoException();
                } else {
                    this.y++;
                }
            }
            if (mov.equalsIgnoreCase("down")) {
                if (y <= 0)
                    throw new MovimentoInvalidoException();
                else
                    this.y--;
            }
            if (mov.equalsIgnoreCase("right")) {
                if (x >= 4) {
                    throw new MovimentoInvalidoException();
                } else {
                    this.x++;
                }
            }
            if (mov.equalsIgnoreCase("left")) {
                if (x <= 0)
                    throw new MovimentoInvalidoException();
                else
                    this.x--;
            }
        } catch (MovimentoInvalidoException e) {
            e.printStackTrace();

        }
        System.out.println("(" + this.getCor() + ") Posicao atual: (" + this.x + "," + this.y + ")");


    }

    public void mover(int mov) {
        try {
            if (mov == 1) {
                if (y >= 4) {
                    throw new MovimentoInvalidoException();
                } else {
                    this.y++;
                }
            }
            if (mov == 2) {
                if (y <= 0)
                    throw new MovimentoInvalidoException();
                else
                    this.y--;
            }
            if (mov == 3) {
                if (x >= 4) {
                    throw new MovimentoInvalidoException();
                } else {
                    this.x++;
                }
            }
            if (mov == 4) {
                if (x <= 0)
                    throw new MovimentoInvalidoException();
                else
                    this.x--;
            }
        } catch (MovimentoInvalidoException e) {
            e.printStackTrace();

        }
        System.out.println("(" + this.getCor() + ") Posicao atual: (" + this.x + "," + this.y + ")");

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCor() {
        return cor;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}