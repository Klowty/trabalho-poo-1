package com.company;

public class MovimentoInvalidoException extends Exception {

    public MovimentoInvalidoException() {
        super("Não foi possível realizar o movimento");

    }
}