package EngProjeto.farmacia.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PaginaNaoEncontradaException extends RuntimeException{
    private static final long serialVersionID = 1L;

    public PaginaNaoEncontradaException(String message) {
        super(message);
    }
}
