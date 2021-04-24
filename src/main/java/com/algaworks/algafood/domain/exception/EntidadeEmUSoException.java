package com.algaworks.algafood.domain.exception;

public class EntidadeEmUSoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public  EntidadeEmUSoException(String mensagem) {
        super(mensagem);
    }
}
