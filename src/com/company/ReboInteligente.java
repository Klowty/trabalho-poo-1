package com.company;

public class ReboInteligente extends Robo {
    private boolean tentativa;

    public ReboInteligente(String cor) {
        super(cor);
        tentativa = false;
    }

    @Override
    public void mover(int mov) {
        try {
            if (mov == 1) {
                if (y >= 4 && tentativa == false) {
                    tentativa = true;
                    throw new MovimentoInvalidoException();
                } else if (y >= 4 && tentativa == true) {
                    this.y--;
                    tentativa = false;
                } else {
                    this.y++;
                }
            }
            if (mov == 2) {
                if (y <= 0 && tentativa == false) {
                    tentativa = true;
                    throw new MovimentoInvalidoException();
                } else if (y <= 0 && tentativa == true) {
                    this.y++;
                    tentativa = false;
                } else {
                    this.y--;
                }
            }
            if (mov == 3) {
                if (x >= 4 && tentativa == false) {
                    tentativa = true;
                    throw new MovimentoInvalidoException();
                } else if (x >= 4 && tentativa == true) {
                    this.x--;
                    tentativa = false;
                } else {
                    this.x++;
                }
            }
            if (mov == 4) {
                if (x <= 0 && tentativa == false) {
                    tentativa = true;
                    throw new MovimentoInvalidoException();
                } else if (x <= 0 && tentativa == true) {
                    this.x++;
                    tentativa = false;
                } else {
                    this.x--;
                }
            }
        } catch (MovimentoInvalidoException e) {
            e.printStackTrace();
            tentativa = true;

        }
        System.out.println("(" + this.getCor() + ") Posicao atual: (" + this.x + "," + this.y + ")");

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}