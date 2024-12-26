package org.example.exceptions;

public class EmpleadoNoEncontradoException extends Exception {

    public EmpleadoNoEncontradoException() {

    }

    public EmpleadoNoEncontradoException(String mensaje) {

        super(mensaje);
    }
}
