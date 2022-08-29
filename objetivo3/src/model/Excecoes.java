package model;

public class Excecoes {
    public static class EstoqueInsuficienteException extends RuntimeException {

        public EstoqueInsuficienteException() {
            super("Estoque insuficiente!");
        }
    }
}
